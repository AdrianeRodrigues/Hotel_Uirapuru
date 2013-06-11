package br.com.poo.hotel.modelo;

public class Acomodacao {

	private int andar;
	private int numero;
	private TipoAcomodacao tipoAcomodacao;
	
	public Acomodacao(int andar, int numero, TipoAcomodacao tipoAcomodacao) {
		this.andar = andar;
		this.numero = numero;
		this.tipoAcomodacao = tipoAcomodacao;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoAcomodacao getTipoAcomodacao() {
		return tipoAcomodacao;
	}

	public void setTipoAcomodacao(TipoAcomodacao tipoAcomodacao) {
		this.tipoAcomodacao = tipoAcomodacao;
	}
	
}
