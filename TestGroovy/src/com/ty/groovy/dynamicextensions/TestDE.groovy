package com.ty.groovy.dynamicextensions

//class TestDE {
	
	
	rod = new Person(firstName:'Rod',lastName:'Cope',age:36)
	use(PropertiesHelper) {
		for (prop in rod.propertyNames) {
			println "${prop} = ${rod[prop]}"
	}
	}
	
//}
