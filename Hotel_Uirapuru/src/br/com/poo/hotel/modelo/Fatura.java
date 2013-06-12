package br.com.poo.hotel.modelo;

import java.util.Date;

import br.com.poo.hotel.utilitarios.Verificador;

public class Fatura {

	private String numero;
	private Date dataNascimento;
	private double total;
	private Saida saida;

	public Fatura(String numero, Date dataNascimento, double total, Saida saida) {
		setNumero(numero);
		setDataNascimento(dataNascimento);
		setTotal(total);
		setSaida(saida);
	}

	public String getNumero() {
		return numero;
	}

	public boolean setNumero(String numero) {
		if (Verificador.isNumero(numero)) {
			this.numero = numero;
			return true;
		} else
			return false;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public boolean setDataNascimento(Date dataNascimento) {
		if (dataNascimento != null) {
			this.dataNascimento = dataNascimento;
			return true;
		} else
			return false;
	}

	public double getTotal() {
		return total;
	}

	public boolean setTotal(double total) {
		if (total >= 0) {
			this.total = total;
			return true;
		} else
			return false;
	}

	public Saida getSaida() {
		return saida;
	}

	public boolean setSaida(Saida saida) {
		if (saida != null) {
			this.saida = saida;
			return true;
		} else
			return false;
	}

}
