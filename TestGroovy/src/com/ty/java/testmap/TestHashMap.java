package com.ty.java.testmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("id", 1);
		map.put("name", "jack");
		map.put("age", 30);
		System.out.println(map.get("id"));;
	}
}
