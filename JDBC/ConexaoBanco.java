
package conexaobanco;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoBanco {
    
    
    // Adicionar em Bibliotecas do Projeto a biblioteca Driver JDBC do MySQL.
    
    
    public static String Driver = "com.mysql.jdbc.Driver"; // Caminho padrão para conectar
    // com mysql.
    public static String URL = "jdbc:mysql://localhost:3306/oficinaexemplo";
    // oficinaexemplo é o nome do Banco de Dados no Workbench.
    public static String User = "root";
    public static String Password = "02utfpres31";
    
    public static Connection getConnection(){
        
        try{
         
            Class.forName(Driver);
            return DriverManager.getConnection(URL, User, Password);
            
        }catch(ClassNotFoundException | SQLException erro){
            throw new RuntimeException("Erro na conexão", erro);
        }
        
    }
    
    public static void closeConnection(Connection con){
        
        if(con != null){
            try{
                con.close();
            }catch(SQLException erro){
               System.err.println("Erro de conexão"+erro);
            }
        }
        
    }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        if(stmt != null){
            try{
                stmt.close();
            }catch(SQLException erro){
               System.err.println("Erro de conexão"+erro);
            }
            closeConnection(con);
        }
        
    }
    
    
     public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        if(rs != null){
            try{
                rs.close();
            }catch(SQLException erro){
                System.err.println("Erro de conexão"+erro);
            }
            closeConnection(con,stmt);
        }
        
    }
    
}
