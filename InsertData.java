package net.codejava;
import java.sql.*;

public class InsertData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "Dayakar1426";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "raju");
		    statement.setString(2, "rajugandla");
		    statement.setString(3, "raju");
		    statement.setString(4, "raju@gandla.com");
		     
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
