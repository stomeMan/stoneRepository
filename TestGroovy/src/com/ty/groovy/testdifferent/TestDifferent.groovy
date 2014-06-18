package com.ty.groovy.testdifferent

import com.ty.groovy.helloworld.HelloWorld

class TestDifferent {
	
	static main(args){
		def tesd=new TestDifferent();
		tesd.testequal();
	}
	/**
	 * ≤‚ ‘ ==
	 * @return
	 */
	def testequal(){	
		print new HelloWorld()==(new HelloWorld());
	}
}
