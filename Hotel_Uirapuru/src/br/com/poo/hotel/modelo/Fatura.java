package br.com.poo.hotel.modelo;

import java.util.Date;

public class Fatura {
	private String numero;
	private Date dataVencimento;
	private double total;
	private Estadia estadia;

	public Fatura(String numero, Date dataVencimento, double total,
			Estadia estadia) {
		setNumero(numero);
		setDataVencimento(dataVencimento);
		setTotal(total);
		setEstadia(estadia);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataNascimento() {
		return dataVencimento;
	}

	public boolean setDataVencimento(Date dataVencimento) {
		if (dataVencimento != null) {
			this.dataVencimento = dataVencimento;
			return true;
		}
		return false;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Estadia getEstadia() {
		return estadia;
	}

	public boolean setEstadia(Estadia estadia) {
		if (estadia != null) {
			this.estadia = estadia;
			return true;
		}
		return false;
	}

}
