package br.com.poo.hotel.modelo;

public class Acompanhante {
	private String nome;
	private int idade;
	private Reserva reserva;
	private Estadia estadia;

	public Acompanhante(String nome, int idade, 
			Reserva reserva, Estadia estadia) {
		this(nome, idade);
		setReserva(reserva);
		setEstadia(estadia);
	}
	
	public Acompanhante(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
			return true;
		}
		return false;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Estadia getEstadia() {
		return estadia;
	}

	public void setEstadia(Estadia estadia) {
		this.estadia = estadia;
	}

}
