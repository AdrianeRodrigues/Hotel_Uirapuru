package br.com.poo.hotel.fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	
	private static String usuario = "root";
	private static String senha = "root";
		
	public void setUsuario(String usuario) {
		FabricaDeConexao.usuario = usuario;
	}

	public void setSenha(String senha) {
		FabricaDeConexao.senha = senha;
	}

	public static Connection getConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/hotel_uirapuru", usuario, senha);
	}
}
