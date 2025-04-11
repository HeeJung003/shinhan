package com.shinhan.day09;

import java.util.Properties;
import java.util.Set;

public class SystemInfoTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		//Map : 파이썬에 있는 dictionary 같음 entry(key, value)의 쌍으로 이루어짐
//		Properties properties = System.getProperties();
//		Set<Object> keys = properties.keySet();
//		for(Object key:keys) {
//			System.out.println(System.getProperty((String)key));
//		}
		
		Properties ps = System.getProperties();
		for(Object key:ps.keySet()) {
			String s = (String)key;
			System.out.println(key + " -> " + System.getProperty(s));
		}
	}

}
