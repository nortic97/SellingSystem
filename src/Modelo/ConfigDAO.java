package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean Actualizar(Config confi){
       
       String sql = "UPDATE config SET rut_cc=? , nombre=?, telefono=?, direccion=?, razon=? WHERE id=?";
       
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1, confi.getRut());
           ps.setString(2, confi.getNombre());
           ps.setString(3, confi.getTelefono());
           ps.setString(4, confi.getDireccion());
           ps.setString(5, confi.getRazon());
           ps.setInt(6, confi.getId());
           ps.execute();
           return true;     
       } catch (SQLException e) {
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
           }
       }
       
   }
    
    public Config datos() {

        Config c = new Config();
        Producto pr = new Producto();
        String sql = "SELECT * FROM config";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setId(rs.getInt(1));
                c.setRut(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setRazon(rs.getString(6));   
            }
        } catch (SQLException e) {
        }
        return c;
    }
}
