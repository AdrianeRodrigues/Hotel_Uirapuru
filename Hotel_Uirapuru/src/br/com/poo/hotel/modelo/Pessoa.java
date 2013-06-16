package br.com.poo.hotel.modelo;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String login;
	private String senha;
	private Date dataNascimento;
	private Endereco endereco;
	private Telefone telefone;
	private Permissao permissao;
	
	public Pessoa(String nome, String login, String senha, Date dataNascimento,
			Endereco endereco, Telefone telefone, Permissao permissao) {
		setNome(nome);
		setLogin(login);
		setSenha(senha);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelefone(telefone);
		setPermissao(permissao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}
	
}
