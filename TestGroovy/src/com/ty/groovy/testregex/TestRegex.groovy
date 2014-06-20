package com.ty.groovy.testregex

import java.util.regex.Pattern



////class TestRegex {
////
////}
//def reg = ~'abc\\d'
//println null==~('abc\\d')
//println "abc1".matches('abc\\d');


public class TestRegex {
	public static  main(String [] args) {
		Pattern p=Pattern.compile("abc\\d");
		boolean flag=p.matcher("abc1").matches();
		System.out.println(flag);
	}
}
