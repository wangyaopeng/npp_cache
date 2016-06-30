/*
* @(#)ClusterCacheManagerAction.java 1.0 2015年5月20日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.manager;

/**
 * The Interface ClusterCacheManagerAction.
 *
 * @author qiaoshaohua1 2015-5-21
 * @version 1.0
 * @since 1.0
 */
public interface ClusterCacheManagerAction {
	
	/**
	 * Execute.
	 *
	 * @param data
	 *            the data
	 */
	public void execute(CacheManagerData data) throws Exception;
	
}
