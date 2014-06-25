package com.ty.groovy.testdb
import groovy.sql.Sql

class CardLossMSSQL {

  static void main(args){
  	testSelect();
  }
  /**
   * list.each {
	  	println "Student id is ${it.id}.name is ${it.name} age is ${it.age}";
	  };

   * @return
   */
  static testSelect(){
	  def mysql = Sql.newInstance("jdbc:mysql://192.168.99.83:3306/testgroovy?useUnicode=true&characterEncoding=utf8","root","fXL2bO\$RQgaRS^lH","com.mysql.jdbc.Driver");
	  def list =new ArrayList<Student>();
	
	  mysql.eachRow("SELECT s.id, s.name,s.age FROM testgroovy.student s;"){
//		  list.add(new Student("${it.name}","${it.age}"));
//		  mysql.execute("insert into student (name,age) values(${it.name},${it.age})");
		  if(it.age>20){
			  mysql.execute("update testgroovy.student s set s.name ='Jack' where s.age=23");
		  }
	  }
	  mysql.eachRow("SELECT s.id, s.name,s.age FROM testgroovy.student s;"){
		  println "Student id is ${it.id} name is ${it.name} age is ${it.age}";
	  }
	  
	  mysql.close();
  }
}