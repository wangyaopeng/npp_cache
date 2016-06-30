/*
* @(#)ClusterCacheManagerActionRemoveAll.java 1.0 2015-5-29
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@jd.com
*/
package com.wangyin.npp.trade.cache.manager;

import org.slf4j.LoggerFactory;

import com.wangyin.npp.trade.cache.CacheApi;

/**
 * The Class ClusterCacheManagerActionRemoveAll.
 *
 * @author qiaoshaohua1 2015-5-29
 * @version 1.0
 * @since 1.0
 */
public class ClusterCacheManagerActionRemoveAll implements ClusterCacheManagerAction{
	
	/** The logger. */
	org.slf4j.Logger LOGGER=LoggerFactory.getLogger(getClass());
	
	/** The cache api. */
	private CacheApi cacheApi;
	
	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.manager.ClusterCacheManagerAction#execute(com.wangyin.npp.trade.cache.manager.CacheManagerData)
	 */
	
	public void execute(CacheManagerData data) throws Exception {
		LOGGER.info("removeAll cache execute start");
		cacheApi.clear();
		LOGGER.info("removeAll cache execute end");
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
