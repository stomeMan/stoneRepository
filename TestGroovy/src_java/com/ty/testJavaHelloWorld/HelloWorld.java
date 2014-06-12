package com.ty.testJavaHelloWorld;

public class HelloWorld {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String greet() {
		return "Hello" + name;
	}

	public static void main(String args[]) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("Groovy");
		System.err.println(helloWorld.greet());
	}

}
