package com.ty.groovy.testwtich

class TestSwitch {
	static main(args){
		TestSwitch ts=new TestSwitch();
		def list = [new Person(name:"Rod"),new Person(name:"Neeta"),new Person(name:"Eric"),new Person(name:"Missy")]
		def nums=[1,3,4,5,7,8,10];
		ts.testSwitchNUM(nums)
	}
	/**
	 * num
	 * @param var
	 * @return
	 */
	def testSwitchNUM(list){
		for(var in list){
			switch(var){
				case 1: println "$var is in  1" ;
						break;
				case 2..4:println "$var is in 2-4" 
						  break;
				case [6, 7, 8]:println "$var is in 6-8"
								break;
				case {it % 5 == 0}: println "$var is in 5 or 5*n"
							break;
				default: break;
			}
		}
		
	}
	def testSwitchStr(list){
		switch(var){
			case "": println "$var is in  1" 
					break;
			case "":println "$var is in 2-4"
					  break;
			case "":println "$var is in 6-8"
							break;
			case " ": println "$var is in 5 or 5*n"
						break;
			default: break;
		}
	}
}