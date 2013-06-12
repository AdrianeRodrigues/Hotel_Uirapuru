package br.com.poo.hotel.modelo;

import java.util.Date;

public class Consumo {
	
	private Date data;
	private ItemConsumido itemConsumido;
	private Funcionario funcionarioResponsavel;
	
	public Consumo(Date data, ItemConsumido itemConsumido,
			Funcionario funcionario) {
		setData(data);
		setItemConsumido(itemConsumido);
		setFuncionario(funcionario);
	}

	public Date getData() {
		return data;
	}
	
	public boolean setData(Date data) {
		if (data != null) {
			this.data = data;
			return true;
		} else
			return false;
	}

	public ItemConsumido getItemConsumido() {
		return itemConsumido;
	}

	public boolean setItemConsumido(ItemConsumido itemConsumido) {
		if (itemConsumido != null) {
			this.itemConsumido = itemConsumido;
			return true;
		} else
			return false;
	}

	public Funcionario getFuncionario() {
		return funcionarioResponsavel;
	}

	public boolean setFuncionario(Funcionario funcionario) {
		if (funcionario != null) {
			this.funcionarioResponsavel = funcionario;
			return true;
		} else
			return false;
	}
	
}
