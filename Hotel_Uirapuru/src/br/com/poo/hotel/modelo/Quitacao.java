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
		super();
		this.dataPagamento = dataPagamento;
		this.valorTotalPago = valorTotalPago;
		this.juros = juros;
		this.multa = multa;
		this.fatura = fatura;
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
	
	public void setValorTotalPago(double valorTotalPago) {
		this.valorTotalPago = valorTotalPago;
	}
	
	public double getJuros() {
		return juros;
	}
	
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	public Fatura getFatura() {
		return fatura;
	}
	
	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
}
