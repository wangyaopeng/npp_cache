/*
* @(#)EhcacheListenerFactory.java 1.0 2015年5月25日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.listener;

import java.util.Properties;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;

/**
 * TODO.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class EhcacheListenerFactory extends CacheEventListenerFactory {

	/* (non-Javadoc)
	 * @see net.sf.ehcache.event.CacheEventListenerFactory#createCacheEventListener(java.util.Properties)
	 */
	@Override
	public CacheEventListener createCacheEventListener(Properties properties) {
		// TODO Auto-generated method stub
		return EhcacheListener.INSTANCE;
	}

}
