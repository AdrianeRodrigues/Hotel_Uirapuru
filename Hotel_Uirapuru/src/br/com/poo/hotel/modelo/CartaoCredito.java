package br.com.poo.hotel.modelo;

public class CartaoCredito {

	private int agencia;
	private int numero;
	
	public CartaoCredito(int agencia, int numero) {
		super();
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
