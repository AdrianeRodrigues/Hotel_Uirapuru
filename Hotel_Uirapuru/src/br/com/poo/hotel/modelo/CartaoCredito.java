package br.com.poo.hotel.modelo;

public class CartaoCredito {
	private int agencia;
	private int numero;
	private Hospede hospede;

	public CartaoCredito(int agencia, int numero, Hospede hospede) {
		setAgencia(agencia);
		setNumero(numero);
		setHospede(hospede);
	}

	public int getAgencia() {
		return agencia;
	}

	public boolean setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
			return true;
		}
		return false;
	}

	public int getNumero() {
		return numero;
	}

	public boolean setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
			return true;
		}
		return false;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

}
