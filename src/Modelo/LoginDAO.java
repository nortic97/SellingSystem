package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    Login l = new Login();

    public Login ingresar(String cc, String contraseña) {

        String sql = "SELECT * FROM vendedor WHERE cc=? AND contraseña=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cc);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setCc(rs.getString("cc"));
                l.setNombre(rs.getString("nombre"));
                l.setApellido_paterno(rs.getString("apellido_paterno"));
                l.setApellido_materno(rs.getString("apellido_materno"));
                l.setCorreo(rs.getString("correo"));
                l.setDireccion(rs.getString("direccion"));
                l.setTelefono(rs.getString("telefono"));
                l.setContraseña(rs.getString("contraseña"));
                l.setRol(rs.getString("rol"));
            }

        } catch (SQLException e) {
        }

        return l;

    }

    public boolean Registrar(Login reg) {

        try {

            String sql = "INSERT INTO vendedor (cc, nombre, apellido_paterno, apellido_materno, correo, direccion, telefono, contraseña, rol) VALUES (?,?,?,?,?,?,?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getCc());
            ps.setString(2, reg.getNombre());
            ps.setString(3, reg.getApellido_paterno());
            ps.setString(4, reg.getApellido_materno());
            ps.setString(5, reg.getCorreo());
            ps.setString(6, reg.getDireccion());
            ps.setString(7, reg.getTelefono());
            ps.setString(8, reg.getContraseña());
            ps.setString(9, reg.getRol());
            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
            }
        }

    }

    public List listar() {

        List<Login> listav = new ArrayList();
        String sql = "SELECT * FROM vendedor";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Login l = new Login();
                l.setId(rs.getInt(1));
                l.setCc(rs.getString(2));
                l.setNombre(rs.getString(3));
                l.setApellido_paterno(rs.getString(4));
                l.setApellido_materno(rs.getString(5));
                l.setCorreo(rs.getString(6));
                l.setDireccion(rs.getString(7));
                l.setTelefono(rs.getString(8));
                l.setContraseña(rs.getString(9));
                l.setRol(rs.getString(10));
                listav.add(l);
            }

        } catch (SQLException e) {
        }
        return listav;

    }

    public boolean actualizar(Login lg) {

        String sql = "UPDATE vendedor SET cc=?, nombre=?, apellido_paterno=?, apellido_materno=?, correo=?, direccion=?, telefono=?, contraseña=?, rol=? WHERE id=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lg.getCc());
            ps.setString(2, lg.getNombre());
            ps.setString(3, lg.getApellido_paterno());
            ps.setString(4, lg.getApellido_materno());
            ps.setString(5, lg.getCorreo());
            ps.setString(6, lg.getDireccion());
            ps.setString(7, lg.getTelefono());
            ps.setString(8, lg.getContraseña());
            ps.setString(9, lg.getRol());
            ps.setInt(10, lg.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
            }
        }
    }
    
    public boolean eliminar(int id){
        
        try {
            String sql = "DELETE FROM vendedor WHERE id=?";
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
    
    public Login BuscarVendedor(String cod){
       
       Login l = new Login();
       String sql = "SELECT * FROM vendedor WHERE cc=?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps. setString(1, cod);
           rs = ps.executeQuery();
           if(rs.next()){
               l.setNombre(rs.getString("nombre"));
           }
       } catch (SQLException e) {
       }
        return l;
   }

}
