package br.com.poo.hotel.modelo;

public class ItemConsumido {

	private double quantidade;
	private Item item;
	
	public ItemConsumido(double quantidade, Item item) {
		super();
		this.quantidade = quantidade;
		this.item = item;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public double totalItem() {
		return item.getPrecoVenda() * quantidade;
	}
}
