package br.com.poo.hotel.modelo;

public class Endereco {

	private String logradouro;
	private String bairro;
	private String cidade;
	private String numero;
	private String complemento;
	private String estado;
	private String pais;
	
	public Endereco(String logradouro, String bairro, String cidade,
			String numero, String complemento, String estado, String pais) {
		setLogradouro(logradouro);
		setBairro(bairro);
		setCidade(cidade);
		setNumero(numero);
		setComplemento(complemento);
		setEstado(estado);
		setPais(pais);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public boolean setEstado(String estado) {
		if (estado.length() == 2) {
			this.estado = estado.toUpperCase();
			return true;
		} else
			return false;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
