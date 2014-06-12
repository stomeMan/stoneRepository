package com.ty.range

class TestRange {
	def repeat(val){
		for(i in 1..<5){
			println val
		}
	}
	
	
	def hashTest(){
		def hash = [name:"Andy", "VPN-#":45];
		hash.each{ 
			key, value ->println "${key} : ${value}"
		}
	}
	
}
