package com.ty.java.testregex;

import java.util.regex.Pattern;


public class TestRegex {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("abc\\d");
		boolean flag=p.matcher("abc1").matches();
		System.out.println(flag);
	}
}
