/*
 * @(#)EhCacheCache.java 1.0 2015年5月11日
 *
 * Copyright 2009 jdjr payment All Rights Reserved.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Author Email: qiaoshaohua1@chinabank.com.cn
 */
package com.wangyin.npp.trade.cache.ehcache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import com.wangyin.npp.trade.cache.CacheApi;
import com.wangyin.npp.trade.cache.support.SimpleValueWrapper;

/**
 * EhCacheCache implementation CacheApi.
 * 
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class EhCacheCache implements CacheApi {
	
	/** The cache. */
	private final Ehcache cache;
	
	/** The defalut ehcache name. */
	private final String DEFALUT_EHCACHE_NAME = "default";
	/**
	 * Instantiates a new eh cache cache.
	 *
	 * @param ehcacheName
	 *            the ehcache name
	 */
	public EhCacheCache() {
		cache = CacheManager.create().getEhcache(DEFALUT_EHCACHE_NAME);
		if(cache == null)
			throw new IllegalArgumentException("ehcacheName:"+DEFALUT_EHCACHE_NAME+" not found.");
	}
	
	/**
	 * Instantiates a new eh cache cache.
	 *
	 * @param ehcacheName
	 *            the ehcache name
	 */
	public EhCacheCache(String ehcacheName) {
		if(ehcacheName == null || ehcacheName.trim().length()==0){
			ehcacheName = DEFALUT_EHCACHE_NAME;
		}
		cache = CacheManager.create().getEhcache(ehcacheName);
		if(cache == null)
			throw new IllegalArgumentException("ehcacheName:"+ehcacheName+" not found.");
	}

	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.CacheApi#getName()
	 */
	public String getName() {
		return this.cache.getName();
	}

	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.CacheApi#getNativeCache()
	 */
	public Ehcache getNativeCache() {
		return this.cache;
	}

	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.CacheApi#get(java.lang.Object)
	 */
	public ValueWrapper get(Object key) {
		Element element = this.cache.get(key);
		return (element != null ? new SimpleValueWrapper(
				element.getObjectValue()) : null);
	}
	
	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.CacheApi#put(java.lang.Object, java.lang.Object)
	 */
	public void put(Object key, Object value) {
		this.cache.put(new Element(key, value));
	}

	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.CacheApi#clear()
	 */
	public void clear() {
		this.cache.removeAll();
	}

	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.CacheApi#put(java.lang.Object, java.lang.Object, long)
	 */
	
	public void put(Object key, Object value, long exp) {
		put(key, value);
	}

	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.CacheApi#del(java.lang.Object)
	 */
	
	public void remove(Object key) {
		this.cache.remove(key);
	}

}
