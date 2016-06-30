/*
* @(#)ClusterCacheConsistencyManager.java 1.0 2015年5月26日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.manager;
/**
 * 应用集群缓存一致性管理接口.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public interface ClusterCacheConsistencyManager {
	
	/**
	 * Listener.
	 */
	public void listener();
	
	/**
	 * Process.
	 *
	 * @param data
	 *            the data
	 * @throws Exception
	 *             the exception
	 */
	public void process(Object data) throws Exception;
}
