/*
* @(#)Zktest1.java 1.0 2015年5月13日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.zk;

import org.I0Itec.zkclient.ZkClient;

import com.wangyin.npp.trade.cache.manager.ZkNodeListener;

/**
 * TODO.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class Zktest2 {
	public static void main(String[] args) {
		ZkClient zkClient = new ZkClient("localhost:2181");
		zkClient.writeData(ZkNodeListener.PATH, "222222");
//		System.out.println("new data:"+zkClient.readData(ZkNodeListener.PATH));
	}
}
