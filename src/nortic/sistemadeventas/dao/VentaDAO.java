package nortic.sistemadeventas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nortic.sistemadeventas.modelos.Detalle;
import nortic.sistemadeventas.modelos.Venta;

public class VentaDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public int id_venta() {

        int id = 0;
        String sql = "SELECT MAX(id) FROM venta";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return id;

    }

    public int RegistrarVenta(Venta v) {

        String sql = "INSERT INTO venta (cliente, vendedor, total , fecha) VALUES (?,?,?,?)";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getCliente());
            ps.setString(2, v.getVendedor());
            ps.setDouble(3, v.getTotal());
            ps.setString(4, v.getFecha());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return r;
    }

    public int RegistrarDetalle(Detalle Dv) {

        String sql = "INSERT INTO detalle_venta (cod_podructo, cantidad, precio ,id_venta) VALUES (?,?,?,?)";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Dv.getCod_producto());
            ps.setInt(2, Dv.getCantidad());
            ps.setDouble(3, Dv.getPrecio());
            ps.setInt(4, Dv.getId_venta());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return r;
    }

    public boolean ActualizarStock(int cant, String cod) {

        String sql = "UPDATE producto SET stock = ? WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public List Listar() {

        List<Venta> listav = new ArrayList();
        String sql = "SELECT * FROM venta";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Venta v = new Venta();
                v.setId(rs.getInt(1));
                v.setCliente(rs.getString(2));
                v.setVendedor(rs.getString(3));
                v.setTotal(rs.getDouble(4));
                v.setFecha(rs.getString(5));
                listav.add(v);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listav;

    }

    public Venta BuscarFactura(String factura) {

        Venta v = new Venta();

        String sql = "SELECT * FROM venta WHERE id=?";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, factura);
            rs = ps.executeQuery();

            if (rs.next()) {

                v.setId(rs.getInt(1));
                v.setCliente(rs.getString(2));
                v.setVendedor(rs.getString(3));
                v.setTotal(rs.getDouble(4));
                v.setFecha(rs.getString(5));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return v;

    }

}
