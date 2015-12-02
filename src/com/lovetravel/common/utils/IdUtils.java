package com.lovetravel.common.utils;

import java.util.UUID;

/** 
 * Java的UUID生成工具
 * 
 * @author leizhimin 2010-7-10 16:25:13 
 */ 
public class IdUtils { 

	/**
	 * 生成UUID 
	 * @return
	 */
	public static String uuid()
	{
		return UUID.randomUUID().toString().toUpperCase(); 
	}
	
	public static void main(String[] args) {
		System.out.print(uuid());
	}
}