package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Time;

import java.util.ArrayList;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Acomodacao;
import br.com.poo.hotel.modelo.Estadia;
import br.com.poo.hotel.modelo.Funcionario;
import br.com.poo.hotel.modelo.Hospede;

/**
 * 
 * @author guilherme
 *
 */

public class EstadiaDAO implements DAO<Estadia> {

	@Override
	public boolean inserir(Estadia estadia) {
		
		String comandoSql = "INSERT INTO Estadia (data_chegada, hora_chegada, data_saida" +
				"hora_saida, valor_total, valor_telefonemas, desconto, data_saidaprevista," +
				"hospede, op_pagamento, acomodacao) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setDate(1, new Date(estadia.getDataChegada().getTime()));
			p.setTime(2, new Time(estadia.getHoraChegada().getTime()));
			p.setDate(3, new Date(estadia.getDataSaida().getTime()));
			p.setTime(4, new Time(estadia.getHoraSaida().getTime()));
			p.setDouble(5, estadia.getValorTotal());
			p.setDouble(6, estadia.getValorTelefonemas());
			p.setDouble(7, estadia.getDesconto());
			p.setDate(8, new Date(estadia.getDataSaidaPrevista().getTime()));
			p.setString(9, estadia.getHospede().getCpf());
			p.setString(10, estadia.getOpcaoPagamento().name());
			//fatura
			p.setInt(11, estadia.getAcomodacao().getCodigo());
			p.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean remover(Estadia estadia) {
		String comandoSql = "DELETE FROM Estadia WHERE codigo_estadia=?";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setInt(1, estadia.getCodigo());
			p.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean alterar(Estadia estadia) {
		
		String comandoSql = "UPDATE Estadia SET " +
				"data_chegada=?, " +
				"hora_chegada=?, " +
				"data_saida=?, " +
				"hora_saida=?, " +
				"valor_total=?, " +
				"valor_telefonemas=?, " +
				"desconto=?, " +
				"data_saidaprevista=?, " +
				"hospede=?, " +
				"op_pagamento=?, " +
				"acomodacao=? " +
				"WHERE codigo_estadia=?";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setDate(1, new Date(estadia.getDataChegada().getTime()));
			p.setTime(2, new Time(estadia.getHoraChegada().getTime()));
			p.setDate(3, new Date(estadia.getDataSaida().getTime()));
			p.setTime(4, new Time(estadia.getHoraSaida().getTime()));
			p.setDouble(5, estadia.getValorTotal());
			p.setDouble(6, estadia.getValorTelefonemas());
			p.setDouble(7, estadia.getDesconto());
			p.setDate(8, new Date(estadia.getDataSaidaPrevista().getTime()));
			p.setString(9, estadia.getHospede().getCpf());
			p.setString(10, estadia.getOpcaoPagamento().name());
			//fatura
			p.setInt(11, estadia.getAcomodacao().getCodigo());
			p.setInt(12, estadia.getCodigo());
			p.execute();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Estadia> listar() {
		
		String comandoSql = "SELECT * FROM Estadia";
		List<Estadia> estadias = new ArrayList<>();
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			ResultSet r = p.executeQuery();
			
			while (r.next()) {
				
				Acomodacao acomodacao = new AcomodacaoDAO().buscaPorID(r.getInt("acomodacao"));
				Hospede hospede = new HospedeDAO().buscarID(r.getString("hospede"));
				Funcionario funcionario = new FuncionarioDAO().buscarId(r.getInt("funcionario"));
				
				estadias.add(new Estadia(r.getInt("codigo_estadia"), 
						(java.util.Date) r.getDate("data_chegada"), 
						(java.util.Date) r.getTime("hora_chegada"),
						(java.util.Date) r.getDate("data_saida"), 
						(java.util.Date) r.getTime("hora_saida"), 
						(java.util.Date) r.getDate("data_saidaprevista"), 
						r.getDouble("valor_total"), 
						r.getDouble("valorTelefonemas"), 
						r.getDouble("desconto"), 
						acomodacao, 
						hospede, 
						funcionario, 
						opcaoPagamento, 
						acompanhantes, 
						consumos));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Estadia buscarID(int codigo) {
		//TODO 
		return null;
	}
}
