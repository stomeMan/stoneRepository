package com.ty.groovy.testwtich

class TestSwitch {
	static main(args){
		TestSwitch ts=new TestSwitch();
		ts.testSwithc(10)
	}
	def testSwithc(var){
		switch(var){
			case 0: break;
			case 1..5: break;
			case [6, 7, 8]:break;
			case Number: break;
			case {it % 5 == 0}: break;
			default: break;
		}
	}
}