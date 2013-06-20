package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Acompanhante;
import br.com.poo.hotel.modelo.Estadia;
import br.com.poo.hotel.modelo.Reserva;

public class AcompanhanteDAO implements DAO<Acompanhante> {

	@Override
	public boolean inserir(Acompanhante acompanhante) {

		String comandoSql = "INSERT INTO Acompanhante (nome, idade) VALUES (?,?)";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, acompanhante.getNome());
			p.setInt(2, acompanhante.getIdade());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(Acompanhante acompanhante) {

		String comandoSql = "DELETE FROM Acompanhante WHERE nome = ?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, acompanhante.getNome());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean alterar(Acompanhante acompanhante) {

		String comandoSql = "UPDATE Acompanhante SET idade=? WHERE nome=?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, acompanhante.getIdade());
			p.setString(4, acompanhante.getNome());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public List<Acompanhante> listar() {

		String comandoSql = "SELECT * FROM Acompanhante";

		List<Acompanhante> acompanhantes = new ArrayList<>();

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			ResultSet r = p.executeQuery();

			while (r.next()) {
				Reserva reserva = new ReservaDAO().buscarID(r.getInt("reserva"));
				Estadia estadia = new EstadiaDAO().buscarID(r.getInt("estadia"));
				acompanhantes.add(new Acompanhante(r.getString("nome"), r.getInt("idade"), 
						reserva, estadia));
			}


		} catch (SQLException e) {
			return acompanhantes;
		}
		return acompanhantes;
	}

	public List<Acompanhante> buscarAcompanhanteReserva(int reserva) {
		
		List<Acompanhante> acompanhantes = new ArrayList<>();

		for (Acompanhante acompanhante : listar()) {
			if (acompanhante.getReserva().getCodigo() == reserva)
				acompanhantes.add(acompanhante);
		}
		return acompanhantes;
	}

}
