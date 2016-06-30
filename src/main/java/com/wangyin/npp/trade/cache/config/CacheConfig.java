/*
* @(#)CacheConfig.java 1.0 2015-5-12
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@jd.com
*/
package com.wangyin.npp.trade.cache.config;

import java.util.Map;

import com.wangyin.npp.trade.cache.manager.ClusterCacheManagerAction;

/**
 * The Class CacheConfig.
 *
 * @author qiaoshaohua1 2015-5-12
 * @version 1.0
 * @since 1.0
 */
public class CacheConfig {
	
	/** The cluster cache manager actions. */
	private Map<String,ClusterCacheManagerAction> clusterCacheManagerActions = null;
	
	/** The cache switch 0 is close, 1 is open. */
	public static int catchSwitch = 0;
	/**
	 * Sets the cluster cache manager actions.
	 *
	 * @param clusterCacheManagerActions
	 *            the cluster cache manager actions
	 */
	public void setClusterCacheManagerActions(
			Map<String, ClusterCacheManagerAction> clusterCacheManagerActions) {
		this.clusterCacheManagerActions = clusterCacheManagerActions;
	}

	/**
	 * Gets the cluster cache manager actions.
	 *
	 * @return the cluster cache manager actions
	 */
	public Map<String, ClusterCacheManagerAction> getClusterCacheManagerActions() {
		return clusterCacheManagerActions;
	}

	public static void setCatchSwitch(int catchSwitch) {
		CacheConfig.catchSwitch = catchSwitch;
	}

 
}
