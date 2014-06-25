package com.ty.groovy.testdb
import groovy.sql.Sql

class CardLossMSSQL {
  static {
  }
  static void main(args){
//	  def oradb = [url:"jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST = (ADDRESS = (PROTOCOL = TCP)(HOST = xxx.xxx.xxx.xxx)(PORT = 1521)))(CONNECT_DATA =(SERVICE_NAME = bs)))", user:"scott", password:"tiger", driver:"oracle.jdbc.driver.OracleDriver"]
//	  def orasql = Sql.newInstance(oradb.url, oradb.user, oradb.password, oradb.driver)
//
//	  def msdb = [url:"jdbc:sqlserver://xx.xx.xx.xx:1433;DataBaseName=bs", user:"sa", password:"sa", driver:"com.microsoft.sqlserver.jdbc.SQLServerDriver"]
//	  def mssql = Sql.newInstance(msdb.url, msdb.user, msdb.password, msdb.driver)
	  def mySql = Sql.newInstance("jdbc:mysql://192.168.99.83:3306/testgroovy","root","fXL2bO\$RQgaRS^lH","com.mysql.jdbc.Driver")
	  mySql.eachRow("SELECT s.name,s.age FROM testgroovy.student s;"){
		  println("gromit likes ${it.field2} "+"${it.field1}")
	  }

//	  try{
//		  orasql.eachRow("SELECT tct.ID, tct.CardID, tct.Tpye from TCM_CARDLOST_TEMP tct ORDER BY tct.ID"){r ->
//			  if(r.Tpye == '1'){
//				  mssql.execute("delete ComUnLost where scCardID=${r.CardID}")
//				  mssql.execute("delete ComLost where scCardID=${r.CardID}")
//				  mssql.execute("insert into ComLost(scCardID) values(${r.CardID})")
//				  mssql.execute("Insert into ComCardOperate(scID, coType, coCount, coMoney, slID, slStationNo, ClientNo, coUseSystem, coDT, opName, coRemark) (select scID, 3 as coType,crdcount,crdmoney,0 as slID,0 as slStationNo, 1 as ClientNo, 65535 as coUseSystem,GetDate(),39, 0 as coRemark from comsendcard where sccardid = ${r.CardID})")
//				  mssql.execute("update ComSendCard set scCardStatus=scCardStatus | 2 where scCardID=${r.CardID}")
//
//				  orasql.execute("DELETE FROM TCM_CARDLOST_TEMP WHERE ID = ${r.ID}")
//			  } else {
//				  mssql.execute("insert into ComUnLost(scCardID,LostID) select scCardID,LostID FROM ComLost WHERE scCardID=${r.CardID}")
//				  mssql.execute("delete ComLost where scCardID=${r.CardID}")
//				  mssql.execute("Insert into ComCardOperate(scID, coType, coCount, coMoney, slID, slStationNo, ClientNo, coUseSystem, coDT, opName, coRemark) (select scID, 4 as coType,crdcount,crdmoney,0 as slID,0 as slStationNo, 1 as ClientNo, 65535 as coUseSystem,GetDate(),39, 0 as coRemark from comsendcard where sccardid = ${r.CardID})")
//				  mssql.execute("update comsendcard set scCardStatus=scCardStatus & 0xfffffffd where scCardID=${r.CardID}")
//
//				  orasql.execute("DELETE FROM TCM_CARDLOST_TEMP WHERE ID = ${r.ID}")
//			  }
//		  }
//	  } catch (java.sql.SQLException e){
//		  e.printStackTrace()
//	  } finally {
//		  orasql.close()
//		  mssql.close()
//	  }
  }
}