package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDB {
	String url = "jdbc:mysql://localhost:3306/testdb";
	String username = "username";
	String password = "password";
	public boolean check(String email,String pass,String type) {
		String sql = "select * from employee where email = ? and pass = ? and type = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,email );
			st.setString(2,pass );
			st.setString(3,type );

			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	public void insert(String email,String pass,String type,String name, int age) {
		String sql = "INSERT INTO employee(name, email, pass,type,age) VALUES (?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,name );
			st.setString(2,email );
			st.setString(3,pass );
			st.setString(4,type);
			st.setInt(5,age);
			st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

	public void update(String email, String pass, String type, String name, String age, String id) {
		String sql = 	"UPDATE employee SET email = ?,pass = ? , type = ?, name = ? , age = ? WHERE id = ?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,email);
			st.setObject(2,pass );
			st.setString(3,type );
			st.setString(4,name);
			st.setInt(5,new Integer(age));
			st.setInt(6, new Integer(id));
			
			st.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
public void delete(int id) {
	String sql = "DELETE FROM employee WHERE id = ?";
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,id);
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	

}

}
	




