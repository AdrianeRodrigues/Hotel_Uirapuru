package br.com.poo.hotel.modelo;

import java.util.Date;
import java.util.List;

public class Entrada {

	private Date dataChegada;
	private Date horaChegada;
	private Date dataSaida;
	private Date horaSaida;
	private int numeroAcomadacoes;
	private double valorDiaria;
	private Hospede hospedePrincipal;
	private List<Acompanhante> acompanhantes;
	private Funcionario funcionarioResponsavel;
	
	public Entrada(Date dataChegada, Date horaChegada, Date dataSaida,
			Date horaSaida, int numeroAcomadacoes, double valorDiaria,
			Hospede hospedePrincipal, List<Acompanhante> acompanhantes, Funcionario funcionarioResponsavel) {
		this.dataChegada = dataChegada;
		this.horaChegada = horaChegada;
		this.dataSaida = dataSaida;
		this.horaSaida = horaSaida;
		this.numeroAcomadacoes = numeroAcomadacoes;
		this.valorDiaria = valorDiaria;
		this.hospedePrincipal = hospedePrincipal;
		this.acompanhantes = acompanhantes;
		this.funcionarioResponsavel = funcionarioResponsavel;
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

	public int getNumeroAcomadacoes() {
		return numeroAcomadacoes;
	}

	public void setNumeroAcomadacoes(int numeroAcomadacoes) {
		this.numeroAcomadacoes = numeroAcomadacoes;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Hospede getHospedePrincipal() {
		return hospedePrincipal;
	}

	public void setHospedePrincipal(Hospede hospedePrincipal) {
		this.hospedePrincipal = hospedePrincipal;
	}

	public List<Acompanhante> getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhante(List<Acompanhante> acompanhantes) {
		this.acompanhantes = acompanhantes;
	}

	public Funcionario getFuncionarioResponsavel() {
		return funcionarioResponsavel;
	}

	public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
		this.funcionarioResponsavel = funcionarioResponsavel;
	}
	
}
