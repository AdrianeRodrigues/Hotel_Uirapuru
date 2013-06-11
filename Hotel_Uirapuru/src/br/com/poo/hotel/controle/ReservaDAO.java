package br.com.poo.hotel.controle;

import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.modelo.Reserva;

public class ReservaDAO implements DAO<Reserva> {

	@Override
	public boolean inserir(Reserva arg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Reserva arg, int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reserva buscar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Retorna uma String contendo todas as reservas feitas para o dia atual.
	 * Essa String contem:
	 * <li>Nome do hospede principal;</li>
	 * <li>Telefone para contato;</li>
	 * <li>Tipo de acomodação;</li>
	 * <li>Data prevista para saída.</li>
	 * @return Retorna um relatorio contendo todas as reservas agendadas para o dia,
	 * contendo todas as informações referentes da mesma.
	 */
	public String impressao() {
		
		StringBuilder str = new StringBuilder();
		
		for (Reserva r : listar()) {
		
			str.append("\nHospede principal\n");
			str.append(r.getHospedePrincipal().getNome());
			str.append("\nTelefone para contato\n");
			str.append(r.getHospedePrincipal().getTelefone().toString());
			
		}
		
		return str.toString();
	}
}
