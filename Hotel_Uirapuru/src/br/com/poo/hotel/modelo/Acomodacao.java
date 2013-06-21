package br.com.poo.hotel.modelo;

public class Acomodacao {
	private int codigo;
	private int andar;
	private int numero;
	private boolean ocupado;
	private TipoAcomodacao tipoAcomodacao;

	public Acomodacao(int codigo, int andar, int numero, TipoAcomodacao tipoAcomodacao) {
		setAndar(andar);
		setNumero(numero);
		setTipoAcomodacao(tipoAcomodacao);
		setCodigo(codigo);
		ocupado = true;
	}
	
	public Acomodacao(int andar, int numero, TipoAcomodacao tipoAcomodacao) {
		setAndar(andar);
		setNumero(numero);
		setTipoAcomodacao(tipoAcomodacao);
		ocupado = true;
	}

	public int getAndar() {
		return andar;
	}

	public boolean setAndar(int andar) {
		if (andar > 0) {
			this.andar = andar;
			return true;
		}
		return false;
	}

	public int getNumero() {
		return numero;
	}

	public boolean setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
			return true;
		}
		return false;
	}

	public TipoAcomodacao getTipoAcomodacao() {
		return tipoAcomodacao;
	}

	public boolean setTipoAcomodacao(TipoAcomodacao tipoAcomodacao) {
		if (tipoAcomodacao != null) {
			this.tipoAcomodacao = tipoAcomodacao;
			return true;
		}
		return false;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
