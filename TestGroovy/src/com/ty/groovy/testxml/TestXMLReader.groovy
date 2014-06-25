package com.ty.groovy.testxml

class TestXMLReader {
	static main(args){
		def xml = new XmlParser().parse("c:/groovytest/sample.xml")
		//groovy.util.XmlParser , groovyĬ�ϵ����groovy.util
//		println "${xml.attribute('type')}"
		//��ȡnode������
		xml.language.each { 
			println it.text() 
		}
		//ֱ�ӱ����ӽڵ㣬̫�����ˣ�������Ϊ����ǿ�ɶ��ԣ����ǵ͵�һ�㣬���±�ķ�ʽ�ɣ�
		xml["language"].each {
			 println it.text() 
		}
		//�������������ţ���xml�ļ������ݷŵ�һ���ַ�����
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
