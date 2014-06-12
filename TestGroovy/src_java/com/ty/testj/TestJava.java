package com.ty.testj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.ty.ObjectOrientation.Greeter;

public class TestJava {
	public static void main(String[] args) {
		Greeter greeter=new Greeter("Hello","John");
		greeter.salute();
	}
	
	/**
	 * 
	 */
	public static void testEquals(){
		System.out.println("Hello"=="Hello");
	}
	@SuppressWarnings("rawtypes")
	public void testHashMap(){
		Map<String, String>map = new HashMap<String, String>();
		map.put("name", "Andy");
		map.put("VPN-#","45");
		for(Iterator iter = map.entrySet().iterator(); iter.hasNext();){
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
