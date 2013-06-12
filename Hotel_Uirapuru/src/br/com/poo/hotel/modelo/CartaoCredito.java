package br.com.poo.hotel.modelo;

public class CartaoCredito {

	private int agencia;
	private int numero;

	public CartaoCredito(int agencia, int numero) {
		setAgencia(agencia);
		setNumero(numero);
	}

	public int getAgencia() {
		return agencia;
	}

	public boolean setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
			return true;
		} else
			return false;
	}

	public int getNumero() {
		return numero;
	}

	public boolean setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
			return true;
		} else
			return false;
	}

}
