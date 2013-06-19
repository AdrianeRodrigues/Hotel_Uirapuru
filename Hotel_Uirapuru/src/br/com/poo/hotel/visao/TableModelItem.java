/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.hotel.visao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Schick
 */
public class TableModelItem extends AbstractTableModel{
    
    private String[] colunas = {"Codigo","Nome"};

    private Class[] classeColuna = new Class[]{Integer.class, String.class};

    private List linhas;

    public TableModelItem() {
        linhas = new ArrayList<Object>();
    }

    public TableModelItem(List itens) {
        this();
        linhas.addAll(itens);
    }

    @Override
    public String getColumnName(int columnIndex) {//Retorna o nome da coluna
        return colunas[columnIndex];
    }

    @Override
    public int getColumnCount() {//Retorna o número de colunas que seu modelo tem. Repare que o número de colunas é igual ou tamanho do Array.
        return colunas.length;
    }

    @Override
    public int getRowCount() {//Retorna o número de linhas que o modelo da tabela tem. Repare que o número de elementos corresponde ao número de linhas do modelo
        return linhas.size();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {//Retorna qual célula da tabela é editável, nesse exemplo nenhuma célula é editável
        return true;
    }

    @Override
    public Class getColumnClass(int columnIndex) {//Retorna a classe da coluna selecionada
        return classeColuna[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {//Retorna o valor contido da célula
        return null;
    }

    @Override
    public void setValueAt(Object obj, int rowIndex, int columnIndex) {//Modifica/Atualiza o valor contido na célula.
    }
    
}
