package com.ty.test

class MetaTest {
	void testCategory(){
		String message = "Hello"
		use(StringHelper){
		  assertEquals "HELLO", message.shout()
		  assertEquals "GOODBYE", "goodbye".shout()
		}
	
		shouldFail{
		  message.shout()
		  "foo".shout()
		}
	  }
	}
	
	class StringHelper{
	  static String shout(String self){
		return self.toUpperCase()
	  }
}
