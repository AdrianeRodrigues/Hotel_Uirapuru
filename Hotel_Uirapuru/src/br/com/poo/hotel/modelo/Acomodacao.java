package br.com.poo.hotel.modelo;

public class Acomodacao {

	private int andar;
	private int numero;
	private TipoAcomodacao tipoAcomodacao;
	
	public Acomodacao(int andar, int numero, TipoAcomodacao tipoAcomodacao) {
		setAndar(andar);
		setNumero(numero);
		setTipoAcomodacao(tipoAcomodacao);
	}

	public int getAndar() {
		return andar;
	}
	
	public boolean setAndar(int andar) {
		if (andar > 0) {
			this.andar = andar;
			return true;
		} else
			return false;
	}

	public int getNumero() {
		return numero;
	}

	public boolean setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
			return true;
		} else
			return false;
	}

	public TipoAcomodacao getTipoAcomodacao() {
		return tipoAcomodacao;
	}

	public boolean setTipoAcomodacao(TipoAcomodacao tipoAcomodacao) {
		if (tipoAcomodacao != null) {
			this.tipoAcomodacao = tipoAcomodacao;
			return true;
		} else
			return false;
	}
	
}
