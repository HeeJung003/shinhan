package com.shinhan.day13;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("id", "sss");
		jsonObj.put("name", "ff");
		jsonObj.put("age", 10);
		jsonObj.put("student", true);
		
		JSONObject jsonObj2 = new JSONObject();
		jsonObj.put("id", "sss2");
		jsonObj.put("name", "ff2");
		jsonObj.put("age", 20);
		jsonObj.put("student", false);
		
		JSONArray arr = new JSONArray();
		arr.put(jsonObj);
		arr.put(jsonObj2);
		
		JSONObject root = new JSONObject(); // {"course":"신한금융~", "student" : [{}, {}]}
		root.put("course", "신한금융sw아카데미");
		root.put("student", arr);
		
		System.out.println(root);
		
		System.out.println(root.get("student"));
		
		JSONArray arr2 = (JSONArray)root.get("student");
		for(int i = 0; i < arr2.length(); i++) {
			JSONObject obj = (JSONObject)arr2.get(i);
			System.out.println(obj.get("name"));
			
		}
		
	}
}
