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
import br.com.poo.hotel.modelo.CartaoCredito;
import br.com.poo.hotel.modelo.Endereco;
import br.com.poo.hotel.modelo.Estadia;
import br.com.poo.hotel.modelo.Hospede;
import br.com.poo.hotel.modelo.Permissao;
import br.com.poo.hotel.modelo.Telefone;

public class HospedeDAO implements DAO<Hospede> {

	@Override
	public boolean inserir(Hospede hospede) {

		String comandoSql = "INSERT INTO Hospede VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try ( Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql) ) {
                        System.out.println(hospede.getCpf());
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
			p.setString(11, hospede.getPermissao().name());
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

			// Inserir chamada a classe CartãoDAO aqui ...

			p.execute();
                        return true;
                        
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean remover(Hospede hospede) {

		String comandoSql = "DELETE FROM Hospede WHERE cpf = ?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, hospede.getCpf());

			return p.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean alterar(Hospede hospede) {

		String comandoSql = "UPDATE Hospede SET nome=?,data_nascimento=?," +
				"email=?,rg=?,passaporte=?,nome_pai=?,nome_mae=?,login=?,senha=?," +
				"permissao=?,logradouro=?,bairro=?,cidade=?,numero_endereco=?," +
				"complemento=?,estado=?,pais=?,codigo_area=?,prefixo=?,numero_linha=?" +
				" WHERE cpf = ?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, hospede.getNome());
			p.setDate(2, new Date(hospede.getDataNascimento().getTime()));
			p.setString(3, hospede.getEmail());
			p.setString(4, hospede.getRg());
			p.setString(5, hospede.getPassaporte());
			p.setString(6, hospede.getNomePai());
			p.setString(7, hospede.getNomeMae());
			p.setString(8, hospede.getLogin());
			p.setString(9, hospede.getSenha());
			p.setString(10, hospede.getPermissao().name());
			p.setString(11, hospede.getEndereco().getLogradouro());
			p.setString(12, hospede.getEndereco().getBairro());
			p.setString(13, hospede.getEndereco().getCidade());
			p.setString(14, hospede.getEndereco().getNumero());
			p.setString(15, hospede.getEndereco().getComplemento());
			p.setString(16, hospede.getEndereco().getEstado());
			p.setString(17, hospede.getEndereco().getPais());
			p.setString(18, hospede.getTelefone().getCodigoArea());
			p.setString(19, hospede.getTelefone().getPrefixo());
			p.setString(20, hospede.getTelefone().getNumeroLinha());
			p.setString(21, hospede.getCpf());

			return p.execute();

		} catch (SQLException e) {
			return false;
		}
	}

	public Hospede buscarID(String cpf) {

		String comandoSql = "SELECT * FROM Hospede WHERE cpf = ?";

		Hospede h = null;

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, cpf);

			ResultSet r = p.executeQuery();

			if (r.next()) {

				Endereco endereco = new Endereco(r.getString("logradouro"), r.getString("bairro"), 
						r.getString("cidade"), r.getString("numero_endereco"),
						r.getString("complemento"), r.getString("estado"), r.getString("pais"));

				Telefone telefone = new Telefone(r.getString("codigo_area"), r.getString("prefixo"), 
						r.getString("numero_linha"));

				List<CartaoCredito> cartoesCredito = 
						new CartaoCreditoDAO().buscarCartaoCliente(r.getString("cpf")); //chamar método da classe CartaCreditoDAO
				List<Estadia> estadias = null; //chamar método da classe EstadiaDAO

				Permissao permissao = r.getString("permissao").equalsIgnoreCase("usuario") ? 
						Permissao.USUARIO : Permissao.ADMINISTRADOR;

				h = new Hospede(r.getString("nome"), r.getString("login"), 
						r.getString("senha"), new java.util.Date(r.getDate("data_nascimento").getTime()),
						endereco, telefone, permissao, r.getString("email"), r.getString("rg"), 
						r.getString("cpf"), r.getString("passaporte"), r.getString("nome_pai"), 
						r.getString("nome_mae"), cartoesCredito, estadias);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return h;
	}

	public List<Hospede> buscarNome(String nome) {

		String comandoSql = "SELECT * FROM Hospede WHERE nome LIKE ?";

		List<Hospede> hospedes = new ArrayList<>();

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, "%"+nome+"%");

			ResultSet r = p.executeQuery(); 

			while (r.next()) {

				Endereco endereco = new Endereco(r.getString("logradouro"), r.getString("bairro"), 
						r.getString("cidade"), r.getString("numero_endereco"),
						r.getString("complemento"), r.getString("estado"), r.getString("pais"));

				Telefone telefone = new Telefone(r.getString("codigo_area"), r.getString("prefixo"), 
						r.getString("numero_linha"));

				List<CartaoCredito> cartoesCredito = 
						new CartaoCreditoDAO().buscarCartaoCliente(r.getString("cpf")); //chamar método da classe CartaCreditoDAO
				List<Estadia> estadias = null; //chamar método da classe EstadiaDAO

				Permissao permissao = r.getString("permissao").equalsIgnoreCase("usuario") ? 
						Permissao.USUARIO : Permissao.ADMINISTRADOR;

				hospedes.add(new Hospede(r.getString("nome"), r.getString("login"), 
						r.getString("senha"), new java.util.Date(r.getDate("data_nascimento").getTime()),
						endereco, telefone, permissao, r.getString("email"), r.getString("rg"), 
						r.getString("cpf"), r.getString("passaporte"), r.getString("nome_pai"), 
						r.getString("nome_mae"), cartoesCredito, estadias));
			}
		} catch (SQLException e) {
			return hospedes;
		}
		return hospedes;
	}

	@Override
	public List<Hospede> listar() {

//=======
		
		String comandoSql = "SELECT * FROM Hospede";
		
		List<Hospede> hospedes = new ArrayList<>();
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			ResultSet r = p.executeQuery();
			
//>>>>>>> b4e2b4735f2785dc9aac5eaa92418a49e2b47acb
			while (r.next()) {
				Endereco endereco = new Endereco(r.getString("logradouro"), r.getString("bairro"), 
						r.getString("cidade"), r.getString("numero_endereco"),
						r.getString("complemento"), r.getString("estado"), r.getString("pais"));

				Telefone telefone = new Telefone(r.getString("codigo_area"), r.getString("prefixo"), 
						r.getString("numero_linha"));

				List<CartaoCredito> cartoesCredito = 
						new CartaoCreditoDAO().buscarCartaoCliente(r.getString("cpf")); //chamar método da classe CartaCreditoDAO
				List<Estadia> estadias = null; //chamar método da classe EstadiaDAO

				Permissao permissao = r.getString("permissao").equalsIgnoreCase("usuario") ? 
						Permissao.USUARIO : Permissao.ADMINISTRADOR;

				hospedes.add(new Hospede(r.getString("nome"), r.getString("login"), 
						r.getString("senha"), new java.util.Date(r.getDate("data_nascimento").getTime()),
						endereco, telefone, permissao, r.getString("email"), r.getString("rg"), 
						r.getString("cpf"), r.getString("passaporte"), r.getString("nome_pai"), 
						r.getString("nome_mae"), cartoesCredito, estadias));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return hospedes;
		}
		return hospedes;
	}
        
}
