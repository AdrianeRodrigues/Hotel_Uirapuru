package br.com.poo.hotel.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.hotel.dao.DAO;
import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.modelo.Categoria;
import br.com.poo.hotel.modelo.Item;

public class ItemDAO implements DAO<Item> {

	@Override
	public boolean inserir(Item item) {

		String comandoSql = "INSERT INTO Item VALUES (?,?,?,?)";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, item.getCodigo());
			p.setString(2, item.getDescricao());
			p.setDouble(3, item.getPrecoVenda());
			p.setString(4, item.getCategoria().name());

			p.execute();
                        return true;

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean remover(Item item) {

		String comandoSql = "DELETE FROM Item WHERE codigo_item = ?";

		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setInt(1, item.getCodigo());

			p.execute();
                        return true;

		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean alterar(Item item) {
		
		String comandoSql = "UPDATE Item SET descricao=?, " +
				"preco_venda=?,categoria=? WHERE codigo_item=?";
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {

			p.setString(1, item.getDescricao());
			p.setDouble(2, item.getPrecoVenda());
			p.setString(3, item.getCategoria().name());
			p.setInt(4, item.getCodigo());
			
			p.execute();
                        return true;
			
		} catch (SQLException e) {
                    e.printStackTrace();
			return false;
		}		
	}

	public Item buscaId(int codigoItem) {
		
		String comandoSql = "SELECT * FROM Item WHERE codigo_item = ?";
		
		Item item = null;
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			p.setInt(1, codigoItem);
			
			ResultSet r = p.executeQuery();
			
			if (r.next()) {
				
				Categoria categoria = Categoria.FRIGOBAR;
				
				if (r.getString("categoria").equalsIgnoreCase("LAVANDERIA"))
					categoria = Categoria.LAVANDERIA;
				else if (r.getString("categoria").equalsIgnoreCase("RESTAURANTE"))
					categoria = Categoria.RESTAURANTE;
				
				item = new Item(r.getInt("codigo_item"), r.getString("descricao"), 
						r.getDouble("preco_venda"), categoria);
			}
		} catch (SQLException e) {
			return null;
		}
		
		return item;
	}
	
	@Override
	public List<Item> listar() {
		
		String comandoSql = "SELECT * FROM Item";
		
		List<Item> itens = new ArrayList<>();
		
		try (Connection c = FabricaDeConexao.getConexao();
				PreparedStatement p = c.prepareStatement(comandoSql)) {
			
			ResultSet r = p.executeQuery();
			
			if (r.next()) {
				
				Categoria categoria = Categoria.FRIGOBAR;
				
				if (r.getString("categoria").equalsIgnoreCase("LAVANDERIA"))
					categoria = Categoria.LAVANDERIA;
				else if (r.getString("categoria").equalsIgnoreCase("RESTAURANTE"))
					categoria = Categoria.RESTAURANTE;
				
				itens.add(new Item(r.getInt("codigo_item"), r.getString("descricao"), 
						r.getDouble("preco_venda"), categoria));
			}
		} catch (SQLException e) {
			return null;
		}
		
		return itens;
	}
}
