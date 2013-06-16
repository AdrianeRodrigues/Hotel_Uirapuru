package br.com.poo.hotel.dao;

import java.util.List;

public interface DAO<T > {

	public boolean inserir(T arg);
	public boolean remover(Object pk);
	public boolean alterar(T arg, Object pk);
	public T buscar(Object pk);
	public List<T > listar();
}
