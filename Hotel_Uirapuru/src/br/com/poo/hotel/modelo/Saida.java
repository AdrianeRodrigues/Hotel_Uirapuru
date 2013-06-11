package br.com.poo.hotel.modelo;

import java.util.Date;

public class Saida {

	private Date dataSaida;
	private Date horaSaida;
	private int numeroDiarias;
	private double valorDiaria;
	private double valorTelefonemas;
	private double desconto;
	private Hospede hospede;
	private OpcaoPagamento opcaoPagamento;
	
	public Saida(Date dataSaida, Date horaSaida, int numeroDiarias,
			double valorDiaria, double valorTelefonemas, double desconto) {
		super();
		this.dataSaida = dataSaida;
		this.horaSaida = horaSaida;
		this.numeroDiarias = numeroDiarias;
		this.valorDiaria = valorDiaria;
		this.valorTelefonemas = valorTelefonemas;
		this.desconto = desconto;
	}
	
	public Date getDataSaida() {
		return dataSaida;
	}
	
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Date getHoraSaida() {
		return horaSaida;
	}
	
	public void setHoraSaida(Date horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public int getNumeroDiarias() {
		return numeroDiarias;
	}
	
	public void setNumeroDiarias(int numeroDiarias) {
		this.numeroDiarias = numeroDiarias;
	}
	
	public double getValorDiaria() {
		return valorDiaria;
	}
	
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public double getValorTelefonemas() {
		return valorTelefonemas;
	}
	
	public void setValorTelefonemas(double valorTelefonemas) {
		this.valorTelefonemas = valorTelefonemas;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public OpcaoPagamento getOpcaoPagamento() {
		return opcaoPagamento;
	}

	public void setOpcaoPagamento(OpcaoPagamento opcaoPagamento) {
		this.opcaoPagamento = opcaoPagamento;
	}
	
}
