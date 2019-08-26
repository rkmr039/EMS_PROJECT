package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmsDao {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	
	
	public boolean loginDao(int ID, String passWord) {
			String cmd = "select EMP_ID from EmployLogin where EMP_ID =? and SecretCode=?;";
			con = DaoConnection.getConnection();
			
			boolean result = false;
			try {
				pst =  con.prepareStatement(cmd);
				pst.setInt(1, ID);
				pst.setString(2, passWord);
				rs = pst.executeQuery();
				if(rs.next()) {
					result = true;
				} 
			} catch (Exception e) {
			}
			return result;	
		}
}
