package com.ty.java.testmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 1);
		map.put("name", "jack");
		map.put("age", 30);
		for (Iterator<Entry<String, Object>> it = map.entrySet().iterator(); it.hasNext();) {
			Entry<String, Object> e=it.next();
			System.out.println("key:"+e.getKey()+"   "+"value:"+e.getValue());
		}
	}
}