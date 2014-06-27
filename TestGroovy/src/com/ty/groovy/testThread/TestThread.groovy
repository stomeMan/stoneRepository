package com.ty.groovy.testThreadclass TestThread{		static main(args){				def t = new Thread(){			void run() {			};		};		print t.getName();		t.start();	}	}
	
	