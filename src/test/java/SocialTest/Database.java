package SocialTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		try
		{
			//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
	
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Mahima2708@");
		//create statement
		 Statement statement = con.createStatement();

	            // SQL command to create a new database
		 String SocialMedia="socialMedia";
	            String createDatabaseQuery = "CREATE DATABASE " + SocialMedia;
	
	            // Execute the SQL command
	            statement.executeUpdate(createDatabaseQuery);

	            System.out.println("Database '" + SocialMedia + "' created successfully.");
	            String createTableQuery = "CREATE TABLE IF NOT EXISTS users (username VARCHAR(255) NOT NULL," +"followers VARCHAR(255) NOT NULL," +"following VARCHAR(255) NOT NULL," + "posts VARCHAR(255) NOT NULL )";
	  		  statement.executeUpdate(createTableQuery);
	  		  System.out.println("Table is created");
	  		  
	  		  //insert into 
	  		  PreparedStatement ps=con.prepareStatement("insert into users values('DotAndKey skincare','311k','245','2225')");
	  		  PreparedStatement ps1=con.prepareStatement("insert into users values('Filtercopy','506k','76','2,664')");
	  			
	  		  PreparedStatement ps2=con.prepareStatement("insert into users values('classywomen','134k','564','3876')");
	  			
	  		  //insert,update,delete query // return vale in integer
	  			
	  			
	  			 ps.executeUpdate();
	  			 ps1.executeUpdate();
	  			 ps2.executeUpdate();
	  			System.out.println("Data is inserted successfully");
	            
	            
	            
	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}
	

}
