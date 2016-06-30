/*
* @(#)EhcacheListener.java 1.0 2015年5月25日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.listener;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerAdapter;

/**
 * TODO.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class EhcacheListener extends CacheEventListenerAdapter {
	public static final CacheEventListener INSTANCE = new EhcacheListener(); 
	@Override
	public void notifyElementExpired(Ehcache cache, Element element) {
		// TODO Auto-generated method stub
		System.out.println(element.getObjectKey()+" 过期");
	}
	/* (non-Javadoc)
	 * @see net.sf.ehcache.event.CacheEventListener#notifyElementRemoved(net.sf.ehcache.Ehcache, net.sf.ehcache.Element)
	 */
	@Override
	public void notifyElementRemoved(Ehcache cache, Element element)
			throws CacheException {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see net.sf.ehcache.event.CacheEventListener#notifyElementPut(net.sf.ehcache.Ehcache, net.sf.ehcache.Element)
	 */
	@Override
	public void notifyElementPut(Ehcache cache, Element element)
			throws CacheException {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see net.sf.ehcache.event.CacheEventListener#notifyElementUpdated(net.sf.ehcache.Ehcache, net.sf.ehcache.Element)
	 */
	@Override
	public void notifyElementUpdated(Ehcache cache, Element element)
			throws CacheException {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see net.sf.ehcache.event.CacheEventListener#notifyElementEvicted(net.sf.ehcache.Ehcache, net.sf.ehcache.Element)
	 */
	@Override
	public void notifyElementEvicted(Ehcache cache, Element element) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see net.sf.ehcache.event.CacheEventListener#notifyRemoveAll(net.sf.ehcache.Ehcache)
	 */
	@Override
	public void notifyRemoveAll(Ehcache cache) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see net.sf.ehcache.event.CacheEventListener#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	
	

}
