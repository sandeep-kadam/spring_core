package com.sk.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class RecordsCountingApp {

	
	public static void main(String[] args) throws Exception {
		
		InputStream io = new FileInputStream("src/com/sk/commons/DBDetails.properties");
		Properties properties = new Properties();
		properties.load(io);
		
		Class.forName(properties.getProperty("jdbc.driver"));
		Connection con = DriverManager.getConnection(properties.getProperty("jdbc.url"), properties.getProperty("db.user"), properties.getProperty("db.pwd"));
		
		Statement stmt = con.createStatement();
		
		ResultSet rs  = stmt.executeQuery("select count(*) from student");
		
		int cnt=0;
		
		if(rs.next())
			cnt=rs.getInt(1);
		
		System.out.println("Record Count :: "+cnt);
		
		//close obj
		rs.close();
		stmt.close();
		con.close();
	}
}
