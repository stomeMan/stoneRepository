package com.ty.ObjectOrientation

class Greet {
	def name
	def morning
	Greet() { 
//		name = who[0].toUpperCase() +who[1..-1] 
	}
	def salute() 
	{ 
		println "Hello $name! $morning" 
		
	}
	static main(str){
		Greet g = new Greet(name:'world',morning:"moring")  // create object
		g.salute()               // output "Hello World!"	new Greet("terry").salute();
	}

}

