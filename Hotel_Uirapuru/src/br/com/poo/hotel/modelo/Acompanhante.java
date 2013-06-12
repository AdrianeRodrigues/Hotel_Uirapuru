package br.com.poo.hotel.modelo;

public class Acompanhante {

	private String nome;
	private int idade;
	
	public Acompanhante(String nome, int idade) {
		this.nome = nome;
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
			return true;
		} else
			return false;
	}
	
}
