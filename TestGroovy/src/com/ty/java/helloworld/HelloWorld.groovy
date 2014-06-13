package com.ty.java.helloworld
/*public*/ class HelloWorld {
	String name;

//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName(){
//		return name;
//	}

/*public*/String greet() {
		/*return*/ "Hello${name}";
	}

/*public*/ static /*void*/ main( args){
		def helloWorld = new HelloWorld(name:"Groovy")
//		helloWorld.setName("Groovy");
		println helloWorld.greet()
	}
}

//print "Hello World";