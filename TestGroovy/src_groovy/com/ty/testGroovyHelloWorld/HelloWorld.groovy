package com.ty.testGroovyHelloWorld


public class HelloWorld {
	String name;

	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public String greet() {
		return "Hello"+ name;
	}

	public static void main(String [] args){
//		helloWorld = new HelloWorld();
//		helloWorld.setName("Groovy");
//		System.out.println( helloWorld.greet() );
	}
}

