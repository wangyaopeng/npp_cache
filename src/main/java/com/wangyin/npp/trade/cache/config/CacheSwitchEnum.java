/*
* @(#)MessageActionTypeEnum.java 1.0 2015-5-21
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@jd.com
*/
package com.wangyin.npp.trade.cache.config;

/**
 * The Enum CacheSwitchEnum.
 *
 * @author qiaoshaohua1 2015-5-26
 * @version 1.0
 * @since 1.0
 */
public enum CacheSwitchEnum {
	
	/** The open. */
	OPEN(1, "开"), 
	
	/** The close. */
	CLOSE(0, "关"); 
  
    
    /** The code. */
    private int code;
    
    /** The desc. */
    private String desc = null;


    /**
     * 根据编码获取枚举.
     *
     * @param code 枚举定义的编码
     * @return 查找到的枚举
     */
    public static CacheSwitchEnum getEnum(int code) {
        for(CacheSwitchEnum a : CacheSwitchEnum.values()) {
            if (a.code== code) return a;
        }
        throw new IllegalArgumentException("No enum code '" + code + "'. " + CacheSwitchEnum.class);
    }
    /**
     * Instantiates a new pay instrument enum.
     * @param code 对应的编码
     * @param desc 编码描述
     */
    private CacheSwitchEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取编码.
     * @return 编码
     */
    public int getCode() {
        return code;
    }


    /**
     * 获取描述.
     * @return 描述
     */
    public String getDesc() {
        return desc;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return "MessageActionTypeEnum{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
