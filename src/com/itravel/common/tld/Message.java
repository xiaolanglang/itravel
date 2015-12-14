package com.itravel.common.tld;

import java.util.Map;

import com.bkweb.common.config.CommonGlobal;
import com.bkweb.common.util.PropertyLoader;
import com.google.common.collect.Maps;

public class Message {

	/**
	 * 属性文件加载对象
	 */
	private static PropertyLoader propertyLoader = new PropertyLoader(CommonGlobal.PROPERTIES_PATH);

	private static Map<String, String> map = Maps.newHashMap();

	/**
	 * 获取配置
	 * 
	 * @see ${msg:getConfig('adminPath')}
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null) {
			value = propertyLoader.getValue(key);
			map.put(key, value != null ? value : null);
		}
		return value;
	}

}
