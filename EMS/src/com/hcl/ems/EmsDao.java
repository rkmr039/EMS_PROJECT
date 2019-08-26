package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmsDao {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	String cmd="";
	
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

	public Employ getAccountInfoDao(int ID) {
		cmd = "select * from EMPLOYEE where EMP_ID = ?";
		con = DaoConnection.getConnection();
		Employ e = null;
		try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, ID);
			rs = pst.executeQuery();
			if(rs.next()){
				e = new Employ();
				e.setEMP_ID(ID);
				e.setEMP_NAME(rs.getString("EMP_NAME"));
				e.setEMP_EMAIL(rs.getString("EMP_EMAIL"));
				e.setEMP_MOB_NO(rs.getBigDecimal("EMP_MOB_NO"));
				e.setEMP_DATE_JOINED(rs.getDate("EMP_DATE_JOINED"));
				e.setEMP_DPT_NAME(rs.getString("EMP_DPT_NAME"));
				e.setEMP_LEAVE_BALANCE(rs.getInt("EMP_LEAVE_BALANCE"));
				e.setEMP_MGR_ID(rs.getInt("EMP_MGR_ID"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return e;
		
	}

}
