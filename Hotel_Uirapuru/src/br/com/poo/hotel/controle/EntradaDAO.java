package br.com.poo.hotel.controle;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.modelo.Acompanhante;
import br.com.poo.hotel.modelo.Entrada;

/**
 * @author Guilherme Carvalho
 * @version 1.0.0
 * @see Entrada
 * @see DAO
 */

public class EntradaDAO implements DAO<Entrada> {

	@Override
	public boolean inserir(Entrada arg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remover(int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Entrada arg, int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entrada buscar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entrada> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Recupera todos os usuários que estão hospedados no hotel. Uma String é
	 * montada com: 
	 * <li>Hospede principal;</li>
	 * <li>Acompanhates: nome e idade;</li>
	 * <li>Data Entrada;</li><li>Número da acomodação.</li>
	 * @return Uma String montada com todos os hospedes ativos no hotel contendo todas
	 * as informações da estadia.
	 */
	public String impressao() {
		
		StringBuilder str = new StringBuilder();
		
		for (Entrada e : listar()) {
			
			str.append("\nHospede principal\n");
			str.append("|_ ");
			str.append(e.getHospedePrincipal().getNome());
			str.append("\nAcompanhantes\n");
			
			for (Acompanhante a : e.getAcompanhantes()) {
				
				str.append("|_ ");
				str.append(a.getNome());
				str.append(" (");
				str.append(Calendar.getInstance().get(Calendar.YEAR) - a.getIdade());
				str.append(") anos. \n");
				
			}
			
			str.append("\nData Entrada\n");
			str.append(DateFormat.getInstance().format(e.getDataChegada()));
			str.append("\nData Saida\n");
			str.append(DateFormat.getInstance().format(e.getDataSaida()));
			str.append("\nNúmero da acomodação\n");
			str.append(e.getHospedePrincipal().getAcomodacao());
			str.append("\n--------------------------------------------------------------\n");
		}
		
		return str.toString();
	}
}
