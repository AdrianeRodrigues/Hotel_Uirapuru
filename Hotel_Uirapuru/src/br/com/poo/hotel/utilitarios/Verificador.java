package br.com.poo.hotel.utilitarios;

public class Verificador {

	public static boolean isNumero(String str) {
		return str.matches("[0-9]");
	}
	
	public static boolean validarEmail(String str) {
		return str.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}
}
