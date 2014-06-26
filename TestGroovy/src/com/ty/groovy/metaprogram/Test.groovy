package com.ty.groovy.metaprogram

import com.ty.groovy.helloworld.HelloWorld;

class Test {

	static main(args){
		Test test=new Test();
		test.te();
	}
	def te(){
		List scores = [
			new Student(no:'123',name:'Tom',chinScore:90,mathScore:99,englScore:60,physScore:88,chemScore:96)
		]
		scores+=new Student(no:'124',name:'Mike',chinScore:88,mathScore:90,englScore:90,physScore:98,chemScore:87)
		scores+=new Student(no:'125',name:'Alice',chinScore:100,mathScore:55,englScore:98,physScore:67,chemScore:56)
	}
	def testInvokeMethod(){
		MetaProgram.metaClass.printname{ println name; }

		MetaProgram h=new MetaProgram();
		h.setName("hh")
		h.printname();
		h.invokeMethod("testPlusA", h);
	}
}