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
import br.com.poo.hotel.modelo.Endereco;
import br.com.poo.hotel.modelo.Funcionario;
import br.com.poo.hotel.modelo.Permissao;
import br.com.poo.hotel.modelo.Telefone;

public class FuncionarioDAO implements DAO<Funcionario> {

	@Override
	public boolean inserir(Funcionario funcionario) {
		
		String comandoSql = 
				"INSERT INTO Funcionario (" +                                
				"login, " +					//1
				"senha, " +					//2
				"nome, " +					//3
				"data_nascimento," +		//4
				"logradouro, " +			//5
				"bairro, " +				//6
				"cidade, " +				//7
				"numero_endereco, " +		//8
				"complemento, " +			//9
				"estado, " +				//10
				"pais," +					//11
				"codigo_area, " +			//12
				"prefixo, " +				//13
				"numero_linha," +			//14
				"permissao" +				//15
				") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setString(1, funcionario.getLogin());
			p.setString(2, funcionario.getSenha());
			p.setString(3, funcionario.getNome());
			p.setDate(4, new Date(funcionario.getDataNascimento().getTime()));
			p.setString(5, funcionario.getEndereco().getLogradouro());
			p.setString(6, funcionario.getEndereco().getBairro());
			p.setString(7, funcionario.getEndereco().getCidade());
			p.setString(8, funcionario.getEndereco().getNumero());
			p.setString(9, funcionario.getEndereco().getComplemento());
			p.setString(10, funcionario.getEndereco().getEstado());
			p.setString(11, funcionario.getEndereco().getPais());
			p.setString(12, funcionario.getTelefone().getCodigoArea());
			p.setString(13, funcionario.getTelefone().getPrefixo());
			p.setString(14, funcionario.getTelefone().getNumeroLinha());
			p.setString(15, funcionario.getPermissao().name());
			
			p.execute();
                        return true;
			
		} catch (SQLException e) {
                    e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean remover(Funcionario funcionario) {
		
		String comandoSql = "DELETE FROM Funcionario WHERE codigo_funcionario = ?";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setInt(1, funcionario.getCodigo());
			
			p.execute();
                        return true;
			
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean alterar(Funcionario funcionario) {

		String comandoSql = "UPDATE funcionario " +
				"SET nome=?," + 					//1
				"data_nascimento=?," + 				//2
				"logradouro=?," + 					//3
				"bairro=?," + 						//4
				"cidade=?," + 						//5
				"numero_endereco=?," + 				//6
				"complemento=?," +					//7
				"estado=?," + 						//8
				"pais=?," + 						//9
				"codigo_area=?," + 					//10
				"prefixo=?," + 						//11
				"numero_linha=? " + 				//12
				"WHERE codigo_funcionario = ?"; 	//13
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			//System.out.println("entrou no try antes do p.set alguma coisa!");
			p.setString(1, funcionario.getNome());
			p.setDate(2, new Date(funcionario.getDataNascimento().getTime()));
			p.setString(3, funcionario.getEndereco().getLogradouro());
			p.setString(4, funcionario.getEndereco().getBairro());
			p.setString(5, funcionario.getEndereco().getCidade());
			p.setString(6, funcionario.getEndereco().getNumero());
			p.setString(7, funcionario.getEndereco().getComplemento());
			p.setString(8, funcionario.getEndereco().getEstado());
			p.setString(9, funcionario.getEndereco().getPais());
			p.setString(10, funcionario.getTelefone().getCodigoArea());
			p.setString(11, funcionario.getTelefone().getPrefixo());
			p.setString(12, funcionario.getTelefone().getNumeroLinha());
			p.setInt(13, funcionario.getCodigo());
			
                        System.out.println("aqui é antes do p.execute!");
			p.execute();
                        return true;
			
		} catch (SQLException e) {
                    e.printStackTrace();
			return false;
		}
	}

	public Funcionario buscarId(int codigo) {
		
		String comandoSql = "SELECT * FROM funcionario WHERE codigo_funcionario = ?";
		
		Funcionario funcionario = null;
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setInt(1, codigo);
			
			ResultSet r = p.executeQuery();
			
			if (r.next()) {
				Endereco endereco = new Endereco(r.getString("logradouro"), r.getString("bairro"),
						r.getString("cidade"), r.getString("numero_endereco"), r.getString("complemento"), 
						r.getString("estado"), r.getString("pais"));
				
				Telefone telefone = new Telefone(r.getString("codigo_area"), r.getString("prefixo"), 
						r.getString("numero_linha"));
				
				Permissao permissao = r.getString("permissao").equalsIgnoreCase("USUARIO")? 
						Permissao.USUARIO : Permissao.ADMINISTRADOR; 
				
				funcionario = new Funcionario(r.getString("nome"), r.getString("login"), 
						r.getString("senha"), r.getDate("data_nascimento"), endereco, telefone,
						permissao, r.getInt("codigo_funcionario"));
			}
			
		} catch (SQLException e) {
			return funcionario;
		}
		return funcionario;
	}
	
	@Override
	public List<Funcionario> listar() {
	
		String comandoSql = "SELECT * FROM Funcionario";

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			ResultSet r = p.executeQuery();
			
			while (r.next()) {
				Endereco endereco = new Endereco(r.getString("logradouro"), r.getString("bairro"),
						r.getString("cidade"), r.getString("numero"), r.getString("complemento"), 
						r.getString("estado"), r.getString("pais"));
				
				Telefone telefone = new Telefone(r.getString("codigo_area"), r.getString("prefixo"), 
						r.getString("numero_linha"));
				
				Permissao permissao = r.getString("permissao").equalsIgnoreCase("USUARIO")? 
						Permissao.USUARIO : Permissao.ADMINISTRADOR; 
				
				funcionarios.add(new Funcionario(r.getString("nome"), r.getString("login"), 
						r.getString("senha"), r.getDate("data_nascimento"), endereco, telefone,
						permissao, r.getInt("codigo_funcionario")));
			}
			
		} catch (SQLException e) {
			return null;
		}
		return funcionarios;
	}
}
