package br.com.poo.hotel.visao;

import br.com.poo.hotel.controle.FuncionarioDAO;
import br.com.poo.hotel.modelo.Endereco;
import br.com.poo.hotel.modelo.Funcionario;
import br.com.poo.hotel.modelo.Permissao;
import br.com.poo.hotel.modelo.Telefone;
import javax.swing.JOptionPane;

/**
 *
 * @author adriane
 */
public class TelaCadastroFuncionario extends javax.swing.JInternalFrame {

    private Funcionario funcionario;
    private FuncionarioDAO dao;
    private Telefone tel;
    private Endereco end;
    String login;
    String senha;

    public TelaCadastroFuncionario() {
        initComponents();
        dao = new FuncionarioDAO();
        btnAlterar.setVisible(false);
        btnRemover.setVisible(false);
        btnSalvar.setVisible(false);
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
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ftxtCodArea = new javax.swing.JFormattedTextField();
        ftxtPrefixo = new javax.swing.JFormattedTextField();
        ftxtTelefone = new javax.swing.JFormattedTextField();
        dateData = new com.toedter.calendar.JDateChooser();
        panelEndereco = new javax.swing.JPanel();
        txtLogradouro = new javax.swing.JTextField();
        labelLog = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        labelNro = new javax.swing.JLabel();
        labelComp = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        ftxtNro = new javax.swing.JFormattedTextField();
        btnRemover = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        labelBuscaCPF = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        ftxtBuscaId = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de funcionario");
        setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados pessoais:"));

        labelNome.setText("Nome:");

        txtNome.setEnabled(false);

        labelData.setText("Data:");

        jLabel1.setText("Telefone:");

        ftxtCodArea.setEnabled(false);

        ftxtPrefixo.setEnabled(false);

        ftxtTelefone.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelNome)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelData)
                            .addComponent(dateData, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ftxtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxtPrefixo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNome))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ftxtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftxtPrefixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço:"));

        txtLogradouro.setEnabled(false);

        labelLog.setText("Logradouro:");

        txtEstado.setEnabled(false);

        labelBairro.setText("Bairro:");

        txtBairro.setEnabled(false);

        labelCidade.setText("Cidade:");

        txtCidade.setEnabled(false);

        labelNro.setText("Número:");

        labelComp.setText("Complemento:");

        labelEstado.setText("Estado:");

        txtComplemento.setEnabled(false);

        ftxtNro.setEnabled(false);

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCidade))
                        .addGap(18, 18, 18)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEstado)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelComp)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNro)
                            .addComponent(ftxtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNro)
                    .addComponent(labelLog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComp)
                    .addComponent(labelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEstado)
                    .addComponent(labelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

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

        labelBuscaCPF.setText("Digite o ID do funcionário:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        ftxtBuscaId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        ftxtBuscaId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelBuscaCPF)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ftxtBuscaId, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBuscaCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtBuscaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancel)
                    .addComponent(btnAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (ftxtBuscaId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o ID do funcionário a ser cadastrado!");
        } else {
            funcionario = dao.buscarId(Integer.parseInt(ftxtBuscaId.getText()));
            if (funcionario == null) {
                JOptionPane.showMessageDialog(null, "Funcionáro não cadastrado!");
                habilitarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário já cadastrado!");
                setarCampos();
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        boolean resp = dao.remover(funcionario);
        if (resp) {
            new TelaCadastroHospede().limparCampos();
            JOptionPane.showMessageDialog(null, "Funcionario removido!");
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não removido!");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtNome.getText().isEmpty() && !txtBairro.getText().isEmpty() && !ftxtBuscaId.getText().isEmpty()
                && !txtCidade.getText().isEmpty() && !txtComplemento.getText().isEmpty() && !txtEstado.getText().isEmpty()
                && !txtLogradouro.getText().isEmpty() && !ftxtNro.getText().isEmpty() && !dateData.getDate().toString().isEmpty()
                && !ftxtCodArea.getText().isEmpty() && !ftxtPrefixo.getText().isEmpty() && !ftxtTelefone.getText().isEmpty()) {

            end = new Endereco(txtLogradouro.getText(), txtBairro.getText(), txtCidade.getText(),
                    ftxtNro.getText(), txtComplemento.getText(), txtEstado.getText(), "Brasil");

            tel = new Telefone(ftxtCodArea.getText(), ftxtPrefixo.getText(), ftxtTelefone.getText());                         

            funcionario = new Funcionario(txtNome.getText(), login, senha, dateData.getDate(),
                    end, tel, Permissao.ADMINISTRADOR, 0);
            
            login = funcionario.getLogin();
            senha = "senha";

            boolean resposta = dao.inserir(funcionario);

            if (resposta) {
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado!");
                //this.dispose();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não cadastrado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (!txtNome.getText().isEmpty() && !txtBairro.getText().isEmpty() && !ftxtBuscaId.getText().isEmpty()
                && !txtCidade.getText().isEmpty() && !txtComplemento.getText().isEmpty() && !txtEstado.getText().isEmpty()
                && !txtLogradouro.getText().isEmpty() && !ftxtNro.getText().isEmpty() && !dateData.getDate().toString().isEmpty()
                && !ftxtCodArea.getText().isEmpty() && !ftxtPrefixo.getText().isEmpty() && !ftxtTelefone.getText().isEmpty()){
            
            tel.setCodigoArea(ftxtCodArea.getText());
            tel.setNumeroLinha(ftxtTelefone.getText());
            tel.setPrefixo(ftxtPrefixo.getText());
            
            end.setBairro(txtBairro.getText());
            end.setCidade(txtCidade.getText());
            end.setComplemento(txtComplemento.getText());
            end.setEstado(txtEstado.getText());
            end.setLogradouro(txtLogradouro.getText());
            end.setNumero(ftxtNro.getText());            
            
            funcionario.setCodigo(Integer.parseInt(ftxtBuscaId.getText()));
            funcionario.setDataNascimento(dateData.getDate());
            funcionario.setNome(txtNome.getText());
            funcionario.setTelefone(tel);
            funcionario.setEndereco(end);
            
            boolean resp = dao.alterar(funcionario);
            
            if(resp){
                JOptionPane.showMessageDialog(null, "Dados do funcionário alterados com sucesso");
                limparCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Dados do funcionário não foram alterados.\nDados originais persistem!");
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void limparCampos() {
        txtBairro.setText("");
        ftxtBuscaId.setText("");
        txtCidade.setText("");
        ftxtCodArea.setText("");
        txtComplemento.setText("");
        txtEstado.setText("");
        txtLogradouro.setText("");
        txtNome.setText("");
        ftxtNro.setText("");
        ftxtPrefixo.setText("");
        ftxtTelefone.setText("");
        dateData.setDate(null);
    }

    private void setarCampos() {
        txtBairro.setText(funcionario.getEndereco().getBairro());
        txtCidade.setText(funcionario.getEndereco().getCidade());
        ftxtCodArea.setText(funcionario.getTelefone().getCodigoArea());
        txtComplemento.setText(funcionario.getEndereco().getComplemento());
        txtEstado.setText(funcionario.getEndereco().getEstado());
        txtLogradouro.setText(funcionario.getEndereco().getLogradouro());
        txtNome.setText(funcionario.getNome());
        ftxtNro.setText(funcionario.getEndereco().getNumero());
        ftxtPrefixo.setText(funcionario.getTelefone().getPrefixo());
        ftxtTelefone.setText(funcionario.getTelefone().getNumeroLinha());
        dateData.setDate(funcionario.getDataNascimento());
        btnAlterar.setVisible(true);
        btnRemover.setVisible(true);
        btnSalvar.setVisible(false);
    }

    private void habilitarCampos() {
        ftxtCodArea.setEnabled(true);
        ftxtNro.setEnabled(true);
        ftxtPrefixo.setEnabled(true);
        ftxtTelefone.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtEstado.setEnabled(true);
        txtLogradouro.setEnabled(true);
        txtNome.setEnabled(true);
        dateData.setEnabled(true);
        btnSalvar.setVisible(true);
        btnAlterar.setVisible(false);
        btnRemover.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser dateData;
    private javax.swing.JFormattedTextField ftxtBuscaId;
    private javax.swing.JFormattedTextField ftxtCodArea;
    private javax.swing.JFormattedTextField ftxtNro;
    private javax.swing.JFormattedTextField ftxtPrefixo;
    private javax.swing.JFormattedTextField ftxtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelBuscaCPF;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComp;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelLog;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNro;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
