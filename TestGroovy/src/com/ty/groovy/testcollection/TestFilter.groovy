package com.ty.groovy.testcollection

import com.ty.groovy.helloworld.HelloWorld;

class TestFilter{
	static main(args){
		def list = ["Rod","Neeta","Eric","Missy"]
		def shorts = list.findAll { it.size() <= 4 }
		println shorts.size()
		shorts.each { println it }
		print new HelloWorld(name:"hello")==new HelloWorld(name:"hello");
	}
}
