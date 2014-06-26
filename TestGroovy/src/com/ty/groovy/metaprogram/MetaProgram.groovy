package com.ty.groovy.metaprogram

class MetaProgram {
	def name;
	def invokeMethod(String name,Object object){
		println "invoke method name is $name";
	}
	def hiTianyi(){
		println "the method name is hiTianyi"
	}
	
	
	static main(args){
		MetaProgram meta=new MetaProgram();
		meta.hiTianyi();
//		meta.hello();
//		meta.higroovy();
	}
}


