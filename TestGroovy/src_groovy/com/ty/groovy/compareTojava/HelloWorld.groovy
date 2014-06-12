package com.ty.groovy.compareTojava

class HelloWorld {
   String name
   /**
    * groovy 中 ==实现的是 equals 的功能
    * @return
    */
   static  testEquals() { 
	   println("Hello"=="Hello"); 
   }
   static main(args ){
	  def ss= testEquals();
	  print ss;
   }
   def repeat(val){
	   for(i in 0..<5){
	   println val
	   }
   }
}


