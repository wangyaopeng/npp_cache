/*
 * @(#)ClusterCacheManagerActionCacheSwitch.java 1.0 2015-5-27
 *
 * Copyright 2009 jdjr payment All Rights Reserved.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Author Email: qiaoshaohua1@jd.com
 */
package com.wangyin.npp.trade.cache.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wangyin.npp.trade.cache.config.CacheConfig;
import com.wangyin.npp.trade.cache.config.CacheSwitchEnum;

/**
 * The Class ClusterCacheManagerActionCacheSwitch.
 *
 * @author qiaoshaohua1 2015-5-27
 * @version 1.0
 * @since 1.0
 */
public class ClusterCacheManagerActionCacheSwitch implements
		ClusterCacheManagerAction {

	/** The logger. */
	Logger LOGGER=LoggerFactory.getLogger(getClass());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wangyin.npp.trade.cache.manager.ClusterCacheManagerAction#execute
	 * (java.lang.Object)
	 */
	
	public void execute(CacheManagerData data) throws Exception {
		int cacheSwitch = data.getCacheSwitch();
		try {
			CacheSwitchEnum cacheSwitchEnum = CacheSwitchEnum
					.getEnum(cacheSwitch);
			if (cacheSwitchEnum != null) {
				CacheConfig.catchSwitch = cacheSwitchEnum.getCode();
				LOGGER.info(
						"#ClusterCacheManagerActionCacheSwitch execute success now switch:",
						cacheSwitch);
			} else {
				LOGGER.error(
						"#ClusterCacheManagerActionCacheSwitch execute cacheSwitch not match:",
						cacheSwitch);
			}
		} catch (Exception e) {
			LOGGER.error(
					"#ClusterCacheManagerActionCacheSwitch execute exception:",
					e, ",cacheSwitch:", cacheSwitch);
		}
	}
}
