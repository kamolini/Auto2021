package com.abc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB_Test {
	
	@Test
	public void T() throws ClassNotFoundException, SQLException {
		
		String host = "mysql3000.mochahost.com";
		String port = "3306";
		String userName = "kamolini_auto";
		String password = "TestAuto100%";
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection =  DriverManager.getConnection("jdbc:mysql://"+host+":"+port, userName, password);
			
			
			Statement statement =  connection.createStatement();
			ResultSet resultSet =  statement.executeQuery("SELECT * FROM kamolini_kamol.customer WHERE id =121");
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"	"+resultSet.getString(2)+"	"+resultSet.getString(3)+"	"+resultSet.getString(4)+"	"+resultSet.getString(5)+"	"+resultSet.getString(6));
				//System.out.println(resultSet.getString(1));
			}
	
			System.out.println("==================");
	
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT FName FROM kamolini_kamol.customer WHERE id =? and FName=?");
			
			preparedStatement.setInt(1, 121);
			preparedStatement.setString(2, "mahesh");
			 
			resultSet =  preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				//System.out.println(resultSet.getInt(1)+"	"+resultSet.getString(2)+"	"+resultSet.getString(3)+"	"+resultSet.getString(4)+"	"+resultSet.getString(5)+"	"+resultSet.getString(6));
				System.out.println(resultSet.getString(1));
			}
		 
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		
		
	}

}
