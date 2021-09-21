package Vistas;

import Modelo.Inventario;
import Modelo.InventarioDAO;
import Modelo.Login;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.VentaDAO;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class VentanaActualizarStock extends javax.swing.JInternalFrame {

    Producto prod = new Producto();
    ProductoDAO pdao = new ProductoDAO();
    VentaDAO vdao = new VentaDAO();
    InventarioDAO idao = new InventarioDAO();
    Inventario i = new Inventario();
    VentanaPrincipal vp = new VentanaPrincipal();
    Login l = new Login();

    public VentanaActualizarStock() {
        initComponents();
    }

    public VentanaActualizarStock(String n) {
        
        initComponents();
        
        String nombre_vendedor = n;
        
        l.setNombre(nombre_vendedor);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_producto = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Actualizar STOCK");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updateproduct32px.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CODIGO DE PRODUCTO");

        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CANTIDAD");

        txt_cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add24px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/minus24px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(2, 2, 2)
                        .addComponent(jButton2)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String cod = txt_codigo.getText();
        int cant = Integer.parseInt(txt_cantidad.getText());
        prod = pdao.BuscarProductos(cod);
        int StockActual = prod.getStock() + cant;
        String nombre = prod.getNombre();

        Date CapturarFecha = new Date();
        DateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        String Fecha = FormatoFecha.format(CapturarFecha);

        int op = JOptionPane.showConfirmDialog(this, "Desea agregar " + cant + " elementos mas a " + nombre, "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (op == JOptionPane.YES_OPTION) {

            i.setProducto(nombre);
            i.setTipo("INCLUSION");
            i.setCantidad(txt_cantidad.getText());
            i.setVendedor(l.getNombre());
            i.setFecha(Fecha);

            idao.RegistrarCambios(i);

            vdao.ActualizarStock(StockActual, cod);
            lbl_producto.setText("");
            txt_codigo.setText("");
            txt_cantidad.setText("");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String cod = txt_codigo.getText();
        int cant = Integer.parseInt(txt_cantidad.getText());
        prod = pdao.BuscarProductos(cod);
        int StockActual = prod.getStock() - cant;
        String nombre = prod.getNombre();

        Date CapturarFecha = new Date();
        DateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        String Fecha = FormatoFecha.format(CapturarFecha);

        int op = JOptionPane.showConfirmDialog(this, "Desea eliminar " + cant + " elementos a " + nombre, "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (op == JOptionPane.YES_OPTION) {

            if (StockActual < 0) {

                JOptionPane.showMessageDialog(this, "No se puede restar el STOCK actual es de " + prod.getStock(), "INFORMACION", JOptionPane.ERROR_MESSAGE);

            } else {
                
                i.setProducto(nombre);
                i.setTipo("ELIMINACION");
                i.setCantidad(txt_cantidad.getText());
                i.setVendedor(l.getNombre());
                i.setFecha(Fecha);

                idao.RegistrarCambios(i);
                vdao.ActualizarStock(StockActual, cod);

                lbl_producto.setText("");
                txt_codigo.setText("");
                txt_cantidad.setText("");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed

        String cod = txt_codigo.getText();
        prod = pdao.BuscarProductos(cod);

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (prod.getNombre() == null) {

                JOptionPane.showMessageDialog(this, "No se encuntra el producto " + cod, "INFORMACION", JOptionPane.ERROR_MESSAGE);
                txt_codigo.setText("");
                lbl_producto.setText("");
                txt_codigo.requestFocus();

            } else {

                lbl_producto.setText(prod.getNombre());
                txt_cantidad.requestFocus();

            }
        }

    }//GEN-LAST:event_txt_codigoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    // End of variables declaration//GEN-END:variables
}
