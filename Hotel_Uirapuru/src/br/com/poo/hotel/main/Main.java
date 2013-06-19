package br.com.poo.hotel.main;

import br.com.poo.hotel.fabrica.FabricaDeConexao;
import br.com.poo.hotel.visao.Login;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adriane
 */
public class Main {
    public static void main(String [] args){
        
        try{
            Connection conexao = FabricaDeConexao.getConexao();
            Login tela = new Login();
            tela.setVisible(true);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro na conexão do banco!\n"+e);
        }        
    }
}
