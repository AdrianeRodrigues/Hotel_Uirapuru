package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.CartaoCredito;
import br.com.poo.hotel.modelo.Hospede;

public class CartaoCreditoDAO implements DAO<CartaoCredito> {

	@Override
	public boolean inserir(CartaoCredito cartaoCredito) {
		
		String comandoSql = "INSERT INTO CartaoCredito VALUES (?,?,?)";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, cartaoCredito.getHospede().getCpf());
			p.setInt(2, cartaoCredito.getAgencia());
			p.setInt(3, cartaoCredito.getNumero());

			return p.execute();
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(CartaoCredito cartaoCredito) {
		
		String comandoSql = "DELETE FROM CartaoCredito WHERE agencia=? AND numero=?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, cartaoCredito.getAgencia());
			p.setInt(2, cartaoCredito.getNumero());

			return p.execute();
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean alterar(CartaoCredito cartaoCredito) {
		
		String comandoSql = "UPDATE CartaoCredito SET hospede=?";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, cartaoCredito.getHospede().getCpf());

			return p.execute();
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public List<CartaoCredito> listar() {
	
		String comandoSql = "SELECT * FROM CartaoCredito";

		List<CartaoCredito> cartaoCreditos = new ArrayList<>();
				
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			ResultSet r = p.executeQuery();
			
			Hospede hospede = new HospedeDAO().buscar(r.getString("cpf")); 
					
			while (r.next()) {
				cartaoCreditos.add(new CartaoCredito(r.getInt("agencia"), r.getInt("senha"), 
						hospede));
			}

		} catch (SQLException e) {
			return cartaoCreditos;
		}
		return cartaoCreditos;
	}
}
