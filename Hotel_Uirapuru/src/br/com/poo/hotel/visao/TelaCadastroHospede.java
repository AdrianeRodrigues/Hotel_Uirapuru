package br.com.poo.hotel.visao;

import br.com.poo.hotel.controle.HospedeDAO;
import br.com.poo.hotel.modelo.Endereco;
import br.com.poo.hotel.modelo.Hospede;
import br.com.poo.hotel.modelo.Permissao;
import br.com.poo.hotel.modelo.Telefone;
import javax.swing.JOptionPane;

/**
 *
 * @author adriane
 */
public class TelaCadastroHospede extends javax.swing.JInternalFrame {

    private Hospede hospede;
    private Endereco end;
    private Telefone tel;
    private HospedeDAO dao;

    public TelaCadastroHospede() {
        initComponents();
        dao = new HospedeDAO();
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

        panelEndereco = new javax.swing.JPanel();
        txtLogradouro = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        labelLog = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        labelPais = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        labelNro = new javax.swing.JLabel();
        labelComp = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        txtComp = new javax.swing.JTextField();
        txtPassaporte = new javax.swing.JTextField();
        labelPassaporte = new javax.swing.JLabel();
        ckBxEstrangeiro = new javax.swing.JCheckBox();
        ftxtNro = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        panelDadoPessoal = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelRG = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelNomeMae = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        labelNomePai = new javax.swing.JLabel();
        txtNomePai = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        dateData = new com.toedter.calendar.JDateChooser();
        ftxtCodArea = new javax.swing.JFormattedTextField();
        ftxtPrefixo = new javax.swing.JFormattedTextField();
        ftxtTelefone = new javax.swing.JFormattedTextField();
        ftxtRG = new javax.swing.JFormattedTextField();
        ftxtCPF = new javax.swing.JFormattedTextField();
        labelBuscarCPF = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        ftxtBuscaCPF = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Hospede");

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço:"));

        labelLog.setText("Logradouro:");

        labelPais.setText("País:");

        labelBairro.setText("Bairro:");

        labelCidade.setText("Cidade:");

        labelNro.setText("Número:");

        labelComp.setText("Complemento:");

        labelEstado.setText("Estado:");

        txtPassaporte.setEnabled(false);

        labelPassaporte.setText("Passaporte:");

        ckBxEstrangeiro.setText("É estrangeiro");
        ckBxEstrangeiro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckBxEstrangeiroItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(txtPassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ckBxEstrangeiro))
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBairro))
                                .addGap(18, 18, 18)
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEstado))
                                .addGap(18, 18, 18)
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPais)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelPassaporte))
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelLog)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNro)
                                    .addComponent(ftxtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelComp)
                                    .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(369, 369, 369))))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNro)
                    .addComponent(labelLog, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftxtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComp)
                    .addComponent(labelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(labelBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPassaporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckBxEstrangeiro)))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEstado)
                            .addComponent(labelPais))
                        .addGap(0, 0, Short.MAX_VALUE))))
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

        panelDadoPessoal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados pessoais:"));

        labelNome.setText("Nome:");

        labelData.setText("Data:");

        jLabel1.setText("Telefone:");

        labelRG.setText("RG:");

        labelEmail.setText("E-mail:");

        labelNomeMae.setText("Nome da mãe:");

        labelNomePai.setText("Nome do pai:");

        labelCPF.setText("CPF:");

        javax.swing.GroupLayout panelDadoPessoalLayout = new javax.swing.GroupLayout(panelDadoPessoal);
        panelDadoPessoal.setLayout(panelDadoPessoalLayout);
        panelDadoPessoalLayout.setHorizontalGroup(
            panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadoPessoalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomePai)
                    .addComponent(labelNomeMae)
                    .addComponent(labelEmail)
                    .addComponent(labelNome)
                    .addGroup(panelDadoPessoalLayout.createSequentialGroup()
                        .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ftxtRG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelData, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadoPessoalLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(labelCPF)
                                    .addGroup(panelDadoPessoalLayout.createSequentialGroup()
                                        .addComponent(ftxtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtPrefixo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelDadoPessoalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadoPessoalLayout.setVerticalGroup(
            panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadoPessoalLayout.createSequentialGroup()
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDadoPessoalLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelData)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ftxtCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftxtPrefixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRG)
                    .addComponent(labelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadoPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomeMae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomePai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        labelBuscarCPF.setText("Digite o CPF:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBuscarCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDadoPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBuscarCPF)
                    .addComponent(ftxtBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancel)
                            .addComponent(btnRemover)
                            .addComponent(btnAlterar)))
                    .addComponent(panelDadoPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (!txtNome.getText().isEmpty() && !txtBairro.getText().isEmpty() && !ftxtCPF.getText().isEmpty()
                && !txtCidade.getText().isEmpty() && !txtComp.getText().isEmpty() && !txtEstado.getText().isEmpty()
                && !txtLogradouro.getText().isEmpty() && !txtNomeMae.getText().isEmpty() && !txtNomePai.getText().isEmpty()
                && !ftxtNro.getText().isEmpty() && !txtPais.getText().isEmpty() && !ftxtRG.getText().isEmpty()
                && !dateData.getDate().toString().isEmpty() && !txtEmail.getText().isEmpty() && !ftxtCodArea.getText().isEmpty()
                && !ftxtPrefixo.getText().isEmpty() && !ftxtTelefone.getText().isEmpty()) {

            end = new Endereco(txtLogradouro.getText(), txtBairro.getText(), txtCidade.getText(),
                    ftxtNro.getText(), txtComp.getText(), txtEstado.getText(), txtPais.getText());

            tel = new Telefone(ftxtCodArea.getText(), ftxtPrefixo.getText(), ftxtTelefone.getText());

            String login = "";
            String senha = "";

            hospede = new Hospede(txtNome.getText(), login, senha, dateData.getDate(), end, tel, Permissao.USUARIO,
                    txtEmail.getText(), ftxtRG.getText(), ftxtCPF.getText(), txtPassaporte.getText(), txtNomePai.getText(),
                    txtNomeMae.getText(), null, null);


            boolean resposta = dao.inserir(hospede);

            if (resposta) {
                JOptionPane.showMessageDialog(null, "Hospede cadastrado!");
                //this.dispose();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Hospede não cadastrado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void ckBxEstrangeiroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckBxEstrangeiroItemStateChanged
        txtPassaporte.setEnabled(true);
    }//GEN-LAST:event_ckBxEstrangeiroItemStateChanged

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (ftxtBuscaCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o CPF a ser cadastrado!");
        } else {
            hospede = dao.buscarID(ftxtBuscaCPF.getText());
            if (hospede == null) {
                //JOptionPane.showMessageDialog(null, "CPF não cadastrado!");
                limparCampos();
                //HabilitarCampos();
                btnRemover.setVisible(false);
                btnSalvar.setVisible(true);
                btnAlterar.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
                btnRemover.setVisible(true);
                btnSalvar.setVisible(false);
                btnAlterar.setVisible(true);
                setCampos();
                
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        boolean resp = dao.remover(hospede);
        if (resp) {
            new TelaCadastroHospede().limparCampos();
            JOptionPane.showMessageDialog(null, "Hospede removido!");
            limparCampos();
            btnAlterar.setVisible(false);
            btnRemover.setVisible(false);
            btnSalvar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Hospede não removido!");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        end = new Endereco("", "", "", "", "", "", "");
        if (!txtNome.getText().isEmpty() && !txtBairro.getText().isEmpty() && !ftxtCPF.getText().isEmpty()
                && !txtCidade.getText().isEmpty() && !txtComp.getText().isEmpty() && !txtEstado.getText().isEmpty()
                && !txtLogradouro.getText().isEmpty() && !ftxtNro.getText().isEmpty() && !dateData.getDate().toString().isEmpty()
                && !ftxtCodArea.getText().isEmpty() && !ftxtPrefixo.getText().isEmpty() && !ftxtTelefone.getText().isEmpty()){                         
            
            hospede.setCpf(ftxtCPF.getText());
            hospede.setDataNascimento(dateData.getDate());
            hospede.setNome(txtNome.getText());
           
             tel = new Telefone(ftxtCodArea.getText(), ftxtPrefixo.getText(), ftxtTelefone.getText());   
            
            end.setBairro(txtBairro.getText());
            end.setCidade(txtCidade.getText());
            end.setComplemento(txtComp.getText());
            end.setEstado(txtEstado.getText());
            end.setLogradouro(txtLogradouro.getText());
            end.setNumero(ftxtNro.getText());         
            
            hospede.setTelefone(tel);
            hospede.setEndereco(end);
            
            boolean resp = dao.alterar(hospede);
            
            if(resp){
                JOptionPane.showMessageDialog(null, "Dados do hospede alterados com sucesso!");
                //System.out.println("tel "+ ftxtCodArea.getText() + " "+ ftxtPrefixo.getText()+" "+ftxtTelefone.getText());
                limparCampos();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Dados do hospede não foram alterados!");
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void HabilitarCampos() {
        ftxtCPF.setEnabled(true);
        ftxtCodArea.setEnabled(true);
        ftxtNro.setEnabled(true);
        ftxtPrefixo.setEnabled(true);
        ftxtRG.setEnabled(true);
        ftxtTelefone.setEnabled(true);
        txtBairro.setEnabled(true);        
        txtCidade.setEnabled(true);
        txtComp.setEnabled(true);
        txtEmail.setEnabled(true);
        txtEstado.setEnabled(true);
        txtLogradouro.setEnabled(true);
        txtNome.setEnabled(true);
        txtNomeMae.setEnabled(true);
        txtNomePai.setEnabled(true);
        txtPais.setEnabled(true);
        dateData.setEnabled(true);
        //txtPassaporte.setEnabled(true);
        //btnRemover.setEnabled(true);
        //btnSalvar.setEnabled(true);
    }

    public void setCampos() {
        txtBairro.setText(hospede.getEndereco().getBairro());
        ftxtCPF.setText(hospede.getCpf());
        txtCidade.setText(hospede.getEndereco().getCidade());
        ftxtCodArea.setText(hospede.getTelefone().getCodigoArea());
        txtComp.setText(hospede.getEndereco().getComplemento());
        txtEmail.setText(hospede.getEmail());
        txtEstado.setText(hospede.getEndereco().getEstado());
        txtLogradouro.setText(hospede.getEndereco().getLogradouro());
        txtNome.setText(hospede.getNome());
        txtNomeMae.setText(hospede.getNomeMae());
        txtNomePai.setText(hospede.getNomePai());
        ftxtNro.setText(hospede.getEndereco().getNumero());
        txtPais.setText(hospede.getEndereco().getPais());
        txtPassaporte.setText(hospede.getPassaporte());
        ftxtPrefixo.setText(hospede.getTelefone().getPrefixo());
        ftxtRG.setText(hospede.getRg());
        ftxtTelefone.setText(hospede.getTelefone().getNumeroLinha());
        dateData.setDate(hospede.getDataNascimento());
    }
    
    public void limparCampos(){
        txtBairro.setText("");
        ftxtCPF.setText(ftxtBuscaCPF.getText());
        ftxtBuscaCPF.setText("");
        txtCidade.setText("");
        ftxtCodArea.setText("");
        txtComp.setText("");
        txtEmail.setText("");
        txtEstado.setText("");
        txtLogradouro.setText("");
        txtNome.setText("");
        txtNomeMae.setText("");
        txtNomePai.setText("");
        ftxtNro.setText("");
        txtPais.setText("");
        txtPassaporte.setText("");
        ftxtPrefixo.setText("");
        ftxtRG.setText("");
        ftxtTelefone.setText("");
        dateData.setDate(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ckBxEstrangeiro;
    private com.toedter.calendar.JDateChooser dateData;
    private javax.swing.JFormattedTextField ftxtBuscaCPF;
    private javax.swing.JFormattedTextField ftxtCPF;
    private javax.swing.JFormattedTextField ftxtCodArea;
    private javax.swing.JFormattedTextField ftxtNro;
    private javax.swing.JFormattedTextField ftxtPrefixo;
    private javax.swing.JFormattedTextField ftxtRG;
    private javax.swing.JFormattedTextField ftxtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelBuscarCPF;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComp;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelLog;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeMae;
    private javax.swing.JLabel labelNomePai;
    private javax.swing.JLabel labelNro;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelPassaporte;
    private javax.swing.JLabel labelRG;
    private javax.swing.JPanel panelDadoPessoal;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPassaporte;
    // End of variables declaration//GEN-END:variables
}
