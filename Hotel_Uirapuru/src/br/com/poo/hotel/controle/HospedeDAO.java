package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Hospede;

public class HospedeDAO implements DAO<Hospede> {

	@Override
	public boolean inserir(Hospede hospede) {
		
		String comandoSql = "INSERT INTO Hospede VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try ( Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql) ) {
			
			p.setString(1, hospede.getCpf());
			p.setString(2, hospede.getNome());
			p.setDate(3, new Date(hospede.getDataNascimento().getTime()));
			p.setString(4, hospede.getEmail());
			p.setString(5, hospede.getRg());
			p.setString(6, hospede.getPassaporte());
			p.setString(7, hospede.getNomePai());
			p.setString(8, hospede.getNomeMae());
			p.setString(9, hospede.getLogin());
			p.setString(10, hospede.getSenha());
			p.setString(11, hospede.getPermissao().toString());
			p.setString(12, hospede.getEndereco().getLogradouro());
			p.setString(13, hospede.getEndereco().getBairro());
			p.setString(14, hospede.getEndereco().getCidade());
			p.setString(15, hospede.getEndereco().getNumero());
			p.setString(16, hospede.getEndereco().getComplemento());
			p.setString(17, hospede.getEndereco().getEstado());
			p.setString(18, hospede.getEndereco().getPais());
			p.setString(19, hospede.getTelefone().getCodigoArea());
			p.setString(20, hospede.getTelefone().getPrefixo());
			p.setString(21, hospede.getTelefone().getNumeroLinha());
			
			return p.execute();
			
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Hospede arg, int codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hospede buscar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospede> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
