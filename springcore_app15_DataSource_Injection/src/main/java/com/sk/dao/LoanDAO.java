package com.sk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sk.bo.CustomerBO;

public class LoanDAO {
	
	private static final String INSERT_QUERY="INSERT INTO BANK_LOAN VALUES(?,?,?,?)";
	
	private DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	public int insert(CustomerBO customerBO) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int result=0;
		
		try {
			
			con=ds.getConnection();
			pstmt = con.prepareStatement(INSERT_QUERY);
			pstmt.setInt(1, customerBO.getCno());
			pstmt.setString(2, customerBO.getCname());
			pstmt.setFloat(3, customerBO.getPamt());
			pstmt.setFloat(4, customerBO.getIntramt());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(pstmt!=null)
					pstmt.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		
		return result;
	}
	
	

}
