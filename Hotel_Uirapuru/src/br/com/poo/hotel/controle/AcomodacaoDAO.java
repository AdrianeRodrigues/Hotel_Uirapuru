package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Acomodacao;


public class AcomodacaoDAO implements DAO<Acomodacao> {

	@Override
	public boolean inserir(Acomodacao acomodacao) {
		
		String comandoSql = "INSERT INTO Acomodacao VALUES (?,?,?,?)";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, acomodacao.getNumero());
			p.setInt(2, acomodacao.getAndar());
			p.setBoolean(3, acomodacao.isOcupado());
			p.setInt(4, acomodacao.getTipoAcomodacao().getCodigo());
			
			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(Acomodacao acomodacao) {

		String comandoSql = "DELETE FROM Acomodacao WHERE numero=? AND andar=?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, acomodacao.getNumero());
			p.setInt(2, acomodacao.getAndar());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
		
	}

	@Override
	public boolean alterar(Acomodacao acomodacao) {
		
		String comandoSql = "UPDATE Acomodacao SET numero=?,andar=?,ocupado=?,tipo_acomodacao=?" +
				" WHERE numero=? AND andar=?";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, acomodacao.getNumero());
			p.setInt(2, acomodacao.getAndar());
			p.setBoolean(3, acomodacao.isOcupado());
			p.setInt(4, acomodacao.getTipoAcomodacao().getCodigo());
			p.setInt(5, acomodacao.getNumero());
			p.setInt(6, acomodacao.getAndar());
			
			return p.execute();
			
		} catch (SQLException e) {
			return false;
		}		
		
	}
	
	@Override
	public List<Acomodacao> listar() {
		
		String comandoSql = "";
		
		return null;
	}
	
}
