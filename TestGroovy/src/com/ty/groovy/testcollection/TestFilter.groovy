package com.ty.groovy.testcollection

import com.ty.groovy.helloworld.HelloWorld;

class TestFilter{
	static main(args){
		def list = ["Rod","Neeta","Eric","Missy"]
		def shorts = list.findAll { it.size() <= 4 }
		println shorts.size()
		shorts.each { println it }
		print 1.MAX_VALUE;
		switch(list){
			case 1 : print list;
			case 2 :print list ;
		}
	}
}
