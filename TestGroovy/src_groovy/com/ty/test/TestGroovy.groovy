package com.ty.test

class TestGroovy {

	static main(args) {
		 def l=new TestGroovy().dd()
		 def ss= l.findAll();
		 ss.each {print it+1}
	}

	 def dd(){
		def list = [1, 2, 3] + [4, 5, 6]
		list.each { println it }
	}
}
