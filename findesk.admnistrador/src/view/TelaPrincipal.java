/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.JButton;



/**
 *
 * @author alvar
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    private static TelaPrincipal janelaControl;
    private static Point point = new Point();
    
            
    public TelaPrincipal() {
        initComponents();
    }

    public void mudarCorAzul(JButton button){
        button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(000, 191, 255)));
        button.setForeground(new java.awt.Color(000, 191, 255));
    }
    
    public void mudarCorPreto(JButton button){
        button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        button.setForeground(new java.awt.Color(0, 0, 0));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelLogoFindesk = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonBuscar = new javax.swing.JButton();
        jButtonCadastrarItem = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonEstatistica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        setResizable(false);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelFundoMouseDragged(evt);
            }
        });
        jPanelFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelFundoMousePressed(evt);
            }
        });
        jPanelFundo.setLayout(null);

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanelFundo.add(jSeparator2);
        jSeparator2.setBounds(0, 500, 800, 30);

        jLabelLogoFindesk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FINDESK_LOGO3_Azul_PNG.png"))); // NOI18N
        jPanelFundo.add(jLabelLogoFindesk);
        jLabelLogoFindesk.setBounds(220, -10, 360, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/SWS3.png"))); // NOI18N
        jLabel1.setToolTipText("Smart Way Software.");
        jPanelFundo.add(jLabel1);
        jLabel1.setBounds(690, 500, 170, 220);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanelFundo.add(jSeparator1);
        jSeparator1.setBounds(0, 130, 800, 30);

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setToolTipText("Buscar e alterar itens.");
        jButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseMoved(evt);
            }
        });
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseExited(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonBuscar);
        jButtonBuscar.setBounds(280, 190, 230, 60);

        jButtonCadastrarItem.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadastrarItem.setText("CADASTRAR ITEM");
        jButtonCadastrarItem.setToolTipText("Cadastrar novos itens.");
        jButtonCadastrarItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCadastrarItem.setContentAreaFilled(false);
        jButtonCadastrarItem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonCadastrarItemMouseMoved(evt);
            }
        });
        jButtonCadastrarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCadastrarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCadastrarItemMouseExited(evt);
            }
        });
        jButtonCadastrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarItemActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonCadastrarItem);
        jButtonCadastrarItem.setBounds(280, 290, 230, 60);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharPreto.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.setBorderPainted(false);
        jButtonFechar.setContentAreaFilled(false);
        jButtonFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseExited(evt);
            }
        });
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonFechar);
        jButtonFechar.setBounds(760, 0, 20, 30);

        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarPreto.png"))); // NOI18N
        jButtonMinimizar.setToolTipText("Minimizar");
        jButtonMinimizar.setBorderPainted(false);
        jButtonMinimizar.setContentAreaFilled(false);
        jButtonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseExited(evt);
            }
        });
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonMinimizar);
        jButtonMinimizar.setBounds(700, 0, 40, 30);

        jButtonEstatistica.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEstatistica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEstatistica.setText("ESTATÍSTICAS");
        jButtonEstatistica.setToolTipText("Ver estatísticas de uso.");
        jButtonEstatistica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonEstatistica.setContentAreaFilled(false);
        jButtonEstatistica.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonEstatisticaMouseMoved(evt);
            }
        });
        jButtonEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEstatisticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEstatisticaMouseExited(evt);
            }
        });
        jButtonEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstatisticaActionPerformed(evt);
            }
        });
        jPanelFundo.add(jButtonEstatistica);
        jButtonEstatistica.setBounds(280, 390, 230, 60);

        getContentPane().add(jPanelFundo);
        jPanelFundo.setBounds(0, 0, 800, 600);

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        janelaControl.dispose();
         BuscarAdministrador buscaTeste = new BuscarAdministrador();
         buscaTeste.mostrar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseMoved
        
    }//GEN-LAST:event_jButtonBuscarMouseMoved

    private void jButtonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseEntered
        mudarCorAzul(jButtonBuscar);
    }//GEN-LAST:event_jButtonBuscarMouseEntered

    private void jButtonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseExited
        mudarCorPreto(jButtonBuscar);
    }//GEN-LAST:event_jButtonBuscarMouseExited

    private void jButtonCadastrarItemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarItemMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarItemMouseMoved

    private void jButtonCadastrarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarItemMouseEntered
        mudarCorAzul(jButtonCadastrarItem);
    }//GEN-LAST:event_jButtonCadastrarItemMouseEntered

    private void jButtonCadastrarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarItemMouseExited
        mudarCorPreto(jButtonCadastrarItem);
    }//GEN-LAST:event_jButtonCadastrarItemMouseExited

    private void jButtonCadastrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarItemActionPerformed
        janelaControl.dispose();
        CadastrarItem cadastrarItem = new CadastrarItem();
        CadastrarItem.mostrar();
    }//GEN-LAST:event_jButtonCadastrarItemActionPerformed

    private void jButtonFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseEntered
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharAzul.png")));
    }//GEN-LAST:event_jButtonFecharMouseEntered

    private void jButtonFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseExited
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/FecharPreto.png")));
    }//GEN-LAST:event_jButtonFecharMouseExited

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseEntered
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarAzul.png")));
    }//GEN-LAST:event_jButtonMinimizarMouseEntered

    private void jButtonMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseExited
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/MinimizarPreto.png")));
    }//GEN-LAST:event_jButtonMinimizarMouseExited

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonEstatisticaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstatisticaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEstatisticaMouseMoved

    private void jButtonEstatisticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstatisticaMouseEntered
         mudarCorAzul(jButtonEstatistica);
    }//GEN-LAST:event_jButtonEstatisticaMouseEntered

    private void jButtonEstatisticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstatisticaMouseExited
        mudarCorPreto(jButtonEstatistica);
    }//GEN-LAST:event_jButtonEstatisticaMouseExited

    private void jButtonEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstatisticaActionPerformed
       String string = "abcdef";
       StringBuilder stringBuilder = new StringBuilder(string);
       stringBuilder.insert(string.length() - 3, ',');
       System.out.println(stringBuilder.toString());
    }//GEN-LAST:event_jButtonEstatisticaActionPerformed

    private void jPanelFundoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFundoMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_jPanelFundoMousePressed

    private void jPanelFundoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFundoMouseDragged
        Point p = janelaControl.getLocation();
        janelaControl.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_jPanelFundoMouseDragged

    private void jButtonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseClicked
        janelaControl.setExtendedState(janelaControl.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarMouseClicked

    /**
     */
    public static void mostrar() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
               TelaPrincipal telaPrincipal =  new TelaPrincipal();
               telaPrincipal.setVisible(true);
               janelaControl = telaPrincipal;
            }
        });
    }
                
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadastrarItem;
    private javax.swing.JButton jButtonEstatistica;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogoFindesk;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
