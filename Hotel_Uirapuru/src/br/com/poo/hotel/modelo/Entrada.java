package br.com.poo.hotel.modelo;

import java.util.ArrayList;
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
		setDataChegada(dataChegada);
		setHoraChegada(horaChegada);
		setDataSaida(dataSaida);
		setHoraSaida(horaSaida);
		setNumeroAcomadacoes(numeroAcomadacoes);
		setValorDiaria(valorDiaria);
		setHospedePrincipal(hospedePrincipal);
		acompanhantes = new ArrayList<>();
		setFuncionarioResponsavel(funcionarioResponsavel);
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public boolean setDataChegada(Date dataChegada) {
		if (dataChegada != null) {
			this.dataChegada = dataChegada;
			return true;
		} else
			return false;
	}

	public Date getHoraChegada() {
		return horaChegada;
	}

	public boolean setHoraChegada(Date horaChegada) {
		if (horaChegada != null) {
			this.horaChegada = horaChegada;
			return true;
		} else
			return false;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public boolean setDataSaida(Date dataSaida) {
		if (dataSaida != null) {
			this.dataSaida = dataSaida;
			return true;
		} else
			return false;
	}

	public Date getHoraSaida() {
		return horaSaida;
	}

	public boolean setHoraSaida(Date horaSaida) {
		if (horaSaida != null) {
			this.horaSaida = horaSaida;
			return true;
		} else
			return false;
	}

	public int getNumeroAcomadacoes() {
		return numeroAcomadacoes;
	}

	public boolean setNumeroAcomadacoes(int numeroAcomadacoes) {
		if (numeroAcomadacoes >= 0) {
			this.numeroAcomadacoes = numeroAcomadacoes;
			return true;
		} else
			return false;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public boolean setValorDiaria(double valorDiaria) {
		if (valorDiaria >= 0) {
			this.valorDiaria = valorDiaria;
			return true;
		} else
			return false;
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

	public boolean setAcompanhante(List<Acompanhante> acompanhantes) {
		if (acompanhantes != null) {
			this.acompanhantes = acompanhantes;
			return true;
		} else
			return false;
	}

	public Funcionario getFuncionarioResponsavel() {
		return funcionarioResponsavel;
	}

	public boolean setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
		if (funcionarioResponsavel != null) {
			this.funcionarioResponsavel = funcionarioResponsavel;
			return true;
		} else
			return false;
	}

}
