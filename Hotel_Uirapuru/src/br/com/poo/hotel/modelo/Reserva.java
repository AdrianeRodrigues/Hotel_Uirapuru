package br.com.poo.hotel.modelo;

import java.util.Date;
import java.util.List;

public class Reserva {

	private Date dataChegada;
	private Date dataSaida;
	private double taxaMulta;
	private double desconto;
	private TipoAcomodacao tipoAcomodacao;
	private List<Acompanhante> acompanhantes;
	private Hospede hospede;

	public Reserva(Date dataChegada, Date dataSaida, double taxaMulta,
			double desconto, TipoAcomodacao tipoAcomodacao,
			List<Acompanhante> acompanhantes, Hospede hospede) {
		setAcompanhantes(acompanhantes);
		setDataChegada(dataChegada);
		setDataSaida(dataSaida);
		setDesconto(desconto);
		setHospede(hospede);
		setTaxaMulta(taxaMulta);
		setTipoAcomodacao(tipoAcomodacao);
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public double getTaxaMulta() {
		return taxaMulta;
	}

	public boolean setTaxaMulta(double taxaMulta) {
		if (taxaMulta >= 0) {
			this.taxaMulta = taxaMulta;
			return true;
		}
		return false;
	}

	public double getDesconto() {
		return desconto;
	}

	public boolean setDesconto(double desconto) {
		if (desconto >= 0) {
			this.desconto = desconto;
			return true;
		}
		return false;
	}

	public TipoAcomodacao getTipoAcomodacao() {
		return tipoAcomodacao;
	}

	public void setTipoAcomodacao(TipoAcomodacao tipoAcomodacao) {
		this.tipoAcomodacao = tipoAcomodacao;
	}

	public List<Acompanhante> getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhantes(List<Acompanhante> acompanhantes) {
		this.acompanhantes = acompanhantes;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

}
