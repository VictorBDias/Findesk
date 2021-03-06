/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.JOptionPane;
import control.Administrador;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author alvar
 */
public class CadastrarItem extends javax.swing.JFrame {
    
    private static DefaultComboBoxModel defaultComboBoxCategoria = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxDia = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxMes = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxAno = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxCor = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxNumero = new DefaultComboBoxModel();
    private static DefaultComboBoxModel defaultComboBoxNome = new DefaultComboBoxModel();
    private static CadastrarItem janelaControl;
     private DefaultTableModel defaultTableResultado;
     public Item itemSelecionado = new Item();
    /**
     * Creates new form CadastrarItem
     */

    
    
    public CadastrarItem() {
        
        initComponents();
        popularComboBoxCategoria();
        popularComboBoxDia();
        popularComboBoxMes();
        popularComboBoxAno();
        popularComboBoxCor();
        popularComboBoxNumero();
        jComboBoxCategoria.setModel(defaultComboBoxCategoria);
        jComboBoxDia.setModel(defaultComboBoxDia);
        jComboBoxMes.setModel(defaultComboBoxMes);
        jComboBoxAno.setModel(defaultComboBoxAno);
        jComboBoxCor.setModel(defaultComboBoxCor);
       // jComboBoxNumero.setModel(defaultComboBoxNumero);
     
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCategoria = new javax.swing.JLabel();
        jLabelCadastrar1 = new javax.swing.JLabel();
        jTextFieldNomeDescrição = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelDoc = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jComboBoxCor = new javax.swing.JComboBox<>();
        jLabelDataDescrição = new javax.swing.JLabel();
        jTextFieldDoc = new javax.swing.JTextField();
        jLabelNomeItem1 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAno = new javax.swing.JComboBox<>();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabelDataPerda1 = new javax.swing.JLabel();
        jTextFieldNomeItem1 = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jLabelCategoria1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelCategoria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categoria:");
        getContentPane().add(jLabelCategoria);
        jLabelCategoria.setBounds(30, 170, 110, 30);

        jLabelCadastrar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastrar1.setText("Cadastrar Item");
        getContentPane().add(jLabelCadastrar1);
        jLabelCadastrar1.setBounds(280, 0, 280, 70);

        jTextFieldNomeDescrição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDescriçãoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeDescrição);
        jTextFieldNomeDescrição.setBounds(210, 280, 450, 170);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cor:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 100, 60, 60);

        jLabelDoc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDoc.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDoc.setText("Num documento:");
        getContentPane().add(jLabelDoc);
        jLabelDoc.setBounds(430, 150, 190, 60);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(330, 510, 150, 40);

        jComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCor);
        jComboBoxCor.setBounds(480, 120, 110, 30);

        jLabelDataDescrição.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDataDescrição.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataDescrição.setText("Descrição:");
        getContentPane().add(jLabelDataDescrição);
        jLabelDataDescrição.setBounds(30, 270, 180, 30);

        jTextFieldDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDocActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDoc);
        jTextFieldDoc.setBounds(620, 170, 130, 30);

        jLabelNomeItem1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNomeItem1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeItem1.setText("Nome do item:");
        getContentPane().add(jLabelNomeItem1);
        jLabelNomeItem1.setBounds(30, 120, 170, 29);

        jComboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDia);
        jComboBoxDia.setBounds(210, 220, 60, 30);

        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMes);
        jComboBoxMes.setBounds(290, 220, 60, 30);

        getContentPane().add(jComboBoxAno);
        jComboBoxAno.setBounds(360, 220, 80, 30);

        jComboBoxCategoria.setToolTipText("");
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCategoria);
        jComboBoxCategoria.setBounds(210, 170, 200, 30);

        jLabelDataPerda1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDataPerda1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataPerda1.setText("Data de perda:");
        getContentPane().add(jLabelDataPerda1);
        jLabelDataPerda1.setBounds(30, 220, 180, 30);
        getContentPane().add(jTextFieldNomeItem1);
        jTextFieldNomeItem1.setBounds(210, 120, 200, 30);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(20, 530, 73, 23);

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabel.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fundo2.png"))); // NOI18N
        jLabel.setEnabled(false);
        getContentPane().add(jLabel);
        jLabel.setBounds(0, 0, 800, 600);

        jLabelCategoria1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCategoria1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria1.setText("Categoria:");
        getContentPane().add(jLabelCategoria1);
        jLabelCategoria1.setBounds(30, 170, 110, 30);

        setSize(new java.awt.Dimension(814, 631));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
       // JOptionPane.showConfirmDialog(null, "Deseja confirmar o cadastro?");
        String categoria = jComboBoxCategoria.getSelectedItem().toString();
        String dia = jComboBoxDia.getSelectedItem().toString();
        String mes = jComboBoxMes.getSelectedItem().toString();
        String ano = jComboBoxAno.getSelectedItem().toString();
        String nome = jTextFieldNomeItem1.toString();
        String cor = jComboBoxCor.getSelectedItem().toString();
        String iddoc = jTextFieldDoc.toString();
        String descricao = jTextFieldNomeDescrição.getText();
       
     
 
        //cadastroCat(nome,categoria);
       // cadastroItem(cor,Integer.parseInt(iddoc),Integer.parseInt(dia),Integer.parseInt(mes),Integer.parseInt(ano),descricao);
       
        SGBD.getConexaoMySQL();
        
//        SGBD.inserirItemBd("INSERT INTO `findesk`.`nomeItem` "
//                + "(`nome`, `idCategoria`)"
//                + " VALUES (\""+nome+"\", select idCategoria from nomeItem where nomeCat = \""+categoria+"\" );");

    // SGBD.inserirItemBd("INSERT INTO documento (idDoc, nomeDoc) "
  //                          + "VALUES (\""+iddoc+"\",documento);");
//        
       //    SGBD.inserirItemBd("INSERT INTO item (idCor, idAdm, idDataEntrada, idDataSaida, retiradoItem, fotoItem, descricaoItem) "
         //                   + "VALUES ((SELECT idCor from cor where nomeCor = \""+cor+"\"), 1, 1, 1, 0, NULL, \""+descricao+"\");");
           
       // SGBD.fecharConexao();
       
 
        SGBD.getConexaoMySQL();
        
       // SGBD.inserirItemBd("INSERT INTO `findesk`.`nomeItem` "
        //        + "(`nome`, `idCategoria`)"
          //      + " VALUES (\""+nome+"\", select idCategoria from nomeItem where nomeCat = \""+categoria+"\" );");
        
           SGBD.inserirItemBd("INSERT INTO item (idItem, idCor, idDoc, idNome, idAdm, idDataEntrada, idDataSaida, retiradoItem, descricaoItem)"
                   + " VALUES (13, '#000000', 0, '2', 1, 1, 1, 0, 'mouse gamer');");
           
        SGBD.fecharConexao();
       
/*
       Item novoItem = new Item();
       novoItem.setCor(jComboBoxCor.getSelectedItem().toString());
       novoItem.setDescricaoItem(jTextFieldNomeDescrição.getText());
       int id = SGBD.consultarIdNomeItem("Documentos");
       novoItem.setIdNome(id);
       novoItem.setIdDoc(Integer.parseInt(jTextFieldDoc.getText()));
       novoItem.setNomeItem(jTextFieldNomeItem1.getText());
       
       SGBD.getConexaoMySQL();
       SGBD.inserirItemBd(novoItem);
       SGBD.fecharConexao();
        */
        
       
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
       janelaControl.dispose();
       TelaPrincipal telaPrincipal = new TelaPrincipal();
       telaPrincipal.mostrar();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        Object item = jComboBoxCategoria.getSelectedItem();
        String itemName = item.toString();
        popularComboBoxNome("select distinct nomeItem.nome " +
                            "from item, nomeItem, categoria " +
                            "where nomeItem.idNome = item.idNome and " +
                                    "nomeItem.idCategoria = categoria.idCategoria and " +
                                    "categoria.nomeCat like \""
                                    + itemName
                                     + "\";");
      
       // jComboBoxNome.setModel(defaultComboBoxNome);
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaActionPerformed

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void jTextFieldDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDocActionPerformed

    private void jComboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCorActionPerformed

    private void jTextFieldNomeDescriçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDescriçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDescriçãoActionPerformed
    
     public void popular(JLabel label, String imagem){
        //atribui imagem nos labels desejados
        
        ImageIcon icon = new ImageIcon(imagem, "imagem");
        Image img = icon.getImage();
        Image nova = getScaledImage(img, 200,150);
        icon.setImage(nova);
        label.setIcon(icon); 
    }
      
    private Image getScaledImage(Image srcImg, int w, int h){
        //Redimensiona a imagem para o tamanho desejado
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }
    
    private static void popularComboBoxNome(String sql){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        //"SELECT nome FROM nome, categoria WHERE nomeCat = 'Eletrônicos' and categoria.`idCategoria` = nome.`idCategoria`")
        ResultSet rs = mybd.consultarItemBd(sql);
       
        String nome;
        strList.add("Nome");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString("nome");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxNome = new DefaultComboBoxModel(strList.toArray());
        
        mybd.fecharConexao();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void mostrar() {
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
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarItem cadastrarItem = new CadastrarItem();
                cadastrarItem.setVisible(true);
                janelaControl = cadastrarItem;
            }
        });
    }
    
     private static void popularComboBoxCategoria(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("select distinct categoria.nomeCat " +
                                                "from nomeItem, item, categoria " +
                                                "where item.idNome = nomeItem.idNome and " +
                                                "nomeItem.idCategoria = categoria.idCategoria;");
       
        String nome;
        strList.add("Todas");
        try {
            rs.beforeFirst();
            while(rs.next()){
                nome = rs.getString("nomeCat");
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxCategoria = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
    }
     private static void popularComboBoxDia(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM dia");
       
        String nome;
        strList.add("Dia");
           try {
            rs.isFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxDia = new DefaultComboBoxModel(strList.toArray());
        
        
        
        mybd.fecharConexao();
        
        
    }
    
    private static void popularComboBoxMes(){
        //"127.0.0.1:3307", "findesk", "client", "client123456"
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM mes");
       
        String nome;
        strList.add("Mês");
         try {
            rs.isFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        defaultComboBoxMes = new DefaultComboBoxModel(strList.toArray());
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxAno(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT * FROM ano");
       
        String nome;
        strList.add("Ano");
           try {
            rs.isFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defaultComboBoxAno = new DefaultComboBoxModel(strList.toArray());
       
        
        
        mybd.fecharConexao();
        
    }
     private static void popularComboBoxCor(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("select distinct cor.nomeCor " +
                                            "from cor, item " +
                                            "where item.idCor = cor.idCor;");
       
        String nome;
        strList.add("Cor");
           try {
            rs.isFirst();
            while(rs.next()){
                nome = rs.getString(1);
                strList.add(nome);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        defaultComboBoxCor = new DefaultComboBoxModel(strList.toArray());
        
        
        
        mybd.fecharConexao();
        
    }
    
    private static void popularComboBoxNumero(){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT item.idDoc " +
                                "FROM item, nomeItem, categoria " +
                                "WHERE item.idNome  = nomeItem.idNome and " +
                                        "nomeItem.idCategoria  = categoria.idCategoria and  " +
                                        "categoria.idCategoria like \"e\";");
       
        int numero;
        strList.add("Selecione");
        
        
        defaultComboBoxNumero= new DefaultComboBoxModel(strList.toArray());
        
        
        
        mybd.fecharConexao();
        
    }
     private static void cadastroItem(String cor,int iddoc,int dia, int mes, int ano,String descricao){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("INSERT INTO `findesk`.`item` "
                + "( `idCor`, `idDoc`, idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`,"
                + " `retiradoItem`, `fotoItem`, `descricaoItem`)"
                + " VALUES (\""+cor+"\",\""+iddoc+"\", 1,\"SELECT idDataEntrada from dataEntrada\"\n" +
"                + \"where idData = (select idData from data\"\n" +
"                + \" where idDia = \\\"\"+dia+\"\\\" AND idMes = \\\"\"+mes+\"\\\" AND idAno = \\\"\"+ano+\"\\\")  \"\n" +
"                + \"(`nome`, `idCategoria`)\"\n" +
"                + \"  );\", 0, 0,"
                + ", '\""+descricao+"\"');");
        
       
        
        mybd.fecharConexao();
        
    }
     
      private static void cadastroCat(String nome, String Categoria){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("INSERT INTO `findesk`.`nomeItem` "
                + "(`nome`, `idCategoria`)"
                + " VALUES (\""+nome+"\", select idCategoria from nomeItem where nomeCat = \""+Categoria+"\" );");
        
       
        
        mybd.fecharConexao();
        
    }
     
         private static void dataEntrada(int dia, int mes, int ano){
        SGBD mybd = new SGBD();
        
        mybd.getConexaoMySQL();
        ArrayList strList = new ArrayList();
        System.out.println(mybd.statusConection());
        
        
        
        ResultSet rs = mybd.consultarItemBd("SELECT idDataEntrada from dataEntrada"
                + "where idData = (select idData from data"
                + " where idDia = \""+dia+"\" AND idMes = \""+mes+"\" AND idAno = \""+ano+"\")  "
                + "(`nome`, `idCategoria`)"
                + "  );");
        
       
        
        mybd.fecharConexao();
        
    }
      
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxCor;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadastrar1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCategoria1;
    private javax.swing.JLabel jLabelDataDescrição;
    private javax.swing.JLabel jLabelDataPerda1;
    private javax.swing.JLabel jLabelDoc;
    private javax.swing.JLabel jLabelNomeItem1;
    private javax.swing.JTextField jTextFieldDoc;
    private javax.swing.JTextField jTextFieldNomeDescrição;
    private javax.swing.JTextField jTextFieldNomeItem1;
    // End of variables declaration//GEN-END:variables

}
