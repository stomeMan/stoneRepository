package com.ty.groovy.changableparam

class TestChangableParam {
   def addAllGroovy( Object[] args ){
      int total = 0
      for( i in args ) { total += i }
	  "total:${total}"
   }
   def addAllJava( def ... args ){
      int total = 0
      for( i in args ) { 
		  total += i 
	  }
	  "total:${total}"
   }
   static main(args){
	   TestChangableParam c = new TestChangableParam()
	   println c.addAllGroovy(1,2,3,4,5)
	   println c.addAllJava(1,2,3,4,5)
   }
}


