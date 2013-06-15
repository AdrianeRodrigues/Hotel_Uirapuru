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
		setCodigo(codigo);
		setDescricao(descricao);
		setQuantidade(quantidade);
		setPrecoDiaria(precoDiaria);
		setNumeroAdultos(numeroAdultos);
		setNumeroCriancas(numeroCriancas);
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public boolean setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
			return true;
		}
		return false;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public boolean setPrecoDiaria(double precoDiaria) {
		if (precoDiaria >= 0) {
			this.precoDiaria = precoDiaria;
			return true;
		}
		return false;
	}

	public int getNumeroAdultos() {
		return numeroAdultos;
	}

	public boolean setNumeroAdultos(int numeroAdultos) {
		if (numeroAdultos >= 0) {
			this.numeroAdultos = numeroAdultos;
			return true;
		}
		return false;
	}

	public int getNumeroCriancas() {
		return numeroCriancas;
	}

	public boolean setNumeroCriancas(int numeroCriancas) {
		if (numeroCriancas >= 0) {
			this.numeroCriancas = numeroCriancas;
			return true;
		}
		return false;
	}

}
