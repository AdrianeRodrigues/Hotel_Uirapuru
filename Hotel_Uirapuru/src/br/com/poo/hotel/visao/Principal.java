package br.com.poo.hotel.visao;

import br.com.poo.hotel.controle.ReservaDAO;
import br.com.poo.hotel.modelo.Reserva;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adriane
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPrin = new javax.swing.JDesktopPane();
        nenuBarPrin = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        itemCadastroFuncionario = new javax.swing.JMenuItem();
        menuEntrada = new javax.swing.JMenu();
        itemRegistrarEntrada = new javax.swing.JMenuItem();
        itemItemConsumido = new javax.swing.JMenuItem();
        menuSaida = new javax.swing.JMenu();
        itemRegistrarSaida = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        itemFaturamentoPeriodo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuReservas = new javax.swing.JMenu();
        itemListarReservas = new javax.swing.JMenuItem();
        itemCadastroHospede1 = new javax.swing.JMenuItem();
        itemReserva = new javax.swing.JMenuItem();
        itemListarHospedes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemCadastrarItem1 = new javax.swing.JMenuItem();
        menuCadastro1 = new javax.swing.JMenu();
        itemCadastroTipo = new javax.swing.JMenuItem();
        itemCadastroAcomodacao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal");

        jMenu2.setText("Funcionário");

        itemCadastroFuncionario.setText("Cadastrar/Alterar funcionario");
        itemCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(itemCadastroFuncionario);

        nenuBarPrin.add(jMenu2);

        menuEntrada.setText("Entrada");

        itemRegistrarEntrada.setText("Registrar Entrada");
        itemRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarEntradaActionPerformed(evt);
            }
        });
        menuEntrada.add(itemRegistrarEntrada);

        itemItemConsumido.setText("Adicionar item consumido");
        itemItemConsumido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemItemConsumidoActionPerformed(evt);
            }
        });
        menuEntrada.add(itemItemConsumido);

        nenuBarPrin.add(menuEntrada);

        menuSaida.setText("Saida");

        itemRegistrarSaida.setText("Registrar saida");
        itemRegistrarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarSaidaActionPerformed(evt);
            }
        });
        menuSaida.add(itemRegistrarSaida);

        nenuBarPrin.add(menuSaida);

        menuRelatorios.setText("Relatórios");

        itemFaturamentoPeriodo.setText("Faturamento por período");
        itemFaturamentoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFaturamentoPeriodoActionPerformed(evt);
            }
        });
        menuRelatorios.add(itemFaturamentoPeriodo);

        jMenuItem2.setText("Faturas em atraso");
        menuRelatorios.add(jMenuItem2);

        nenuBarPrin.add(menuRelatorios);

        menuReservas.setText("Hospedes");

        itemListarReservas.setText("Listar reservas");
        itemListarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarReservasActionPerformed(evt);
            }
        });
        menuReservas.add(itemListarReservas);

        itemCadastroHospede1.setText("Cadastrar/Alterar hospede");
        itemCadastroHospede1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroHospede1ActionPerformed(evt);
            }
        });
        menuReservas.add(itemCadastroHospede1);

        itemReserva.setText("Fazer reserva");
        itemReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReservaActionPerformed(evt);
            }
        });
        menuReservas.add(itemReserva);

        itemListarHospedes.setText("Listar hospedes");
        itemListarHospedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarHospedesActionPerformed(evt);
            }
        });
        menuReservas.add(itemListarHospedes);

        nenuBarPrin.add(menuReservas);

        jMenu1.setText("Item");

        itemCadastrarItem1.setText("Cadastrar/Alterar item");
        itemCadastrarItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(itemCadastrarItem1);

        nenuBarPrin.add(jMenu1);

        menuCadastro1.setText("Acomodação");

        itemCadastroTipo.setText("Cadastrar tipo de acomodação");
        itemCadastroTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroTipoActionPerformed(evt);
            }
        });
        menuCadastro1.add(itemCadastroTipo);

        itemCadastroAcomodacao.setText("Cadastrar acomodação");
        itemCadastroAcomodacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroAcomodacaoActionPerformed(evt);
            }
        });
        menuCadastro1.add(itemCadastroAcomodacao);

        nenuBarPrin.add(menuCadastro1);

        setJMenuBar(nenuBarPrin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroFuncionarioActionPerformed
        TelaCadastroFuncionario cadastroF = new TelaCadastroFuncionario();
        addDesktop(cadastroF);
    }//GEN-LAST:event_itemCadastroFuncionarioActionPerformed

    private void itemRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemRegistrarEntradaActionPerformed

    private void itemRegistrarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemRegistrarSaidaActionPerformed

    private void itemListarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarReservasActionPerformed
                                                        
        ReservaDAO r = new ReservaDAO();
        StringBuilder reservas = new StringBuilder();
        reservas.append("\tReservas Pendentes: \n");
        reservas.append("----------------------\n");
        List<Reserva> l = r.listar();
         System.out.println(l);
        if(!l.isEmpty()){
            System.out.println("Entrou");
            for(Reserva objLista:l){
                System.out.println("Entrou no for");
                if(objLista.getDataChegada().after(new Date())){
                    reservas.append("Codigo: ");
                    reservas.append(objLista.getCodigo());
                    reservas.append("\n");
                    reservas.append("Nome do Hospede: ");
                    reservas.append(objLista.getHospede().getNome());
                    reservas.append("\n");
                    reservas.append("CPF do Hospede: ");
                    reservas.append(objLista.getHospede().getCpf());
                    reservas.append("\n");
                    reservas.append("Numero da Acomodaçao: ");
                    reservas.append(objLista.getAcomodacao().getNumero());
                    reservas.append("\n");
                    reservas.append("Data da Chegada: ");
                    reservas.append(objLista.getDataChegada());
                    reservas.append("\n");
                    reservas.append("Data de Saida: ");
                    reservas.append(objLista.getDataSaida());
                    reservas.append("\n\n");
                }
            }
            TelaRelatorio window = new TelaRelatorio(reservas);
            addDesktop(window);
        }else{
            JOptionPane.showMessageDialog(this, "Nenhuma reserva cadastrada!");
        }

    }//GEN-LAST:event_itemListarReservasActionPerformed

    private void itemCadastroHospede1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroHospede1ActionPerformed
        TelaCadastroHospede cadastroH = new TelaCadastroHospede();
        addDesktop(cadastroH);
    }//GEN-LAST:event_itemCadastroHospede1ActionPerformed

    private void itemReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReservaActionPerformed
        TelaFazerReserva reservaA = new TelaFazerReserva(this);
        addDesktop(reservaA);
    }//GEN-LAST:event_itemReservaActionPerformed

    private void itemCadastrarItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarItem1ActionPerformed
        TelaCadastroItem cadastroI = new TelaCadastroItem();
        addDesktop(cadastroI);
    }//GEN-LAST:event_itemCadastrarItem1ActionPerformed

    private void itemCadastroTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroTipoActionPerformed
        TelaCadastroTipoAcomodacao cadastroT = new TelaCadastroTipoAcomodacao();
        addDesktop(cadastroT);
    }//GEN-LAST:event_itemCadastroTipoActionPerformed

    private void itemCadastroAcomodacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroAcomodacaoActionPerformed
        TelaCadastroAcomodacao cadastroA = new TelaCadastroAcomodacao();
        addDesktop(cadastroA);
    }//GEN-LAST:event_itemCadastroAcomodacaoActionPerformed

    private void itemItemConsumidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemItemConsumidoActionPerformed
        TelaConsumacao consumo = new TelaConsumacao(this);
        addDesktop(consumo);
    }//GEN-LAST:event_itemItemConsumidoActionPerformed

    private void itemListarHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarHospedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemListarHospedesActionPerformed

    private void itemFaturamentoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFaturamentoPeriodoActionPerformed
        ReservaDAO dao = new ReservaDAO();
        TelaRelatorio telaFaturamento = new TelaRelatorio();
        
    }//GEN-LAST:event_itemFaturamentoPeriodoActionPerformed
    
    public void addDesktop(JInternalFrame frame){
        desktopPrin.add(frame);
        frame.setVisible(true);  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPrin;
    private javax.swing.JMenuItem itemCadastrarItem1;
    private javax.swing.JMenuItem itemCadastroAcomodacao;
    private javax.swing.JMenuItem itemCadastroFuncionario;
    private javax.swing.JMenuItem itemCadastroHospede1;
    private javax.swing.JMenuItem itemCadastroTipo;
    private javax.swing.JMenuItem itemFaturamentoPeriodo;
    private javax.swing.JMenuItem itemItemConsumido;
    private javax.swing.JMenuItem itemListarHospedes;
    private javax.swing.JMenuItem itemListarReservas;
    private javax.swing.JMenuItem itemRegistrarEntrada;
    private javax.swing.JMenuItem itemRegistrarSaida;
    private javax.swing.JMenuItem itemReserva;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuCadastro1;
    private javax.swing.JMenu menuEntrada;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuReservas;
    private javax.swing.JMenu menuSaida;
    private javax.swing.JMenuBar nenuBarPrin;
    // End of variables declaration//GEN-END:variables
}
