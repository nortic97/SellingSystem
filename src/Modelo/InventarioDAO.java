package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventarioDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean RegistrarCambios(Inventario inv) {

        try {

            String sql = "INSERT INTO inventario (producto, tipo,cantidad, vendedor, fecha) VALUES (?,?,?,?,?)";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, inv.getProducto());
            ps.setString(2, inv.getTipo());
            ps.setString(3, inv.getCantidad());
            ps.setString(4, inv.getVendedor());
            ps.setString(5, inv.getFecha());

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

    public List Listar() {

        List<Inventario> listai = new ArrayList();
        String sql = "SELECT * FROM inventario";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Inventario i = new Inventario();
                i.setId(rs.getInt(1));
                i.setProducto(rs.getString(2));
                i.setTipo(rs.getString(3));
                i.setCantidad(rs.getString(4));
                i.setVendedor(rs.getString(5));
                i.setFecha(rs.getString(6));
                listai.add(i);
            }

        } catch (SQLException e) {
        }
        return listai;

    }

}
