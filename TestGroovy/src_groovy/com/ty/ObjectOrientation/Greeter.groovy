package com.ty.ObjectOrientation

class Greeter  extends Greet{
  Greeter(who){
	  super(who);
  }

static main(args){
	  Greeter g=new Greeter("John")
	  g.salute();
  }


 Greeter(String name, String morning) {
	this.name=name;
	this.morning=morning;
}

}