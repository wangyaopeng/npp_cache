/*
* @(#)CacheApi.java 1.0 2015年5月11日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@jd.com
*/
package com.wangyin.npp.trade.cache;

/**
 * Interface that defines the common cache operations.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public interface CacheApi {

	/** default cache timeout 永久有效 单位:秒. */
	long DEFAULT_EXP = 0;
	
	/**
	 * Return the cache name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Return the the underlying native cache provider.
	 *
	 * @return the native cache
	 */
	Object getNativeCache();
    
	/**
	 * Put.
	 *
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 * @param exp
	 *            the exp
	 */
	void put(Object key, Object value, long exp);
	
	/**
	 * Put.
	 *
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 * @param exp
	 *            the exp
	 */
	void put(Object key, Object value);
    
    
    /**
	 * Gets the.
	 *
	 * @param key
	 *            the key
	 * @return the value wrapper
	 */
    ValueWrapper get(Object key);
    
    /**
	 * Del.
	 *
	 * @param key
	 *            the key
	 * @return true, if successful
	 */
    void remove(Object key);
    
    /**
	 * Remove all mappings from the cache.
	 */
	void clear();
	
	/**
	 * A (wrapper) object representing a cache value.
	 *
	 * @author qiaoshaohua1 2015-5-11
	 * @version 1.0
	 * @since 1.0
	 */
	public interface ValueWrapper {

		/**
		 * Return the actual value in the cache.
		 *
		 * @return the object
		 */
		Object get();
	}
}
