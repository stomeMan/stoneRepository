package com.ty.groovy.testdb

class Student {
	def id;
	def name;
	def age;
	Student(def id,def name,def age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	Student(){
		
	}
	Student(def name,def age){
		this.name=name;
		this.age=age;
	}
}
