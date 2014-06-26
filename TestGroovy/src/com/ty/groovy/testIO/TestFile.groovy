package com.ty.groovy.testIO

class TestFile {
	static main(args){
		readFile("D:/testfile");
	}
	/**
	 * read file
	 * @return
	 */
	static readFile(path){
		def file=new File(path);
		file.eachFile{
			if(!it.isDirectory()){
					it.readLines().each {
						println it
					}
			}
		}
		
	}
}