package com.example.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class Dao{
	private JdbcTemplate temp;

	

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	
	public int insert(Workers w) {
		String sql="insert into Workers values("+w.getId()+",'"+w.getName()+"','"+w.getEmail()+"')";
				
				System.out.println(sql);
		return temp.update(sql);
		
	}
	
}
