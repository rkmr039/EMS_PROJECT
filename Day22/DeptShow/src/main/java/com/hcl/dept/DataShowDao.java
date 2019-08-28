package com.hcl.dept;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DataShowDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void showDept() {
		String cmd = "select * from department;";
		List emps = null;
		emps = jdbcTemplate.query(cmd, new RowMapper() {
			
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String res = rs.getInt("deptno") + "-----" +
						rs.getString("dname") + "-------"+
						rs.getString("loc") + "-------"+
						rs.getString("head");
				return res;
			}
		});
		for (Object object : emps) {
			System.out.println(object);
		}
	}
}
