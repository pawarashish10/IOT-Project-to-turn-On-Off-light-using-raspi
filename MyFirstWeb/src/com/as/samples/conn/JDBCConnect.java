package com.as.samples.conn;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class JDBCConnect {

	public JDBCConnect() {
		super();
	}
	
	public static Connection getConnection() throws Exception{
		Connection dbConn = null;
    try{
	String url = "jdbc:mysql://localhost:3306/test";
	Class.forName("com.mysql.jdbc.Driver");
	dbConn = DriverManager.getConnection(url, "root", "asp");
	}
     catch (SQLException sqle) {
	   sqle.printStackTrace();
	   throw sqle;
	}
         catch(Exception e) {
	   e.printStackTrace();
	   throw e;
	}
    return dbConn;
	}
	
	
	
	public static void addPersonalInfo(PersonalInfoVOO personalInfo) throws Exception{

	    Connection dbConn = null;
	    PreparedStatement pStmt = null;
	    int rowsInserted = 0;

	     try{
		dbConn = getConnection();
		pStmt = dbConn.prepareStatement("INSERT INTO personalinfo  VALUES (?,?,?,?,?,?,?,?,?)");
		
		pStmt.setString(1, personalInfo.getFirstname());
		pStmt.setString(2, personalInfo.getMiddlename());
		pStmt.setString(3, personalInfo.getLastname());
		pStmt.setString(4, personalInfo.getAddr());
		pStmt.setString(5, personalInfo.getCity());
		pStmt.setString(6, personalInfo.getState());
		pStmt.setString(7, personalInfo.getBankName());
		pStmt.setString(8, personalInfo.getAccNo());
		pStmt.setString(9, personalInfo.getSsn());
		
   		rowsInserted = pStmt.executeUpdate();

		if (rowsInserted != 1) {
			throw new Exception("Error in inserting the row");

   		}
	     	}catch (SQLException sqle) {
		   sqle.printStackTrace();
		   throw sqle;
		}catch(Exception e) {
		   e.printStackTrace();
		   throw e;
		}
	     finally {
		pStmt.close();
		dbConn.close();
	     }
		return;
	}

	public static void main(String[] args) 
	{
		/*PersonalInfoVOO personalInfo = new PersonalInfoVOO();
		personalInfo.setFirstname("asp");
		personalInfo.setMiddlename("sdp");
		personalInfo.setLastname("pawar");
		personalInfo.setAddr("manet dr");
		personalInfo.setCity("sunny");
		personalInfo.setState("CA");
		personalInfo.setBankName("ICICI");
		personalInfo.setAccNo("83487324");
		personalInfo.setSsn("4574365");
		
		try
		{
			JDBCConnect.addPersonalInfo(personalInfo);;
			System.out.println("Done");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}*/

	}

}
