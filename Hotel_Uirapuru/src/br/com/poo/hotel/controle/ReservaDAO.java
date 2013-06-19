package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Acomodacao;
import br.com.poo.hotel.modelo.Reserva;
import br.com.poo.hotel.modelo.TipoAcomodacao;

public class ReservaDAO implements DAO<Reserva> {

	@Override
	public boolean inserir(Reserva reserva) {

		String comandoSql = "INSERT INTO Reserva VALUES (?,?,?,?,?,?)";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, reserva.getCodigo());
			p.setDate(2, new Date(reserva.getDataChegada().getTime()));
			p.setDate(3, new Date(reserva.getDataSaida().getTime()));
			p.setDouble(4, reserva.getTaxaMulta());
			p.setDouble(5, reserva.getDesconto());
			p.setString(6, reserva.getHospede().getCpf());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(Reserva reserva) {

		String comandoSql = "DELETE FROM Reserva WHERE codigo_reserva = ?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, reserva.getCodigo());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean alterar(Reserva reserva) {

		String comandoSql = "UPDATE Reserva SET " +
				"data_chegada=?," +
				"data_saida=?," +
				"taxa_multa=?," +
				"desconto=?," +
				"hospede=?" +
				"WHERE codigo_reserva = ?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setDate(1, new Date(reserva.getDataChegada().getTime()));
			p.setDate(2, new Date(reserva.getDataSaida().getTime()));
			p.setDouble(3, reserva.getTaxaMulta());
			p.setDouble(4, reserva.getDesconto());
			p.setString(5, reserva.getHospede().getCpf());
			p.setInt(6, reserva.getCodigo());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public List<Reserva> listar() {
		
		String comandoSql = "SELECT * FROM Reserva";

		List<Reserva> reservas = new ArrayList<>();

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			ResultSet r = p.executeQuery();

			while (r.next()) {

				Acomodacao acomodacao = new AcomodacaoDAO().buscarID(r.getInt("numero"), r);
				
				reservas.add(new Reserva(r.getDate("data_chegada"), r.getDate("data_saida"),
						r.getDouble("taxa_multa"), r.getDouble("desconto"), acomodacao, acompanhantes, hospede))
			}

		} catch (SQLException e) {
			return tipoAcomodacao;
		}
		return tipoAcomodacao;
	}

	/**
	 * Retorna uma String contendo todas as reservas feitas para o dia atual.
	 * Essa String contem:
	 * <li>Nome do hospede principal;</li>
	 * <li>Telefone para contato;</li>
	 * <li>Tipo de acomodação;</li>
	 * <li>Data prevista para saída.</li>
	 * @return Retorna um relatorio contendo todas as reservas agendadas para o dia,
	 * contendo todas as informações referentes da mesma.
	 */
	public String impressao() {
		StringBuilder str = new StringBuilder();
		for (Reserva r : listar()) {
			str.append("\nHospede principal\n");
			str.append(r.getHospede().getNome());
			str.append("\nTelefone para contato\n");
			str.append(r.getHospede().getTelefone().toString());
		}
		return str.toString();
	}
}
