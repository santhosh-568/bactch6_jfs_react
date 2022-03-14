package com.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SpringDb {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/Esnew";
	private String username="root";
	private String password="avi";
	public void selectAllRows() throws Exception
	{   
		//load driver
		Class.forName(driver);
		//get a connection
		Connection con=DriverManager.getConnection("url,username,password");
		
		//execute query
		Statement stmt=(Statement) con.createStatement();
		
		stmt.execute();
	}

}
