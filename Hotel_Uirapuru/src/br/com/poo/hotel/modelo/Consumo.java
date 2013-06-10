package br.com.poo.hotel.modelo;

import java.util.Date;

public class Consumo {
	
	private Date data;
	private ItemConsumido itemConsumido;
	private Funcionario funcionarioResponsavel;
	
	public Consumo(Date data, ItemConsumido itemConsumido,
			Funcionario funcionario) {
		super();
		this.data = data;
		this.itemConsumido = itemConsumido;
		this.funcionarioResponsavel = funcionario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ItemConsumido getItemConsumido() {
		return itemConsumido;
	}

	public void setItemConsumido(ItemConsumido itemConsumido) {
		this.itemConsumido = itemConsumido;
	}

	public Funcionario getFuncionario() {
		return funcionarioResponsavel;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionarioResponsavel = funcionario;
	}
	
}
