package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Acomodacao;
import br.com.poo.hotel.modelo.TipoAcomodacao;

/**
 * 
 * @author guilherme
 *
 */

public class AcomodacaoDAO implements DAO<Acomodacao> {

	@Override
	public boolean inserir(Acomodacao acomodacao) {

		String comandoSql = "INSERT INTO Acomodacao(numero, andar, ocupado, tipo_acomodacao) VALUES (?,?,?,?)";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, acomodacao.getNumero());
			p.setInt(2, acomodacao.getAndar());
			p.setBoolean(3, acomodacao.isOcupado());
			p.setInt(4, acomodacao.getTipoAcomodacao().getCodigo());
			p.execute();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean remover(Acomodacao acomodacao) {

		String comandoSql = "DELETE FROM Acomodacao WHERE codigo_acomodacao=?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, acomodacao.getCodigo());
			p.execute();	
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean alterar(Acomodacao acomodacao) {

		String comandoSql = "UPDATE Acomodacao SET numero=?,andar=?,ocupado=?,tipo_acomodacao=?" +
				" WHERE codigo_acomodacao=?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, acomodacao.getNumero());
			p.setInt(2, acomodacao.getAndar());
			p.setBoolean(3, acomodacao.isOcupado());
			p.setInt(4, acomodacao.getTipoAcomodacao().getCodigo());
			p.setInt(5, acomodacao.getCodigo());
			p.execute();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}		
	}

	@Override
	public List<Acomodacao> listar() {

		String comandoSql = "SELECT * FROM Acomodacao";

		List<Acomodacao> acomodacoes = new ArrayList<>();

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			ResultSet r = p.executeQuery();

			while (r.next()) {

				TipoAcomodacao tipoAcomodacao = 
						new TipoAcomodacaoDAO().buscarID(r.getInt("tipo_acomodacao"));

				acomodacoes.add(new Acomodacao(r.getInt("codigo_acomodacao"), r.getInt("andar"),
						r.getInt("numero"), tipoAcomodacao));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return acomodacoes;
	}

	public Acomodacao buscaPorID(int codigo) {

		String comandoSql = "SELECT * FROM Acomodacao WHERE codigo_acomodacao=?";

		Acomodacao acomodacao = null;

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, codigo);
			ResultSet r = p.executeQuery();

			while (r.next()) {

				TipoAcomodacao tipoAcomodacao = 
						new TipoAcomodacaoDAO().buscarID(r.getInt("tipo_acomodacao"));

				acomodacao = new Acomodacao(r.getInt("codigo_acomodacao"), r.getInt("andar"),
						r.getInt("numero"), tipoAcomodacao);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return acomodacao;
	}

}
