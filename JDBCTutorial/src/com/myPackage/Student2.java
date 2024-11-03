package com.myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student2 {

	//create database
	public void createDatabase(){
		
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
		stm.execute(query);
		System.out.println("Databases created successfully");
		
		//connection close
		conn.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	//create table
	public void creatTable() {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/codingwallah";
//			String db = "condingwallah";
			String userName = "root";
			String password = "Ansari8102588784";
			
			//create connection
			Connection conn = DriverManager.getConnection(url,userName,password);
			
			//create statement
			Statement stm = conn.createStatement();
			
			String query = "Create table student(sid int(3), sname varchar(200),semail varchar(200))";
			
			//execute the query
			stm.execute(query);
			System.out.println("Table created successfully");
			
			//connection close
			conn.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	
	//insert data
	public void creatData() {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/codingwallah";
//			String db = "condingwallah";
			String userName = "root";
			String password = "Ansari8102588784";
			
			//create connection
			Connection conn = DriverManager.getConnection(url,userName,password);
			
			//create statement
			Statement stm = conn.createStatement();
			
			String query = "INSERT into student VALUES(1, 'shivam','shivam@gmail.com')";
			
			//execute the query
			stm.execute(query);
			System.out.println("data inserted successfully");
			
			//connection close
			conn.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	
	//prepared statement - It is used to execute parameterized query.
//	public void creatData() {
//	// TODO Auto-generated method stub
//	try {
//		String url = "jdbc:mysql://localhost:3306/";
//		String db = "codingwallah";
//		String userName = "root";
//		String password = "Ansari8102588784";
//		
//		//create connection
//		Connection conn = DriverManager.getConnection(url+db,userName,password);
//		
//		String query = "INSERT into student (sid,sname,semail) VALUES (?,?,?)";
//		
//		PreparedStatement pstm = conn.prepareStatement(query);
//		pstm.setInt(1,10);
//		pstm.setString(2, "shivam");
//		pstm.setString(3, "shivam@gamil.com");
//		
//		//execute the query
//		pstm.execute();
//		System.out.println("data inserted successfully");
//		
//		//connection close
//		conn.close();
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	
	//execute() and executeUpdate() same work
//	public void creatData() {
//		// TODO Auto-generated method stub
//		try {
//			String url = "jdbc:mysql://localhost:3306/";
//			String db = "codingwallah";
//			String userName = "root";
//			String password = "Ansari8102588784";
//			
//			//create connection
//			Connection conn = DriverManager.getConnection(url+db,userName,password);
//			
//			//create statement
//			Statement stm = conn.createStatement();
//		
//			
//			String query = "INSERT into student (sid,sname,semail) VALUES (?,?,?)";
//			
//			PreparedStatement pstm = conn.prepareStatement(query);
//			pstm.setInt(1,11);
//			pstm.setString(2, "sachin");
//			pstm.setString(3, "sachin@gamil.com");
//			
//			//execute the query
//			pstm.executeUpdate();
//			System.out.println("data inserted successfully");
//			
//			//connection close
//			conn.close();
//			
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//	}
	
	
	//read data
	public void readData() {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "codingwallah";
			String userName = "root";
			String password = "Ansari8102588784";
			
			//create connection
			Connection conn = DriverManager.getConnection(url+db,userName,password);
			String query = "Select * from student ";
			
			//create statement
			Statement stm = conn.createStatement();			
			
			//execute the query
			stm.execute(query);
			System.out.println("read successfully");
			
			//connection close
			conn.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}	
		
		
		//read and display data
//		public void readData() {
//			// TODO Auto-generated method stub
//			try {
//				String url = "jdbc:mysql://localhost:3306/";
//				String db = "codingwallah";
//				String userName = "root";
//				String password = "Ansari8102588784";
//				
//				//create connection
//				Connection conn = DriverManager.getConnection(url+db,userName,password);
//				String query = "Select * from student ";
//				
//				//create statement
//				Statement stm = conn.createStatement();
//				ResultSet rs = stm.executeQuery(query);
//				while(rs.next()) {
//					System.out.println("id = "+rs.getInt(1));
//					System.out.println("name = "+rs.getString(2));
//					System.out.println("email = "+rs.getString(3));
//				}
//				
//				System.out.println("read successfully");
//				
//				//connection close
//				conn.close();
//				
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//		}
		
	
		//update data
		public void updateData() {
			// TODO Auto-generated method stub
			try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "codingwallah";
			String userName = "root";
			String password = "Ansari8102588784";
			
			//create connection
			Connection conn = DriverManager.getConnection(url+db,userName,password);
			
			//create statement
			Statement stm = conn.createStatement();
		
			String query = "UPDATE student set sid = ? where sname = ?";
			
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1,12);
			pstm.setString(2, "Boom");
			
			//execute the query
			pstm.execute();
			System.out.println("Data updated successfully");
			
			//connection close
			conn.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
		//delete data
		public void deleteDate() {
			// TODO Auto-generated method stub
			try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "codingwallah";
			String userName = "root";
			String password = "Ansari8102588784";
			
			//create connection
			Connection conn = DriverManager.getConnection(url+db,userName,password);
			
			//create statement
			Statement stm = conn.createStatement();
		
			String query = "DELETE from student where sid = ?";
			
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1,12);
			
			//execute the query
			pstm.execute();
			System.out.println("Data deleted successfully");
			
			//connection close
			conn.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
