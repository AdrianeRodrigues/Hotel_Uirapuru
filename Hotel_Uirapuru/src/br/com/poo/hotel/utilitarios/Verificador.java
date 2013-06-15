package br.com.poo.hotel.utilitarios;

public class Verificador {

	public static boolean isNumero(String numero) {
		return numero.matches("[0-9]");
	}
	
	public static boolean validarEmail(String email) {
		return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}
	
	public static boolean validarCPF(String cpf) {
		return cpf.matches("[0-9]{2,3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}");
	}
}
