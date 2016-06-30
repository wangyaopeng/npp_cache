/*
* @(#)Cached.java 1.0 2015-5-26
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@jd.com
*/
package com.wangyin.npp.trade.cache.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * The annotation Cached.
 *
 * @author qiaoshaohua1 2015-5-26
 * @version 1.0
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.CONSTRUCTOR })
public @interface Cached {
	
	/**
	 * prefix.
	 *
	 * @return the string
	 */
	String prefix() default "";
	
	/**
	 * Exp.
	 *
	 * @return the int
	 */
	int exp() default 0;
	
	/**
	 * Message.
	 *
	 * @return the string
	 */
	String message() default "";
}
