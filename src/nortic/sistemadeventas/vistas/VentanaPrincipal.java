package nortic.sistemadeventas.vistas;

import nortic.sistemadeventas.modelos.Login;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    public VentanaPrincipal(Login l) {

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        if (l.getRol().equals("Empleado")) {

            menu_proveedor.setVisible(false);
            menu_vendedor.setVisible(false);
            m_ajustes.setVisible(false);
            actum.setVisible(false);
        }

        lbl_cedula.setText(l.getCc());
        lbl_vendedor.setText(l.getNombre() + " " + l.getApellido_paterno() + " " + l.getApellido_materno());
        lblrol.setText(l.getRol());
    }

    @Override
    public Image getIconImage() {

        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/sell32px.png"));
        return retvalue;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_principal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_vendedor = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lblrol = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menu_mantenimiento = new javax.swing.JMenu();
        menu_cliente = new javax.swing.JMenuItem();
        menu_proveedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_proudcto = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        actum = new javax.swing.JMenuItem();
        menu_vendedor = new javax.swing.JMenuItem();
        m_ajustes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de ventas");
        setIconImage(getIconImage());
        setResizable(false);

        ventana_principal.setBackground(new java.awt.Color(49, 87, 44));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 243, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Punto de venta");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 243, 158));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vendedor:");

        lbl_vendedor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_vendedor.setForeground(new java.awt.Color(236, 243, 158));
        lbl_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_cedula.setForeground(new java.awt.Color(236, 243, 158));
        lbl_cedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cedula.setEnabled(false);
        lbl_cedula.setFocusable(false);

        lblrol.setForeground(new java.awt.Color(236, 243, 158));
        lblrol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrol.setEnabled(false);

        jCalendar1.setFocusable(false);

        ventana_principal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ventana_principal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ventana_principal.setLayer(lbl_vendedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ventana_principal.setLayer(lbl_cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ventana_principal.setLayer(lblrol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ventana_principal.setLayer(jCalendar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventana_principalLayout = new javax.swing.GroupLayout(ventana_principal);
        ventana_principal.setLayout(ventana_principalLayout);
        ventana_principalLayout.setHorizontalGroup(
            ventana_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventana_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_principalLayout.createSequentialGroup()
                        .addGroup(ventana_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventana_principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ventana_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(lblrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ventana_principalLayout.setVerticalGroup(
            ventana_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventana_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_principalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(lblrol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(144, 169, 85));
        jMenuBar1.setBorder(null);

        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu1.setForeground(new java.awt.Color(236, 243, 158));
        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Ayuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu4.setForeground(new java.awt.Color(236, 243, 158));
        jMenu4.setText("Ventas");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sell24px.png"))); // NOI18N
        jMenuItem9.setText("Nueva venta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculator24px.png"))); // NOI18N
        jMenuItem8.setText("Ventas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        menu_mantenimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu_mantenimiento.setForeground(new java.awt.Color(236, 243, 158));
        menu_mantenimiento.setText("Mantenimiento");

        menu_cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menu_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/client24px.png"))); // NOI18N
        menu_cliente.setText("Cliente");
        menu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clienteActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_cliente);

        menu_proveedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menu_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supplier24px.png"))); // NOI18N
        menu_proveedor.setText("Proveedor");
        menu_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_proveedorActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_proveedor);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/productmenu24px.png"))); // NOI18N
        jMenu2.setText("Producto");

        menu_proudcto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menu_proudcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/product24px.png"))); // NOI18N
        menu_proudcto.setText("Lista de Productos");
        menu_proudcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_proudctoActionPerformed(evt);
            }
        });
        jMenu2.add(menu_proudcto);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updateproduct.png"))); // NOI18N
        jMenuItem3.setText("Actualizar STOCK");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        actum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/box24px.png"))); // NOI18N
        actum.setText("Actualizaciones de inventario");
        actum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actumActionPerformed(evt);
            }
        });
        jMenu2.add(actum);

        menu_mantenimiento.add(jMenu2);

        menu_vendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menu_vendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/empleado24px.png"))); // NOI18N
        menu_vendedor.setText("Vendedor");
        menu_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_vendedorActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_vendedor);

        m_ajustes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        m_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/setings24px.png"))); // NOI18N
        m_ajustes.setText("Ajustes");
        m_ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_ajustesActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(m_ajustes);

        jMenuBar1.add(menu_mantenimiento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana_principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int op = JOptionPane.showConfirmDialog(this, "Seguro que desea cerrar la sesion actual?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (op == JOptionPane.YES_OPTION) {
            this.dispose();
            VentanaLogin inicio = new VentanaLogin();
            inicio.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        VentanaRegistroVentas frame = new VentanaRegistroVentas();
        CentrarVentana(frame);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        String vendedor = lbl_vendedor.getText();
        VentanaNuevaVenta nv = new VentanaNuevaVenta(vendedor);
        CentrarVentana(nv);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void menu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clienteActionPerformed
        VentanaCliente c = new VentanaCliente();
        CentrarVentana(c);
    }//GEN-LAST:event_menu_clienteActionPerformed

    private void menu_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_proveedorActionPerformed
        VentanaProveedor p = new VentanaProveedor();
        CentrarVentana(p);
    }//GEN-LAST:event_menu_proveedorActionPerformed

    private void menu_proudctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_proudctoActionPerformed
        String rol = lblrol.getText();
        String nom = lbl_vendedor.getText();
        VentanaProducto producto = new VentanaProducto(rol, nom);
        CentrarVentana(producto);
    }//GEN-LAST:event_menu_proudctoActionPerformed

    private void m_ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_ajustesActionPerformed
        VentanaAjustesEmp frame = new VentanaAjustesEmp();
        CentrarVentana(frame);
    }//GEN-LAST:event_m_ajustesActionPerformed

    private void menu_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_vendedorActionPerformed
        VentanaVendedor frame = new VentanaVendedor();
        CentrarVentana(frame);
    }//GEN-LAST:event_menu_vendedorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaAyuda frame = new VentanaAyuda();
        CentrarVentana(frame);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String n = lbl_vendedor.getText();
        VentanaActualizarStock frame = new VentanaActualizarStock(n);
        CentrarVentana(frame);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void actumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actumActionPerformed
        VentanaActualizacionesInventario frame = new VentanaActualizacionesInventario();
        CentrarVentana(frame);
    }//GEN-LAST:event_actumActionPerformed

    public void CentrarVentana(JInternalFrame frame) {

        ventana_principal.add(frame);
        Dimension pantalla = ventana_principal.getSize();
        Dimension ventana = frame.getSize();
        int ancho = (pantalla.width - ventana.width) / 2;
        int alto = ((pantalla.height - ventana.height) / 2);
        frame.setLocation(ancho, alto);
        frame.show();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actum;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JLabel lbl_cedula;
    public static javax.swing.JLabel lbl_vendedor;
    public static javax.swing.JLabel lblrol;
    private javax.swing.JMenuItem m_ajustes;
    private javax.swing.JMenuItem menu_cliente;
    private javax.swing.JMenu menu_mantenimiento;
    private javax.swing.JMenuItem menu_proudcto;
    private javax.swing.JMenuItem menu_proveedor;
    private javax.swing.JMenuItem menu_vendedor;
    private javax.swing.JDesktopPane ventana_principal;
    // End of variables declaration//GEN-END:variables

}
