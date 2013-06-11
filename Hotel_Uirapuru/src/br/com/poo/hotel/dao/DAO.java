package br.com.poo.hotel.dao;

import java.util.List;

public interface DAO<T > {

	public boolean inserir(T arg);
	public boolean remover(int codigo);
	public boolean alterar(T arg, int codigo);
	public T buscar(int codigo);
	public List<T > listar();
}
