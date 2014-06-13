package com.ty.groovy.metaprogram

class Pouncer {
   static pounce( Integer self ){
      def s = "Boing!"
      1.upto(self-1) { s += " boing!" }
      s + "!"
   }
   def use( Pouncer ){
	   assert 3.pounce() == "Boing! boing! boing!"
	}
	
}


