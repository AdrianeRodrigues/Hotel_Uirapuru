package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.TipoAcomodacao;

public class TipoAcomodacaoDAO implements DAO<TipoAcomodacao> {

	@Override
	public boolean inserir(TipoAcomodacao tipoAcomodacao) {

		String comandoSql = "INSERT INTO Tipo_Acomodacao (" +
				"descricao," + 				//1
				"quantidade," +				//2
				"preco_diaria," +			//3
				"numero_adultos," +			//4
				"numero_criancas," +		//5
				" VALUES (?,?,?,?,?,?)";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, tipoAcomodacao.getDescricao());
			p.setInt(2, tipoAcomodacao.getQuantidade());
			p.setDouble(3, tipoAcomodacao.getPrecoDiaria());
			p.setInt(4, tipoAcomodacao.getNumeroAdultos());
			p.setInt(5, tipoAcomodacao.getNumeroCriancas());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(TipoAcomodacao tipoAcomodacao) {

		String comandoSql = "DELETE FROM Tipo_Acomodacao WHERE codigo_tipoA = ?";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, tipoAcomodacao.getCodigo());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean alterar(TipoAcomodacao tipoAcomodacao) {

		String comandoSql = "UPDATE Tipo_Acomodacao SET " +
				"descricao=?," +				//1
				"quantidade=?," +				//2
				"preco_diaria=?," +				//3
				"numero_adultos=?," +			//4
				"numero_criancas=?" +			//5
				" WHERE codigo_tipoA = ?";		//6
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setString(1, tipoAcomodacao.getDescricao());
			p.setInt(2, tipoAcomodacao.getQuantidade());
			p.setDouble(3, tipoAcomodacao.getPrecoDiaria());
			p.setInt(4, tipoAcomodacao.getNumeroAdultos());
			p.setInt(5, tipoAcomodacao.getNumeroCriancas());
			p.setInt(6, tipoAcomodacao.getCodigo());
			
			return p.execute();
			
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public List<TipoAcomodacao> listar() {
		
		String comandoSql = "SELECT * FROM Tipo_Acomodacao";
		
		List<TipoAcomodacao> acomodacaos = new ArrayList<>();
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			ResultSet r = p.executeQuery();
			
			while (r.next()) {
				
				acomodacaos.add(new TipoAcomodacao(r.getInt("codigo_tipoA"), r.getString("descricao"), 
						r.getInt("quantidade"), r.getDouble("preco_diaria"), r.getInt("numero_adultos"), 
						r.getInt("numero_criancas")));
			}
			
		} catch (SQLException e) {
			return acomodacaos;
		}
		
		return acomodacaos;
	}

}
