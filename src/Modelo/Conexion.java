/*falta encriptar datos sensibles como contraseñas*/
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
   
    Connection con;
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    String user = "";
    String pass = "";
    String host = "";
    String tipo_de_base = "";
    String puerto = ""; 
    
    void LecturaCFG(){
        
        try {
            
         archivo = new File ("./conf/BD.conf");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
         tipo_de_base = br.readLine();
         puerto = br.readLine();
         host = br.readLine();
         user = br.readLine();
         pass = br.readLine();
         
         
      }
      catch(IOException e){
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
         }
      }
        
    }
    void LecturaCFGTemp(){
        
        try {
            
         archivo = new File ("./conf/BDtemp.conf");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
         tipo_de_base = br.readLine();
         puerto = br.readLine();
         host = br.readLine();
         user = br.readLine();
         pass = br.readLine();
         
         
      }
      catch(IOException e){
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
         }
      }
        
    }
    public Connection getConnection(){
            try {
                LecturaCFG();
                if(tipo_de_base.equals("MariaDB")){
                    tipo_de_base = "mariadb";
                }
                String mysql = "jdbc:"+tipo_de_base+"://"+host+":"+puerto+"/sistema_de_ventas?serverTimezone=UTC";
                con = DriverManager.getConnection(mysql, user, pass);
                return con;
            } catch (SQLException e) {
            }
        return null;
        
    } 
    
    public Connection getConnectionTemp(){
            try {
                LecturaCFGTemp();
                if(tipo_de_base.equals("MariaDB")){
                    tipo_de_base = "mariadb";
                }
                String mysql = "jdbc:"+tipo_de_base+"://"+host+":"+puerto+"/sistema_de_ventas?serverTimezone=UTC";
                System.out.println(mysql);
                con = DriverManager.getConnection(mysql, user, pass);
                return con;
            } catch (SQLException e) {
            }
        return null;
        
    }   
}
