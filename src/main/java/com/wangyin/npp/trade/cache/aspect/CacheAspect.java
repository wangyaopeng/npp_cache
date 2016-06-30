/*
 * @(#)CacheAspect.java 1.0 2015-5-26
 *
 * Copyright 2009 jdjr payment All Rights Reserved.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Author Email: qiaoshaohua1@jd.com
 */
package com.wangyin.npp.trade.cache.aspect;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wangyin.npp.trade.cache.CacheApi;
import com.wangyin.npp.trade.cache.CacheApi.ValueWrapper;
import com.wangyin.npp.trade.cache.config.CacheConfig;
import com.wangyin.npp.trade.cache.config.CacheSwitchEnum;

/**
 * The Class CacheAspect.
 *
 * @author qiaoshaohua1 2015-5-26
 * @version 1.0
 * @since 1.0
 */
@Aspect
public class CacheAspect {

	/** The cache api. */
	private CacheApi cacheApi;

	/** The logger. */
	Logger LOGGER=LoggerFactory.getLogger(getClass());

	/**
	 * Do monitor logging.
	 *
	 * @param pjp
	 *            the pjp
	 * @param cached
	 *            the cached
	 * @return the object
	 * @throws Throwable
	 *             the throwable
	 */
	@Around(value = "execution(* *(..)) && @annotation(cached)", argNames = "pjp,cached")
	public Object doCacheProxy(final ProceedingJoinPoint pjp, Cached cached)
			throws Throwable {
		Object value = null;
		if (CacheSwitchEnum.OPEN.getCode() == CacheConfig.catchSwitch) {
			String keyPrefix = cached.prefix();
			value = get(pjp.getArgs(), keyPrefix);
			if(value!=null){
				return value;
			}
			value = pjp.proceed();
			put(pjp.getArgs(), keyPrefix, value);
			return value;
		}
		return pjp.proceed();

	}

	/**
	 * Do cache get.
	 *
	 * @param pjp
	 *            the pjp
	 * @param cacheGet
	 *            the cache get
	 * @return the object
	 * @throws Throwable
	 *             the throwable
	 */
	@Around(value = "execution(* *(..)) && @annotation(cacheGet)", argNames = "pjp,cacheGet")
	public Object doCacheGet(final ProceedingJoinPoint pjp, CacheGet cacheGet)
			throws Throwable {
		Object value = null;
		if (CacheSwitchEnum.OPEN.getCode() == CacheConfig.catchSwitch) {
			String keyPrefix = cacheGet.prefix();
			value = get(pjp.getArgs(), keyPrefix);
			if(value!=null){
				return value;
			}
		}
		return pjp.proceed();
	}

	/**
	 * Do cache put.
	 *
	 * @param pjp
	 *            the pjp
	 * @param cachePut
	 *            the cache put
	 * @param returnValue
	 *            the return value
	 * @throws Throwable
	 *             the throwable
	 */
	@AfterReturning(value = "execution(* *(..)) && @annotation(cachePut)", argNames = "pjp,cachePut,returnValue", returning = "returnValue")
	public void doCachePut(final JoinPoint pjp, CachePut cachePut,
			Object returnValue) throws Throwable {
		if (CacheSwitchEnum.CLOSE.getCode() == CacheConfig.catchSwitch) {
			return;
		}
		if (returnValue == null)
			return;
		String keyPrefix = cachePut.prefix();
		put(pjp.getArgs(), keyPrefix, returnValue);
	}
	
	/**
	 * Put.
	 *
	 * @param args
	 *            the args
	 * @param keyPrefix
	 *            the key prefix
	 * @param value
	 *            the value
	 */
	private void put(Object[] args,String keyPrefix,Object value){
		Object key = null;
		try {
			Object businessId = args[0];
			key = getCacheKey(keyPrefix, businessId);
			cacheApi.put(key, value);
			if(LOGGER.isDebugEnabled()){
				LOGGER.debug("key:", key, ",put cache value:",value);
			}
			LOGGER.info("key:", key, ",put cache");
		} catch (Exception e) {
			//
			LOGGER.error("key:", key, ",get cache exception:", e);
		}
	}
	
	/**
	 * Gets the.
	 *
	 * @param args
	 *            the args
	 * @param keyPrefix
	 *            the key prefix
	 * @return the object
	 */
	private Object get(Object[] args,String keyPrefix){
		Object key = null;
		Object value = null;
		try {
			Object businessId = args[0];
			key = getCacheKey(keyPrefix, businessId);
			ValueWrapper vw = cacheApi.get(key);
			value = vw == null ? null : vw.get();
			if (value != null) {
				LOGGER.info("key:", key, ",get value from cache");
				if(LOGGER.isDebugEnabled()){
					LOGGER.debug("key:", key, ",get cache value:",value);
				}
				
				return value;
			}
		} catch (Exception e) {
			//
			LOGGER.error("key:", key, ",get cache exception:", e);
		}
		return null;
	}
	
	/**
	 * Gets the cache key.
	 *
	 * @param keyPrefix
	 *            the key prefix
	 * @param businessId
	 *            the business id
	 * @return the cache key
	 */
	private Object getCacheKey(String keyPrefix , Object businessId){
		Object key = null;
		if(StringUtils.isNotEmpty(keyPrefix) && businessId instanceof String){
			key = keyPrefix + "_" + businessId;
		}else{
			key = businessId;
		}
		return key;
	}
	/**
	 * Sets the cache api.
	 *
	 * @param cacheApi
	 *            the new cache api
	 */
	public void setCacheApi(CacheApi cacheApi) {
		this.cacheApi = cacheApi;
	}

}
