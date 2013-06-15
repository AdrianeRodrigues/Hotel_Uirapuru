package br.com.poo.hotel.modelo;

import java.util.Date;
import java.util.List;

public class Consumo {

	private Date data;
	private List<ItemConsumido> itensConsumidos;
	private Funcionario funcionarioResponsavel;

	public Consumo(Date data, List<ItemConsumido> itensConsumidos,
			Funcionario funcionario) {
		setData(data);
		setItensConsumido(itensConsumidos);
		setFuncionario(funcionario);
	}

	public Date getData() {
		return data;
	}

	public boolean setData(Date data) {
		if (data != null) {
			this.data = data;
			return true;
		}
		return false;
	}

	public List<ItemConsumido> getItensConsumido() {
		return itensConsumidos;
	}

	public boolean setItensConsumido(List<ItemConsumido> itensConsumidos) {
		if (itensConsumidos != null) {
			this.itensConsumidos = itensConsumidos;
			return true;
		}
		return false;
	}

	public Funcionario getFuncionario() {
		return funcionarioResponsavel;
	}

	public boolean setFuncionario(Funcionario funcionario) {
		if (funcionario != null) {
			this.funcionarioResponsavel = funcionario;
			return true;
		}
		return false;
	}

}
