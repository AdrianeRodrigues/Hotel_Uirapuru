package br.com.poo.hotel.fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	
	public static Connection getConexao(String usuario, String senha) throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/nomebanco", usuario, senha);
	}
}
