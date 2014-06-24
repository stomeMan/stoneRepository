package com.ty.java.testdifferent;

import com.ty.groovy.helloworld.HelloWorld;

public class TestDifferent {
	public static void main(String[] args) {
		new TestDifferent().testequal();
		
	}
	
	/**
	 * ≤‚ ‘==
	 */
	public void testequal(){
		System.out.println(new HelloWorld()==new HelloWorld());
		System.out.println(new HelloWorld().equals(new HelloWorld()));
	}
}
