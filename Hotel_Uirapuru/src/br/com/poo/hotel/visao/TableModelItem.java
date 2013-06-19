/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.hotel.visao;

import br.com.poo.hotel.modelo.Item;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Schick
 */
public class TableModelItem extends AbstractTableModel{
    
    private String[] colunas = {"Codigo","Descricao"};

    private Class[] classeColuna = new Class[]{Integer.class, String.class};

    private List<Item> linhas;

    public TableModelItem() {
        linhas = new ArrayList<Item>();
    }

    public TableModelItem(List<Item> itens) {
        this();
        if(itens != null){
            for(Item objLista: itens){
                linhas.add(objLista);
            }
        }
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
        Item item = linhas.get(rowIndex);
        switch(columnIndex) {
            case 0: 
                return item.getCodigo();
            case 1:
                return item.getDescricao();
            default:
                return "";
        }
    }

    @Override
    public void setValueAt(Object obj, int rowIndex, int columnIndex) {//Modifica/Atualiza o valor contido na célula.
    }
    
}
