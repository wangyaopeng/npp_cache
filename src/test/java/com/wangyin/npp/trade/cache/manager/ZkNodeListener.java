/*
* @(#)ZkNodeListener.java 1.0 2015年5月13日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.manager;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

/**
 * TODO.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class ZkNodeListener {
	public static final String PATH = "/trade";
	public static void testzkClient(final String serverList) {
        ZkClient zkClient4subData = new ZkClient(serverList);
        if(!zkClient4subData.exists(PATH)){
        	zkClient4subData.create(PATH, "11111", CreateMode.EPHEMERAL);
        }
        zkClient4subData.subscribeDataChanges(PATH, new IZkDataListener() {
        	@Override
            public void handleDataChange(String dataPath, Object data) throws Exception {
                System.out.println("Data of " + dataPath + " has changed");
            }

            @Override
            public void handleDataDeleted(String dataPath) throws Exception {
                System.out.println(dataPath + " has deleted");
            }
        });
      
	}
    
}
