package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import bean.Userbean;

public class Loginrecord {
private DataSource dataSource;

public Loginrecord(DataSource dataSource2) {
		// TODO Auto-generated constructor stub
		dataSource = dataSource2;
	}

	public Userbean getclients() throws Exception
	  {
		  List<Userbean> clients= new ArrayList<>();
		  
		  Connection myConn=null;
		  Statement myStmt=null;
		  ResultSet myRs=null;
		  
		  
		  try {
		
			  myConn = dataSource.getConnection();
			  
				// Step 3:  Create a SQL statements
				String sql = "select * from record order by email";
				myStmt = myConn.createStatement();
				
				// Step 4:  Execute SQL query
				myRs = myStmt.executeQuery(sql);
				
				// Step 5:  Process the result set
				while (myRs.next()) {
				
					String name=myRs.getString("name");
					String pass=myRs.getString("pswd");
					String email=myRs.getString("email");
					
					Userbean user=new Userbean(name,pass,email);
					
					clients.add(user);
					
				}
			  
				// return user;
		  }
		 finally {
			 //close jdbc objects
			 close(myConn,myStmt,myRs);
			 
		 }
		return (Userbean) clients;
	  }

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		 try {
			 if(myRs !=null)
			 {
				 myRs.close();
			 }
			 if(myStmt !=null)
			 {
				 myStmt.close();
			 }
			 if(myConn !=null)
			 {
				 myConn.close();
			 }
		 }
		 catch (Exception ex)
		 {
			 ex.printStackTrace();
		 }
	}
}
