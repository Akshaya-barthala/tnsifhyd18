package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employedb";
		String username = "root";
		String password = "Akshayasql";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO employee (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "Elon");
		    statement.setString(2, "Elon22");
		    statement.setString(3, "Elon musk");
		    statement.setString(4, "Elonmusk@microsoft.com");
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
	/*
	 * Using a Statement for a static SQL query. Using a PreparedStatement for a
	 * parameterized SQL query and using setXXX() methods to set values for the
	 * parameters. Using execute() method to execute general query. Using
	 * executeUpdate() method to execute INSERT, UPDATE or DELETE query Using
	 * executeQuery() method to execute SELECT query. Using a ResultSet to iterate
	 * over rows returned from a SELECT query, using its next() method to advance to
	 * next row in the result set, and using getXXX() methods to retrieve values of
	 * columns.
	 */	

}