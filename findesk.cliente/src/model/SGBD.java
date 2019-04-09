/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ld_si
 */
import control.Usuario;
import java.awt.List;
import java.sql.Connection;
 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Exceptions.*;
 
  
 
//Início da classe de conexão//
 
public class SGBD 
{
 
    public static String status = "Não conectou...";
    public static String driverName = "com.mysql.jdbc.Driver";
    public static String url;
    public static String user;
    public static String password;
    
    public static Connection connection = null;
    public static Statement sttmt = null;
    
 
    //Método Construtor da Classe//
    
    public SGBD() {
        this.url = "jdbc:mysql://192.168.100.121:3306/findesk";
        this.user = "utfpr";
        this.password = "utfpr";
        
    }
 
    public SGBD(String ipPort, String database, String user, String password) {
        this.url = "jdbc:mysql://" + ipPort + "/" + database;
        this.user = user;
        this.password = password;
    }
 
 
    //Método de Conexão//
 
    public static java.sql.Connection getConexaoMySQL() 
    {
        try {
            // Carregando o JDBC Driver padrão         
            Class.forName(driverName);
            // Configurando a nossa conexão com um banco de dados//
            connection = DriverManager.getConnection(url, user, password);
            //Testa sua conexão//  
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            
            return connection;    
        } catch (ClassNotFoundException e) {  
            //Driver não encontradO
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;

        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }
 
  
 
    //Método que retorna o status da sua conexão//
 
    public static String statusConection() {
        return status;
    }
 
   
 
   //Método que fecha sua conexão//
 
    public static boolean fecharConexao() {
        try {
            SGBD.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
 
   
 
   //Método que reinicia sua conexão//
 
    public static java.sql.Connection reiniciarConexao() {
        fecharConexao();
        return SGBD.getConexaoMySQL();
    }
    
    
    public static ResultSet consultarItemBd(String sql){
        Statement stt;
        ResultSet rs = null;
        try {
            stt = connection.createStatement(); 
            rs = stt.executeQuery(sql);
            rs.first();   
        } catch (SQLException ex) {
            Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
     

//    public static void setUserConfig(String ip, int porta) throws ipException{
//        if(ip.isEmpty()){
//            throw new ipException();
//        }else{
//            try {
//                Statement stt;
//                stt = connection.createStatement(); 
//                stt.executeUpdate("UPDATE userconfig " +
//                                  "SET ipUserConfig = \""+ip+"\" " +
//                                  ", portUserConfig = " + porta +
//                                  " where idUserConfig = 1; ");
//
//            } catch (SQLException ex) {
//                Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    public static int loadAdmPort(){ 
        try {
            Statement stt;
            ResultSet rs = null;
            stt = connection.createStatement(); 
            rs = stt.executeQuery("select portAdmConfig "
                    + "from admconfig "
                    + "where idAdmConfig = 1 and idAdm = 1;");
            rs.beforeFirst();
            rs.first();
            return rs.getInt("portAdmConfig");
        } catch (SQLException ex) {
            Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
       public static String loadAdmIp(){ 
        try {
            Statement stt;
            ResultSet rs = null;
            stt = connection.createStatement(); 
            rs = stt.executeQuery("select ipAdmConfig "
                    + "from admconfig "
                    + "where idAdmConfig = 1 and idAdm = 1;");
            rs.beforeFirst();
            rs.first();
            return rs.getString("ipAdmConfig");
        } catch (SQLException ex) {
            Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "127.0.0.1";
    }
    
    public static void setAdmConfig(String ip, int porta) throws ipException{
         if(ip.isEmpty()){
            throw new ipException();
        }else{
            try {
                Statement stt;
                stt = connection.createStatement(); 
                stt.executeUpdate("UPDATE admconfig " +
                                  "SET ipAdmConfig = \""+ip+"\" " +
                                  ", portAdmConfig = " + porta +
                                  " where idAdmConfig = 1; ");
            } catch (SQLException ex) {
                Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void inserirItemBd(){
        
    } 
    
    public static void alterarItemBd(){
        
    }
    
    public static void excluirItemBd(){
        
    }
    
    
    public static void retirarItem(int id, int opt){
        Statement stt;
        try {
            stt = connection.createStatement();
            String sql = "UPDATE findesk.item SET retiradoItem = '"+opt+"' WHERE (idItem = '"+id+"');";
            System.out.println("Alterando: "+sql);
            stt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void retirarItem(){
        Statement stt;
        try {
            stt = connection.createStatement();
            String sql = "UPDATE findesk.item SET retiradoItem = '1' WHERE (idItem = '2');";
            System.out.println("Alterando: "+sql);
            stt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SGBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 
}
