package com.ty.groovy.helloworld;
/*public*/ class HelloWorld {
	String name;

//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName(){
//		return name;
//	}

/*public*/String greet(def name="Jack") {
		/*return*/ "Hello${name}";
	}

/*public*/ static /*void*/ main( args){
		def helloWorld = new HelloWorld(name:"Groovy")
//		helloWorld.setName("Groovy");
		println helloWorld.greet();
	}

@Override
boolean equals(Object obj) {
	def d=1;
	
	return this.name==((HelloWorld)obj).getName();
	
}
	
}

//print "Hello World";