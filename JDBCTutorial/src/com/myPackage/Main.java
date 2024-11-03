package com.myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver load - driver load automatic in new version
		//conn establish
		//statement create
		//execute query
		//conn close
		
		
		//connection establish
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "Ansari8102588784";
			
			Connection conn = DriverManager.getConnection(url,userName,password);
			System.out.println("Connected successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//create database
		try {
		String url = "jdbc:mysql://localhost:3306/";
		String userName = "root";
		String password = "Ansari8102588784";
		
		//create connection
		Connection conn = DriverManager.getConnection(url,userName,password);
		
		//create statement
		Statement stm = conn.createStatement();
		
		String query = "Create database codingwallah";
		
		//execute the query
//		boolean bl = stm.execute(query);
//		System.out.println("Databases created successfully = "+bl);
		stm.execute(query);
		System.out.println("Databases created successfully");
		
		//connection close
		conn.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}