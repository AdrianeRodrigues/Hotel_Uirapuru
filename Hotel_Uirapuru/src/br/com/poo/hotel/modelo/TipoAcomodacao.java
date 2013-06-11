package br.com.poo.hotel.modelo;

public class TipoAcomodacao {

	private int codigo;
	private String descricao;
	private int quantidade;
	private double precoDiaria;
	private int numeroAdultos;
	private int numeroCriancas;
	
	public TipoAcomodacao(int codigo, String descricao, int quantidade,
			double precoDiaria, int numeroAdultos, int numeroCriancas) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoDiaria = precoDiaria;
		this.numeroAdultos = numeroAdultos;
		this.numeroCriancas = numeroCriancas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public int getNumeroAdultos() {
		return numeroAdultos;
	}

	public void setNumeroAdultos(int numeroAdultos) {
		this.numeroAdultos = numeroAdultos;
	}

	public int getNumeroCriancas() {
		return numeroCriancas;
	}

	public void setNumeroCriancas(int numeroCriancas) {
		this.numeroCriancas = numeroCriancas;
	}
	
}
