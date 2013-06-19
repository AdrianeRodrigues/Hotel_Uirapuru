package br.com.poo.hotel.controle;

import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.modelo.Consumo;

public class ConsumoDAO implements DAO<Consumo> {

	@Override
	public boolean inserir(Consumo arg) {
		
		String comandoSql = "INSERT INTO ";
		
	}

	@Override
	public boolean remover(Consumo arg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Consumo arg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Consumo> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
