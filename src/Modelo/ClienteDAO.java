
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarcliente(Cliente cl){
        
        try {
           
            String sql = "INSERT INTO cliente (cc, nombre, apellido_paterno, apellido_materno, correo, direccion, telefono) VALUES (?,?,?,?,?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getCc());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getPaterno());
            ps.setString(4, cl.getMaterno());
            ps.setString(5, cl.getCorreo());
            ps.setString(6, cl.getDireccion());
            ps.setString(7, cl.getTelefono());
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
    
    public List Listar(){
        
        List<Cliente> listacl = new ArrayList();
        String sql = "SELECT * FROM cliente";
        
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Cliente cl = new Cliente();
                cl.setId(rs.getInt(1));
                cl.setCc(rs.getString(2));
                cl.setNombre(rs.getString(3));
                cl.setPaterno(rs.getString(4));
                cl.setMaterno(rs.getString(5));
                cl.setCorreo(rs.getString(6));
                cl.setDireccion(rs.getString(7));
                cl.setTelefono(rs.getString(8));
                listacl.add(cl);
            }
            
        } catch (SQLException e) {
        }
        return listacl;
        
    }
    
    
    public boolean eliminar(int id){
        
        try {
            String sql = "DELETE FROM cliente WHERE id=?";
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
    
    public boolean actualizar(Cliente cl){
        
        String sql = "UPDATE cliente SET cc=?, nombre=?, apellido_paterno=?, apellido_materno=?, correo=?, direccion=?, telefono=? WHERE id=?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getCc());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getPaterno());
            ps.setString(4, cl.getMaterno());
            ps.setString(5, cl.getCorreo());
            ps.setString(6, cl.getDireccion());
            ps.setString(7, cl.getTelefono());
            ps.setInt(8, cl.getId());
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
    
    public Cliente BuscarCliente(String cc){
        
      Cliente cl = new Cliente();
      
      String sql = "SELECT * FROM cliente WHERE cc=?";
      
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cc);
            rs = ps.executeQuery();
            
            if(rs.next()){
                
                cl.setId(rs.getInt(1));
                cl.setCc(rs.getString(2));
                cl.setNombre(rs.getString(3));
                cl.setPaterno(rs.getString(4));
                cl.setMaterno(rs.getString(5));
                cl.setCorreo(rs.getString(6));
                cl.setDireccion(rs.getString(7));
                cl.setTelefono(rs.getString(8));
                
            }
            
        } catch (SQLException e) {
        }
        return cl;
      
    }
    
}
