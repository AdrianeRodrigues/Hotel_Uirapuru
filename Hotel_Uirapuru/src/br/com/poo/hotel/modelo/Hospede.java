package br.com.poo.hotel.modelo;

import java.util.Date;
import java.util.List;

public class Hospede extends Pessoa {
	
	private String email;
	private String RG;
	private String CPF;
	private String passaporte;
	private String nomePai;
	private String nomeMae;
	private List<CartaoCredito> cartaoCredito;
	private Consumo consumo;
	private Acomodacao acomodacao;
	
	public Hospede(String nome, Date dataNascimento, Endereco endereco,
			Telefone telefone, String email, String RG, String CPF,
			String passaporte, String nomePai, String nomeMae,
			List<CartaoCredito> cartaoCredito, Consumo consumo, Acomodacao acomodacao) {
		super(nome, dataNascimento, endereco, telefone);
		this.email = email;
		this.RG = RG;
		this.CPF = CPF;
		this.passaporte = passaporte;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.cartaoCredito = cartaoCredito;
		this.consumo = consumo;
		this.acomodacao = acomodacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public List<CartaoCredito> getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(List<CartaoCredito> cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public Acomodacao getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(Acomodacao acomodacao) {
		this.acomodacao = acomodacao;
	}
	
}
