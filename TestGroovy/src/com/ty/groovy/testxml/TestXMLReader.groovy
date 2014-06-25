package com.ty.groovy.testxml

class TestXMLReader {
	static main(args){
		def xml = new XmlParser().parse("c:/groovytest/sample.xml")
		//groovy.util.XmlParser , groovy默认导入包groovy.util
//		println "${xml.attribute('type')}"
		//获取node的属性
		xml.language.each { 
			println it.text() 
		}
		//直接遍历子节点，太方便了；不过，为了增强可读性，还是低调一点，用下标的方式吧：
		xml["language"].each {
			 println it.text() 
		}
		//可以用三重引号，把xml文件的内容放到一个字符串中
		def xml_content="""
			<langs type="current">  
			  <language>Java</language>  
			  <language>Groovy</language>  
			  <language>JavaScript</language>  
			</langs>  
			"""
		xml=new XmlParser().parseText(xml_content)
		xml.language.eachWithIndex { 
			it,idx->
			println "$idx: ${it.text()}"
		}
	}
}
