package br.com.poo.hotel.modelo;

public class Telefone {

	private String codigoArea;
	private String prefixo;
	private String numeroLinha;
	
	public Telefone(String codigoArea, String prefixo, String numeroLinha) {
		super();
		this.codigoArea = codigoArea;
		this.prefixo = prefixo;
		this.numeroLinha = numeroLinha;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public String getNumeroLinha() {
		return numeroLinha;
	}

	public void setNumeroLinha(String numeroLinha) {
		this.numeroLinha = numeroLinha;
	}
	
}
