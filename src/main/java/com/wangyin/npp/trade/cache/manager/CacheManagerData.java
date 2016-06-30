/*
* @(#)CacheManagerVo.java 1.0 2015年5月27日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.manager;
/**
 * cache manager value object.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class CacheManagerData implements java.io.Serializable{
	

	/** 
	* @Fields serialVersionUID :  
	*/ 
	private static final long serialVersionUID = -4625734160820765692L;

	/** The action type. */
	private String actionType;
	
	/** The cache key. */
	private String cacheKey;
	
	/** The cache switch. */
	private int cacheSwitch;
	
	/**
	 * Gets the action type.
	 *
	 * @return the action type
	 */
	public String getActionType() {
		return actionType;
	}
	
	/**
	 * Sets the action type.
	 *
	 * @param actionType
	 *            the new action type
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	/**
	 * Gets the cache key.
	 *
	 * @return the cache key
	 */
	public String getCacheKey() {
		return cacheKey;
	}
	
	/**
	 * Sets the cache key.
	 *
	 * @param cacheKey
	 *            the new cache key
	 */
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}
	
	/**
	 * Gets the cache switch.
	 *
	 * @return the cache switch
	 */
	public int getCacheSwitch() {
		return cacheSwitch;
	}
	
	/**
	 * Sets the cache switch.
	 *
	 * @param cacheSwitch
	 *            the new cache switch
	 */
	public void setCacheSwitch(int cacheSwitch) {
		this.cacheSwitch = cacheSwitch;
	}

	@Override
	public String toString() {
		return "CacheManagerData [actionType=" + actionType + ", cacheKey="
				+ cacheKey + ", cacheSwitch=" + cacheSwitch + "]";
	}
}
