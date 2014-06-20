package com.ty.groovy.metaprogram


import com.ty.groovy.helloworld.HelloWorld;

//class Test {
//
//	static main(args) {
//	
//	}
//	Integer.metaClass.pounce{  
//		println delegate
//		def s = "Boing!"
//		delegate.upto(delegate+1){ s += " boing!" }
//		s + "!"
//	}
//	print  3.pounce() == "Boing! boing! boing!!"
//	
//}assert
HelloWorld.metaClass.printname{
	println name;
} 

HelloWorld h=new HelloWorld();
h.setName("hh")
h.printname();
