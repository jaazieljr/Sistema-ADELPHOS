/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Image;
import javax.swing.ImageIcon;

public class GUIHome extends javax.swing.JFrame {

    /**
     * Creates new form GUIHome
     */
    public GUIHome() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/icons/Logo/logoAdelphos.png")).getImage();
        this.setIconImage(icon);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painelPrinciapal = new javax.swing.JPanel();
        BarraDeNavegacao = new javax.swing.JMenuBar();
        menuCadastrarCongreg = new javax.swing.JMenu();
        menuCadastrarMembro1 = new javax.swing.JMenuItem();
        cadastrarCong = new javax.swing.JMenuItem();
        menuCadastrarMembro = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuCarta = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuCarta1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        menuCadastrarMembro2 = new javax.swing.JMenuItem();
        menuVizualizar = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuItemMembro2 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuCarta3 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem19 = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADELPHOS - IEADTC Guaraciaba do Norte");

        jPanel1.setBackground(new java.awt.Color(0, 56, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo/logoAdelphosNomeNome(1)250.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo/logoIEADTC.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 518, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        painelPrinciapal.setBackground(new java.awt.Color(240, 248, 255));
        painelPrinciapal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                painelPrinciapalComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout painelPrinciapalLayout = new javax.swing.GroupLayout(painelPrinciapal);
        painelPrinciapal.setLayout(painelPrinciapalLayout);
        painelPrinciapalLayout.setHorizontalGroup(
            painelPrinciapalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
        );
        painelPrinciapalLayout.setVerticalGroup(
            painelPrinciapalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        menuCadastrarCongreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/cadastrar.png"))); // NOI18N
        menuCadastrarCongreg.setText("Arquivos");
        menuCadastrarCongreg.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        menuCadastrarMembro1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        menuCadastrarMembro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/usuario.png"))); // NOI18N
        menuCadastrarMembro1.setText("Usuário");
        menuCadastrarMembro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarMembro1ActionPerformed(evt);
            }
        });
        menuCadastrarCongreg.add(menuCadastrarMembro1);

        cadastrarCong.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        cadastrarCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/congregacao.png"))); // NOI18N
        cadastrarCong.setText("Congregação");
        cadastrarCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCongActionPerformed(evt);
            }
        });
        menuCadastrarCongreg.add(cadastrarCong);

        menuCadastrarMembro.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        menuCadastrarMembro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/membros.png"))); // NOI18N
        menuCadastrarMembro.setText("Membro");
        menuCadastrarMembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarMembroActionPerformed(evt);
            }
        });
        menuCadastrarCongreg.add(menuCadastrarMembro);
        menuCadastrarCongreg.add(jSeparator5);

        menuCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/cartas.png"))); // NOI18N
        menuCarta.setText("Carta");
        menuCarta.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/recomendacao.png"))); // NOI18N
        jMenuItem1.setText("Recomendação");
        menuCarta.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/mudanca.png"))); // NOI18N
        jMenuItem2.setText("Mudança");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCarta.add(jMenuItem2);

        menuCadastrarCongreg.add(menuCarta);

        menuCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/evento.png"))); // NOI18N
        menuCarta1.setText("Evento");
        menuCarta1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/disciplina.png"))); // NOI18N
        jMenuItem11.setText("Disciplina");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuCarta1.add(jMenuItem11);
        menuCarta1.add(jSeparator8);

        jMenuItem12.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/faleciemento.png"))); // NOI18N
        jMenuItem12.setText("Falecimento");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuCarta1.add(jMenuItem12);
        menuCarta1.add(jSeparator9);

        jMenuItem13.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/exclusao.png"))); // NOI18N
        jMenuItem13.setText("Exclusão");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuCarta1.add(jMenuItem13);

        menuCadastrarCongreg.add(menuCarta1);
        menuCadastrarCongreg.add(jSeparator18);

        menuCadastrarMembro2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        menuCadastrarMembro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/dízimo.png"))); // NOI18N
        menuCadastrarMembro2.setText("Dízimo");
        menuCadastrarMembro2.setToolTipText("");
        menuCadastrarMembro2.setEnabled(false);
        menuCadastrarMembro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarMembro2ActionPerformed(evt);
            }
        });
        menuCadastrarCongreg.add(menuCadastrarMembro2);

        BarraDeNavegacao.add(menuCadastrarCongreg);

        menuVizualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/visualizar.png"))); // NOI18N
        menuVizualizar.setText("Vizualizar");
        menuVizualizar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/cartao.png"))); // NOI18N
        jMenuItem7.setText("Cartão de Membro");
        menuVizualizar.add(jMenuItem7);
        menuVizualizar.add(jSeparator7);

        menuItemMembro2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        menuItemMembro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/membros.png"))); // NOI18N
        menuItemMembro2.setText("Relatório");
        menuItemMembro2.setToolTipText("");
        menuItemMembro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMembro2ActionPerformed(evt);
            }
        });
        menuVizualizar.add(menuItemMembro2);
        menuVizualizar.add(jSeparator4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/cartas.png"))); // NOI18N
        jMenu3.setText("Carta");
        jMenu3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/recomendacao.png"))); // NOI18N
        jMenuItem5.setText("Recomendação");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/mudanca.png"))); // NOI18N
        jMenuItem6.setText("Mudança");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        menuVizualizar.add(jMenu3);

        menuCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/evento.png"))); // NOI18N
        menuCarta3.setText("Evento");
        menuCarta3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        jMenuItem17.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/disciplina.png"))); // NOI18N
        jMenuItem17.setText("Disciplina");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        menuCarta3.add(jMenuItem17);
        menuCarta3.add(jSeparator13);

        jMenuItem18.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/faleciemento.png"))); // NOI18N
        jMenuItem18.setText("Falecimento");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        menuCarta3.add(jMenuItem18);
        menuCarta3.add(jSeparator14);

        jMenuItem19.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/exclusao.png"))); // NOI18N
        jMenuItem19.setText("Exclusão");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        menuCarta3.add(jMenuItem19);

        menuVizualizar.add(menuCarta3);

        BarraDeNavegacao.add(menuVizualizar);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Componentes/sobre.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        BarraDeNavegacao.add(menuSobre);

        setJMenuBar(BarraDeNavegacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelPrinciapal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelPrinciapal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menuCadastrarMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarMembroActionPerformed

        GUICadastrarMembro membro = new GUICadastrarMembro();
        painelPrinciapal.add(membro);
        membro.setVisible(true);


    }//GEN-LAST:event_menuCadastrarMembroActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void cadastrarCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCongActionPerformed
        GUICadastrarCongre congre = new GUICadastrarCongre();
        painelPrinciapal.add(congre);
        congre.setVisible(true);
    }//GEN-LAST:event_cadastrarCongActionPerformed

    private void menuCadastrarMembro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarMembro1ActionPerformed
        GUICadastrarUsuario user = new GUICadastrarUsuario();
        painelPrinciapal.add(user);
        user.setVisible(true);


    }//GEN-LAST:event_menuCadastrarMembro1ActionPerformed

    private void menuCadastrarMembro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarMembro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastrarMembro2ActionPerformed

    private void menuItemMembro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMembro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemMembro2ActionPerformed

    private void painelPrinciapalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_painelPrinciapalComponentAdded

    }//GEN-LAST:event_painelPrinciapalComponentAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeNavegacao;
    private javax.swing.JMenuItem cadastrarCong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu menuCadastrarCongreg;
    private javax.swing.JMenuItem menuCadastrarMembro;
    private javax.swing.JMenuItem menuCadastrarMembro1;
    private javax.swing.JMenuItem menuCadastrarMembro2;
    private javax.swing.JMenu menuCarta;
    private javax.swing.JMenu menuCarta1;
    private javax.swing.JMenu menuCarta3;
    private javax.swing.JMenuItem menuItemMembro2;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuVizualizar;
    private javax.swing.JPanel painelPrinciapal;
    // End of variables declaration//GEN-END:variables
}
