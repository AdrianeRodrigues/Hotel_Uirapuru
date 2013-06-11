package br.com.poo.hotel.modelo;

import java.util.Date;

public class Fatura {

	private String numero;
	private Date dataNascimento;
	private double total;
	private Saida saida;
	
	public Fatura(String numero, Date dataNascimento, double total, Saida saida) {
		super();
		this.numero = numero;
		this.dataNascimento = dataNascimento;
		this.total = total;
		this.saida = saida;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Saida getSaida() {
		return saida;
	}

	public void setSaida(Saida saida) {
		this.saida = saida;
	}
	
}
