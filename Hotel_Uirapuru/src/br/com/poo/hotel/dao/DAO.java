package br.com.poo.hotel.dao;

import java.util.List;

public interface DAO<T > {

	public boolean inserir(T arg);
	public boolean remover(T arg);
	public boolean alterar(T arg);
	public List<T > listar();
}
