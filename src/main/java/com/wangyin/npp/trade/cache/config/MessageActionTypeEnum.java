/*
* @(#)MessageActionTypeEnum.java 1.0 2015-5-21
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@jd.com
*/
package com.wangyin.npp.trade.cache.config;

/**
 * The Enum MessageActionTypeEnum.
 *
 * @author qiaoshaohua1 2015-5-21
 * @version 1.0
 * @since 1.0
 */
public enum MessageActionTypeEnum {
	
	/** remove key action. */
	REMOVEKEY("REMOVEKEY", "移除key缓存"), 
	
	/** remove all key action. */
	REMOVEALL("REMOVEALL", "移除所有缓存"), 
    
    /** cache switch action. */
    CACHESWITCH("CACHESWITCH", "缓存开关"), 
    
    /** reload key action. */
    RELOADKEY("RELOADKEY", "重新加载KEY缓存");
    
    /** The code. */
    private String code = null;
    
    /** The desc. */
    private String desc = null;


    /**
     * 根据编码获取枚举.
     *
     * @param code 枚举定义的编码
     * @return 查找到的枚举
     */
    public static MessageActionTypeEnum getEnum(String code) {
        for(MessageActionTypeEnum a : MessageActionTypeEnum.values()) {
            if (a.code.equals(code)) return a;
        }
        throw new IllegalArgumentException("No enum code '" + code + "'. " + MessageActionTypeEnum.class);
    }
    /**
     * Instantiates a new pay instrument enum.
     * @param code 对应的编码
     * @param desc 编码描述
     */
    private MessageActionTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取编码.
     * @return 编码
     */
    public String getCode() {
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
