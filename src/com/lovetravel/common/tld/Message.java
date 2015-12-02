package com.lovetravel.common.tld;

import java.util.Map;

import com.google.common.collect.Maps;
import com.lovetravel.common.config.Global;
import com.lovetravel.common.util.PropertyLoader;

public class Message {

	/**
	 * 属性文件加载对象
	 */
	private static PropertyLoader propertyLoader = new PropertyLoader(Global.PROPERTIES_PATH);
	private static Map<String, String> map = Maps.newHashMap();

	public static String getPath() {
		return getConfig("path");
	}

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
