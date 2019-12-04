package br.ucsal.roteiro.util;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.Properties;


public class Conexao {
	private static Connection con;
	static {
		String url = "jdbc:postgresql://localhost/roteiros";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password",""); 
		props.setProperty("ssl","false");

		try {

			con = DriverManager.getConnection(url, props);

		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("erro2");
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){

		return con;
	}
}



