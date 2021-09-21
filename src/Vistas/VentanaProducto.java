package Vistas;

import Modelo.Evento;
import Modelo.Inventario;
import Modelo.InventarioDAO;
import Modelo.Login;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.VentaDAO;
import Reportes.Excel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaProducto extends javax.swing.JInternalFrame {

    Login l = new Login();
    Producto prod = new Producto();
    ProductoDAO prodao = new ProductoDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    Evento Validar = new Evento();
    TableRowSorter trs = null;
    String temp_aux;
    Inventario i = new Inventario();
    InventarioDAO idao = new InventarioDAO();
    VentaDAO vdao = new VentaDAO();
    ProductoDAO pdao = new ProductoDAO();
    
    public VentanaProducto() {
        initComponents();
    }

    VentanaProducto(String rol, String n) {
        initComponents();
        ListarProducto();
        String nombre_vendedor = n;
        l.setNombre(nombre_vendedor);
        prodao.combo(combo_proveedor);
        if (rol.equals("Empleado")) {
            txt_precio.setEditable(false);
            txt_codigo.setEditable(false);
            txt_nombre.setEditable(false);
            txt_stock.setEditable(false);
            btn_eliminar.setEnabled(false);
            btn_guardar.setEnabled(false);
            btn_nuevo.setEnabled(false);
            btn_update.setEnabled(false);
            combo_proveedor.setEnabled(false);
        }
    }

    public void ListarProducto() {

        List<Producto> lp = new ProductoDAO().Listar();

        modelo = (DefaultTableModel) tbl_porductos.getModel();

        Object[] ob = new Object[6];

        for (int i = 0; i < lp.size(); i++) {

            ob[0] = lp.get(i).getId();
            ob[1] = lp.get(i).getCodigo();
            ob[2] = lp.get(i).getNombre();
            ob[3] = lp.get(i).getProveedor();
            ob[4] = lp.get(i).getStock();
            ob[5] = lp.get(i).getPrecio();
            modelo.addRow(ob);
        }
        tbl_porductos.setModel(modelo);
    }

    private void Limpiar() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        combo_proveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_porductos = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modulo Producto");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/product24px.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
        });

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*CODIGO:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*STOCK:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("*NOMBRE:");

        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("*PRECIO:");

        txt_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stockKeyTyped(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*PROVEEDOR:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_proveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/product128px.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_porductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "NOMBRE", "PROVEEDOR", "STOCK", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_porductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_porductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_porductos);
        if (tbl_porductos.getColumnModel().getColumnCount() > 0) {
            tbl_porductos.getColumnModel().getColumn(0).setResizable(false);
            tbl_porductos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl_porductos.getColumnModel().getColumn(1).setResizable(false);
            tbl_porductos.getColumnModel().getColumn(2).setResizable(false);
            tbl_porductos.getColumnModel().getColumn(3).setResizable(false);
            tbl_porductos.getColumnModel().getColumn(4).setResizable(false);
            tbl_porductos.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save48px.png"))); // NOI18N
        btn_guardar.setBorder(null);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/update48px.png"))); // NOI18N
        btn_update.setBorder(null);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete48px.png"))); // NOI18N
        btn_eliminar.setBorder(null);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/new48px.png"))); // NOI18N
        btn_nuevo.setBorder(null);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excel48px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar Codigo");

        txtbuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        jButton2.setText("Actualizar tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nuevo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_eliminar)
                        .addComponent(btn_update))
                    .addComponent(btn_nuevo)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if ("".equals(txt_codigo.getText()) || "".equals(txt_nombre.getText()) || "".equals(txt_stock.getText()) || "".equals(combo_proveedor.getSelectedItem())) {

            JOptionPane.showMessageDialog(null, "Los campos con * son obligatorios", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {

            prod.setCodigo(txt_codigo.getText());
            prod.setNombre(txt_nombre.getText());
            prod.setProveedor(combo_proveedor.getSelectedItem().toString());
            prod.setStock(Integer.parseInt(txt_stock.getText()));
            prod.setPrecio(Double.parseDouble(txt_precio.getText()));

            int option = JOptionPane.showConfirmDialog(null, "Esta seguro de guardar el registro", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {

                prodao.RegistrarProducto(prod);
                Limpiar();
                ListarProducto();

            }

        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       
        if ("".equals(txt_codigo.getText()) || "".equals(txt_nombre.getText()) || "".equals(txt_stock.getText()) || "".equals(combo_proveedor.getSelectedItem())) {

            JOptionPane.showMessageDialog(null, "No se ha seleccionado un registro", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {
            
            prod.setCodigo(txt_codigo.getText());
            prod.setNombre(txt_nombre.getText());
            prod.setProveedor(combo_proveedor.getSelectedItem().toString());
            prod.setStock(Integer.parseInt(txt_stock.getText()));
            prod.setPrecio(Double.parseDouble(txt_precio.getText()));
            prod.setId(Integer.parseInt(lbl_id.getText()));

            int option = JOptionPane.showConfirmDialog(null, "Esta seguro de guardar el registro", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);
            
            if (option == JOptionPane.YES_OPTION) {
                
                Date CapturarFecha = new Date();
        DateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        String Fecha = FormatoFecha.format(CapturarFecha);
        
        int stock_final = Integer.parseInt(txt_stock.getText());
        int stock_inicial = Integer.parseInt(temp_aux);
        
        String cod = txt_codigo.getText();
        prod = pdao.BuscarProductos(cod);
        String nombre = prod.getNombre();
        
        if(stock_inicial != stock_final){         
        if(stock_final > stock_inicial){
          
            
            int cant = stock_final - stock_inicial;
            //System.out.println(cant);
            i.setProducto(nombre);
            i.setTipo("INCLUSION ADMINISTRATIVA");
            i.setCantidad(Integer.toString(cant));
            i.setVendedor(l.getNombre());
            i.setFecha(Fecha);

            idao.RegistrarCambios(i);
            System.out.println(nombre);
            System.out.println(cant);
            System.out.println(l.getNombre());
            System.out.println(Fecha);
            temp_aux = Integer.toString(stock_final);
        }
        if(stock_final < stock_inicial){
            
            int cant = stock_inicial - stock_final;
            //System.out.println(cant);
            i.setProducto(nombre);
            i.setTipo("ELIMINACION ADMINISTRATIVA");
            i.setCantidad(Integer.toString(cant));
            i.setVendedor(l.getNombre());
            i.setFecha(Fecha);

            idao.RegistrarCambios(i);
            System.out.println(nombre);
            System.out.println(cant);
            System.out.println(l.getNombre());
            System.out.println(Fecha);
            temp_aux = Integer.toString(stock_final);
        }          
        }
        
                prodao.Actualizar(prod);
                Limpiar();
                ListarProducto();

            }

        }


    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        String vacio = lbl_id.getText();

        if ("".equals(vacio)) {

            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {

            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de elimnar el registro?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {

                int id = Integer.parseInt(lbl_id.getText());
                prodao.Eliminar(id);
                Limpiar();
                ListarProducto();

            }
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void tbl_porductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_porductosMouseClicked

        int fila = tbl_porductos.rowAtPoint(evt.getPoint());

        lbl_id.setText(tbl_porductos.getValueAt(fila, 0).toString());
        txt_codigo.setText(tbl_porductos.getValueAt(fila, 1).toString());
        txt_nombre.setText(tbl_porductos.getValueAt(fila, 2).toString());
        combo_proveedor.setSelectedItem(tbl_porductos.getValueAt(fila, 3).toString());
        txt_stock.setText(tbl_porductos.getValueAt(fila, 4).toString());
        temp_aux = tbl_porductos.getValueAt(fila, 4).toString();
        txt_precio.setText(tbl_porductos.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_tbl_porductosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int op = JOptionPane.showConfirmDialog(this, "Generar reporte en Excel?", "INFORMACION", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            Excel.reporte();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txt_codigo.getText())) {

                txt_nombre.requestFocus();

            }

        }

    }//GEN-LAST:event_txt_codigoKeyPressed

    private void txt_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stockKeyTyped
        Validar.numberKeyPress(evt);
    }//GEN-LAST:event_txt_stockKeyTyped

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
        Validar.numberDecimalKeyPress(evt, txt_precio);
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        txtbuscar.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {

                trs.setRowFilter(RowFilter.regexFilter(txtbuscar.getText(), 2));

            }
        });

        trs = new TableRowSorter(modelo);
        tbl_porductos.setRowSorter(trs);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Limpiar();
        ListarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_proveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_porductos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
private void nuevo() {

        lbl_id.setText("");
        txt_nombre.setText("");
        txt_codigo.setText("");
        combo_proveedor.setSelectedIndex(0);
        txt_stock.setText("");
        txt_precio.setText("");

    }
}
