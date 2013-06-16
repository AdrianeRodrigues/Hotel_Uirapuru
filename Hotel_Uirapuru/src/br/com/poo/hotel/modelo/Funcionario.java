package br.com.poo.hotel.modelo;

import java.util.Date;

public class Funcionario extends Pessoa {

	public Funcionario(String nome, String login, String senha,
			Date dataNascimento, Endereco endereco, Telefone telefone,
			Permissao permissao) {
		super(nome, login, senha, dataNascimento, endereco, telefone, permissao);
	}

	
	
}
