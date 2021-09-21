
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProveedor(Proveedor pr){
        
        try {
            
            String sql = "INSERT INTO proveedor (rut_cc, nombre, telefono, direccion, correo) VALUES (?,?,?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getRut_cc());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getCorreo());
            ps.execute();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
            }
        }
        
        
    }
    
    public List listar(){
        
        List<Proveedor> listar = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try{
            
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
            while (rs.next()) {
                
                Proveedor pr = new Proveedor();
                
                pr.setId(rs.getInt(1));
                pr.setRut_cc(rs.getString(2));
                pr.setNombre(rs.getString(3));
                pr.setTelefono(rs.getString(4));
                pr.setDireccion(rs.getString(5));
                pr.setCorreo(rs.getString(6));
                listar.add(pr);
                
            }
        
        }catch(SQLException e){
            
        }
        return listar;
    }
    
    public boolean eliminar(int id){
        
        try {
            String sql = "DELETE FROM proveedor WHERE id=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }      
    }
    
    public boolean actualizar(Proveedor pr){
        
        String sql = "UPDATE proveedor SET rut_cc=?, nombre=?, telefono=?, direccion=?, correo=? WHERE id=?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getRut_cc());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getCorreo());
            ps.setInt(6, pr.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
            }
        }
    }
    
}
