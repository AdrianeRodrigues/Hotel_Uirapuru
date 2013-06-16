package br.com.poo.hotel.modelo;

import java.util.Date;

public class Quitacao {

	private Date dataPagamento;
	private double valorTotalPago;
	private double juros;
	private double multa;
	private Fatura fatura;

	public Quitacao(Date dataPagamento, double valorTotalPago, double juros,
			double multa, Fatura fatura) {
		setDataPagamento(dataPagamento);
		setFatura(fatura);
		setJuros(juros);
		setMulta(multa);
		setValorTotalPago(valorTotalPago);
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getValorTotalPago() {
		return valorTotalPago;
	}

	public boolean setValorTotalPago(double valorTotalPago) {
		if (valorTotalPago > 0) {
			this.valorTotalPago = valorTotalPago;
			return true;
		}
		return false;
	}

	public double getJuros() {
		return juros;
	}

	public boolean setJuros(double juros) {
		if (juros > 0) {
			this.juros = juros;
			return true;
		}
		return false;
	}

	public double getMulta() {
		return multa;
	}

	public boolean setMulta(double multa) {
		if (multa > 0) {
			this.multa = multa;
			return true;
		}
		return false;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
