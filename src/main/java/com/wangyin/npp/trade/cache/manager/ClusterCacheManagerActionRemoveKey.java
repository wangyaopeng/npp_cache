/*
* @(#)ClusterCacheManagerActionRemoveKey.java 1.0 2015年5月21日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wangyin.npp.trade.cache.CacheApi;

/**
 * cache remove key action.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class ClusterCacheManagerActionRemoveKey implements ClusterCacheManagerAction{
	Logger LOGGER=LoggerFactory.getLogger(getClass());
	private CacheApi cacheApi;
	/* (non-Javadoc)
	 * @see com.wangyin.npp.trade.cache.manager.ClusterCacheManagerAction#execute(java.lang.Object)
	 */
	public void execute(CacheManagerData data) throws Exception {
		String key = data.getCacheKey();
		LOGGER.info("removeKey cache execute start key:",key);
		cacheApi.remove(key);
		LOGGER.info("removeKey cache execute end key:",key);
	}
	public void setCacheApi(CacheApi cacheApi) {
		this.cacheApi = cacheApi;
	}
	
}
