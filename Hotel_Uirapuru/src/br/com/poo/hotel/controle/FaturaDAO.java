package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Fatura;

public class FaturaDAO implements DAO<Fatura> {

	@Override
	public boolean inserir(Fatura fatura) {
		
		String comandoSql = "INSERT INTO Fatura VALUES (?,?,?)";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, fatura.getNumero());
			p.setDate(2, new Date(fatura.getDataNascimento().getTime()));
			p.setDouble(3, fatura.getTotal());

			return p.execute();
			
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(Fatura arg) {
		
		String comandoSql = "DELETE FROM "
	}

	@Override
	public boolean alterar(Fatura arg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fatura> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
