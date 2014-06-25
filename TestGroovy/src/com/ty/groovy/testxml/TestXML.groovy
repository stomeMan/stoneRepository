package com.ty.groovy.testxml

import groovy.xml.MarkupBuilder

class TestXML {
	def static  testXML(){
		def content=new StringWriter()
		def builder = new MarkupBuilder()
		builder.school{
			grade(id:1, name:'1年级'){
				field(id:1, name:'field1')
				field(id:2, name:'field2')
			}
			grade(id:2, name:'2年级'){
				field(id:1, name:'field1')
				field(id:2, name:'field2')
			}
			grade(id:3, name:'三年级'){
				field(id:1, name:'field1')
				field(id:2, name:'field2')
			}
		}
		content
	}
	static main(args){
		def xml=testXML()
		def file=new File("c:/groovytest/testxml.xml");
		file.append(xml);
	}
}
