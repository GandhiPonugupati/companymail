package com.javatpoint;
import java.sql.*;
public class ConProvider {

	public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatpoint?user=root&password=dinga");
		System.out.println("jdbc:mysql://localhost:3306/javatpoint?user=root&password=dinga");
	}catch(Exception e){System.out.println(e);}
	return con;
    }
}
