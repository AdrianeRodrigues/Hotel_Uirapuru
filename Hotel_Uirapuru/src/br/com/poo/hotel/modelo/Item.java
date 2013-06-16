package br.com.poo.hotel.modelo;

public class Item {

	private int codigo;
	private String descricao;
	private double precoVenda;
	private Categoria categoria;

	public Item(int codigo, String descricao, double precoVenda,
			Categoria categoria) {
		setCategoria(categoria);
		setCodigo(codigo);
		setDescricao(descricao);
		setPrecoVenda(precoVenda);
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

	public double getPrecoVenda() {
		return precoVenda;
	}

	public boolean setPrecoVenda(double precoVenda) {
		if (precoVenda > 0) {
			this.precoVenda = precoVenda;
			return true;
		}
		return false;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
