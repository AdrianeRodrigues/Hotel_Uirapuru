package br.com.poo.hotel.visao;

import br.com.poo.hotel.controle.ItemDAO;
import br.com.poo.hotel.modelo.Categoria;
import br.com.poo.hotel.modelo.Item;
import javax.swing.JOptionPane;

/**
 *
 * @author adriane
 */
public class TelaItem extends javax.swing.JInternalFrame {

    private Item item;
    private ItemDAO dao;
    public TelaItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        boxCategoria = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        txtBuscarCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Cadastro de item para consumo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do item:"));

        labelPreco.setText("Preço:");

        txtPreco.setEnabled(false);

        labelDescricao.setText("Descrição:");

        txtDescricao.setEnabled(false);

        labelCategoria.setText("Categoria:");

        boxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "FRIGOBAR", "RESTAURANTE", "LAVANDERIA" }));
        boxCategoria.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategoria)
                            .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPreco)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelDescricao)
                    .addComponent(txtDescricao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        labelCodigo.setText("Digite o codigo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnRemover)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancel)
                    .addComponent(btnRemover))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(!txtBuscarCodigo.getText().isEmpty() && !txtDescricao.getText().isEmpty()){
            
            if (boxCategoria.getSelectedItem().equals(Categoria.FRIGOBAR.toString())){
                
                item = new Item(Integer.parseInt(txtBuscarCodigo.getText()), 
                        txtDescricao.getText(), Double.parseDouble(txtPreco.getText()), 
                        Categoria.FRIGOBAR);
                salvarItem();
                
            }else if (boxCategoria.getSelectedItem().equals(Categoria.LAVANDERIA.toString())){
                
                item = new Item(Integer.parseInt(txtBuscarCodigo.getText()), 
                        txtDescricao.getText(), Double.parseDouble(txtPreco.getText()), 
                        Categoria.LAVANDERIA);
                salvarItem();
                
            }else if (boxCategoria.getSelectedItem().equals(Categoria.RESTAURANTE.toString())){
                
                item = new Item(Integer.parseInt(txtBuscarCodigo.getText()), 
                        txtDescricao.getText(), Double.parseDouble(txtPreco.getText()), 
                        Categoria.RESTAURANTE);
                salvarItem();
                
            }else{
                JOptionPane.showMessageDialog(null, "Selecione a categoria correta para o item!");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscarCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o CPF!");
        }else{
            item = dao.buscar(Integer.parseInt(txtBuscarCodigo.getText()));
            if ( item == null) {
                //TODO
            }else{
                //TODO
            }                       
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        boolean resp = dao.remover(Integer.parseInt(txtBuscarCodigo.getText()));
        if(resp){
            limpar();
            JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Item não removido!");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    public void salvarItem(){
        dao = new ItemDAO();
        boolean resposta = dao.inserir(item);
            
        if (resposta){
           JOptionPane.showMessageDialog(null, "Item cadastrado!");
           this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Item não cadastrado!");                       
        }
    }
    
    public void limpar(){
        txtBuscarCodigo.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtDescricao.setEditable(false);
        txtPreco.setEditable(false);
        boxCategoria.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxCategoria;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
