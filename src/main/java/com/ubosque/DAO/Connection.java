package com.ubosque.DAO;
import java.sql.*;

public class Connection {
	String database="tienda";
	String user="root";
	String password="admin";
	String url="jdbc:mysql://localhost/"+database;
	java.sql.Connection connection = null;	
	
	public java.sql.Connection getConnection() {
		try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			if(connection!=null) {
				System.out.println("Conexion exitosa");
				//syso + ctrl + espacio
				
				
			}
		} catch(SQLException e) {
			e.getMessage();
		} catch(ClassNotFoundException e) {
			e.getMessage();
		}
		return connection;
	}

}
