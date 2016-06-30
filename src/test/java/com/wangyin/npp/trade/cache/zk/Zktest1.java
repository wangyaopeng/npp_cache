/*
* @(#)Zktest1.java 1.0 2015年5月13日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.zk;

import com.wangyin.npp.trade.cache.manager.ZkNodeListener;

/**
 * TODO.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class Zktest1 {
	public static void main(String[] args) {
		ZkNodeListener.testzkClient("localhost:2181");
		while(true){
			
		}
	}
}
