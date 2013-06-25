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
import br.com.poo.hotel.modelo.Acompanhante;
import br.com.poo.hotel.modelo.Hospede;
import br.com.poo.hotel.modelo.Reserva;

public class ReservaDAO implements DAO<Reserva> {

	@Override
	public boolean inserir(Reserva reserva) {

		String comandoSql = "INSERT INTO Reserva (codigo_reserva, data_chegada, data_saida, taxa_multa, desconto, hospede, acomodacao) "
                        + "VALUES (?,?,?,?,?,?,?)";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, String.valueOf(reserva.getCodigo()));
			p.setDate(2, new Date(reserva.getDataChegada().getTime()));
			p.setDate(3, new Date(reserva.getDataSaida().getTime()));
			p.setDouble(4, reserva.getTaxaMulta());
			p.setDouble(5, reserva.getDesconto());
			p.setString(6, reserva.getHospede().getCpf());
                        p.setString(7, String.valueOf(reserva.getAcomodacao().getCodigo()));
			p.execute();
                        return true;

		} catch (SQLException e) {
                    e.printStackTrace();
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

			p.execute();
                        return true;
                        
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

				Acomodacao acomodacao = new AcomodacaoDAO().buscaPorID
						(r.getInt("codigo_reserva"));

				Hospede hospede = new HospedeDAO().buscarID(r.getString("hospede"));

				List<Acompanhante> acompanhantes = new AcompanhanteDAO().
						buscarAcompanhanteReserva(r.getInt("codigo_estadia"));

				reservas.add(new Reserva(r.getDate("data_chegada"), 
						r.getDate("data_saida"), r.getDouble("taxa_multa"), 
						r.getDouble("desconto"), acomodacao, acompanhantes, hospede));
			}

		} catch (SQLException e) {
			return reservas;
		}
		return reservas;
	}

	public Reserva buscarID(int codigo) {
		
		String comandoSql = "SELECT * FROM Reserva WHERE codigo_reserva=?";
		
		Reserva reserva = null;
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setInt(1, codigo);
			
			ResultSet r = p.executeQuery();
			
			if (r.next()) {
				new Reserva(r.getDate("data_chegada"), 
						r.getDate("data_saida"), 
						r.getDouble("taxa_multa"),
						r.getDouble("desconto"), 
						new AcomodacaoDAO().buscaPorID(r.getInt("codigo_reserva")), 
						new AcompanhanteDAO().buscarAcompanhanteReserva(r.getInt("codigo_reserva")), 
						new HospedeDAO().buscarID(r.getString("hospede")),
						r.getInt("codigo_reserva"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return reserva;
		}
		return reserva;
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
