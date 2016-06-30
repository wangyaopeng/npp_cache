/*
* @(#)SimpleValueWrapValue.java 1.0 2015年5月11日
*
* Copyright 2009 jdjr payment All Rights Reserved.
* PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
* Author Email: qiaoshaohua1@chinabank.com.cn
*/
package com.wangyin.npp.trade.cache.support;

import com.wangyin.npp.trade.cache.CacheApi.ValueWrapper;

/**
 * cache value wrapper.
 * @author qiaoshaohua1
 * @version 1.0
 * @since 1.0
 */
public class SimpleValueWrapper implements ValueWrapper {
	

		private final Object value;


		/**
		 * Create a new SimpleValueWrapper instance for exposing the given value.
		 * @param value the value to expose (may be {@code null})
		 */
		public SimpleValueWrapper(Object value) {
			this.value = value;
		}


		/**
		 * Simply returns the value as given at construction time.
		 */
		public Object get() {
			return this.value;
		}


}
