package br.com.poo.hotel.modelo;

public class ItemConsumido {

	private double quantidade;
	private Item item;

	public ItemConsumido(double quantidade, Item item) {
		setQuantidade(quantidade);
		setItem(item);
	}

	public double getQuantidade() {
		return quantidade;
	}

	public boolean setQuantidade(double quantidade) {
		if (quantidade > 0) {
			this.quantidade = quantidade;
			return true;
		}
		return false;
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
