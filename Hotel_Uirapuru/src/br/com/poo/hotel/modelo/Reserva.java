package br.com.poo.hotel.modelo;

import java.util.Date;

public class Reserva {

	private Date dataChegada;
	private Date horaChegada;
	private Date dataSaida;
	private Date horaSaida;
	private double taxaMulta;
	private double desconto;
	private TipoAcomodacao tipoAcomodacao;
	private Acompanhante acompanhante;
	private Hospede hospedePrincipal;
	
	public Reserva(Date dataChegada, Date horaChegada, Date dataSaida,
			Date horaSaida, double taxaMulta, double desconto,
			TipoAcomodacao tipoAcomodacao, Acompanhante acompanhante,
			Hospede hospedePrincipal) {
		super();
		this.dataChegada = dataChegada;
		this.horaChegada = horaChegada;
		this.dataSaida = dataSaida;
		this.horaSaida = horaSaida;
		this.taxaMulta = taxaMulta;
		this.desconto = desconto;
		this.tipoAcomodacao = tipoAcomodacao;
		this.acompanhante = acompanhante;
		this.hospedePrincipal = hospedePrincipal;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Date getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(Date horaChegada) {
		this.horaChegada = horaChegada;
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

	public double getTaxaMulta() {
		return taxaMulta;
	}

	public void setTaxaMulta(double taxaMulta) {
		this.taxaMulta = taxaMulta;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public TipoAcomodacao getTipoAcomodacao() {
		return tipoAcomodacao;
	}

	public void setTipoAcomodacao(TipoAcomodacao tipoAcomodacao) {
		this.tipoAcomodacao = tipoAcomodacao;
	}

	public Acompanhante getAcompanhante() {
		return acompanhante;
	}

	public void setAcompanhante(Acompanhante acompanhante) {
		this.acompanhante = acompanhante;
	}

	public Hospede getHospedePrincipal() {
		return hospedePrincipal;
	}

	public void setHospedePrincipal(Hospede hospedePrincipal) {
		this.hospedePrincipal = hospedePrincipal;
	}
	
}
