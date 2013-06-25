package br.com.poo.hotel.visao;

import br.com.poo.hotel.modelo.Acomodacao;
import br.com.poo.hotel.modelo.TipoAcomodacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Schick
 */
public class TableModelAcomodacao extends AbstractTableModel{
    
    private String[] colunas = {"Codigo","Andar","Numero","Ocupado","Tipo de Acomodaçao"};

    private Class[] classeColuna = new Class[]{int.class, int.class, int.class,
    boolean.class, String.class};

    private List<Acomodacao> linhas;

    public TableModelAcomodacao() {
        linhas = new ArrayList<Acomodacao>();
    }

    public TableModelAcomodacao(List<Acomodacao> acomodacoes) {
        this();
        if(acomodacoes != null){
            for(Acomodacao objLista: acomodacoes){
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
        Acomodacao acomodacao = linhas.get(rowIndex);
        switch(columnIndex) {
            case 0: 
                return (Integer)acomodacao.getCodigo();
            case 1:
                return (Integer)acomodacao.getAndar();
            case 2:
                return (Integer)acomodacao.getNumero();
            case 3:
                return (Boolean)acomodacao.isOcupado();
            case 4:
                return (TipoAcomodacao)acomodacao.getTipoAcomodacao();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object obj, int rowIndex, int columnIndex) {//Modifica/Atualiza o valor contido na célula.
    }
}
