package br.com.poo.hotel.modelo;

import java.util.Date;

public class Funcionario extends Pessoa {

	private int codigo;

	public Funcionario(String nome, String login, String senha,
			Date dataNascimento, Endereco endereco, Telefone telefone,
			Permissao permissao, int codigo) {
		super(nome, login, senha, dataNascimento, endereco, telefone, permissao);
		setCodigo(codigo);
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean setCodigo(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
			return true;
		}
		return false;
	}
}
