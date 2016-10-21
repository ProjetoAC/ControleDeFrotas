
package view;

import javafx.application.Application;


public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
      this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCadastro = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnVeiculo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/frota-caminhões.jpg"))); // NOI18N
        jdpPrincipal.add(jLabel1);
        jLabel1.setBounds(70, 80, 1650, 1190);

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(-80, -320, 1570, 1170);

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(0, 51, 204));
        jMenu1.setText("Configurações");
        jMenu1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N

        mniSair.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        mniSair.setForeground(new java.awt.Color(0, 0, 204));
        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        jMenu1.add(mniSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setForeground(new java.awt.Color(0, 51, 204));
        jMenu2.setText("Cadastros");
        jMenu2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N

        btnCadastro.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(0, 0, 204));
        btnCadastro.setText("Cadastro Usuario");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadastro);

        jMenuItem1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem1.setText("Rota");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        btnVeiculo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnVeiculo.setForeground(new java.awt.Color(0, 51, 204));
        btnVeiculo.setText("Veiculo");
        btnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculoActionPerformed(evt);
            }
        });
        jMenu2.add(btnVeiculo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1509, 893);
    }// </editor-fold>//GEN-END:initComponents

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        dispose();
        
    }//GEN-LAST:event_mniSairActionPerformed

    private void btnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculoActionPerformed
        TelaVeiculo tv = new TelaVeiculo();
        jdpPrincipal.add(tv);
        tv.setVisible(true);
    }//GEN-LAST:event_btnVeiculoActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro cad = new TelaCadastro();
        jdpPrincipal.add(cad);
        cad.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         TelaRota tr = new TelaRota();
        jdpPrincipal.add(tr);
        tr.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadastro;
    private javax.swing.JMenuItem btnVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem mniSair;
    // End of variables declaration//GEN-END:variables



}
