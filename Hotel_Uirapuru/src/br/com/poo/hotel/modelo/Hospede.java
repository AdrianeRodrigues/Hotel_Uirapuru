package br.com.poo.hotel.modelo;

import java.util.Date;
import java.util.List;

import br.com.poo.hotel.utilitarios.Verificador;

public class Hospede extends Pessoa {

	private String email;
	private String rg;
	private String cpf;
	private String passaporte;
	private String nomePai;
	private String nomeMae;
	private List<CartaoCredito> cartoesCredito;
	private List<Estadia> estadias;

	public Hospede(String nome, String login, String senha,
			Date dataNascimento, Endereco endereco, Telefone telefone,
			Permissao permissao, String email, String rg, String cpf,
			String passaporte, String nomePai, String nomeMae,
			List<CartaoCredito> cartoesCredito, List<Estadia> estadias) {
		super(nome, login, senha, dataNascimento, endereco, telefone, permissao);
		setEmail(email);
		setRg(rg);
		setCpf(cpf);
		setPassaporte(passaporte);
		setNomePai(nomePai);
		setNomeMae(nomeMae);
		setCartoesCredito(cartoesCredito);
		setEstadias(estadias);
	}
	
	public Hospede(String nome, String login, String senha,
			Date dataNascimento, Endereco endereco, Telefone telefone,
			Permissao permissao, String email, String rg, String cpf,
			String passaporte, String nomePai, String nomeMae, List<Estadia> estadias) {
		super(nome, login, senha, dataNascimento, endereco, telefone, permissao);
		setEmail(email);
		setRg(rg);
		setCpf(cpf);
		setPassaporte(passaporte);
		setNomePai(nomePai);
		setNomeMae(nomeMae);
		setEstadias(estadias);
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if (Verificador.validarEmail(email)) {
			this.email = email;
			return true;
		}
		return false;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		if (Verificador.validarCPF(cpf)) {
			this.cpf = cpf;
			return true;
		}
		return false;
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

	public List<CartaoCredito> getCartoesCredito() {
		return cartoesCredito;
	}

	public void setCartoesCredito(List<CartaoCredito> cartoesCredito) {
		this.cartoesCredito = cartoesCredito;
	}

	public List<Estadia> getEstadias() {
		return estadias;
	}

	public void setEstadias(List<Estadia> estadias) {
		this.estadias = estadias;
	}
	
	public boolean adicionarEstadia(Estadia estadia) {
		return estadias.add(estadia);
	}

	public boolean adicionarCartao(CartaoCredito cartaoCredito) {
		return cartoesCredito.add(cartaoCredito);
	}
	
}
