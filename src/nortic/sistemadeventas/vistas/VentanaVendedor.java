package nortic.sistemadeventas.vistas;

import nortic.sistemadeventas.modelos.Login;
import nortic.sistemadeventas.dao.LoginDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaVendedor extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter trs = null;
    LoginDAO lgdao = new LoginDAO();
    Login l = new Login();

    public VentanaVendedor() {
        initComponents();
        ListarVendedor();
        btn_actualizar.setEnabled(false);
        btn_eliminar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vendedor = new javax.swing.JTable();
        btn_limpiar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_paterno = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        combo_rol = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_direccion = new javax.swing.JTextField();
        txt_cc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(79, 119, 45));
        setClosable(true);
        setIconifiable(true);
        setTitle("Modulo Vendedor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/empleado24px.png"))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(236, 243, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar CC");

        txt_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_vendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CC", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "CORREO", "DIRECCION", "TELEFONO", "CONTRASEÑA", "ROL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_vendedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_vendedor);
        if (tbl_vendedor.getColumnModel().getColumnCount() > 0) {
            tbl_vendedor.getColumnModel().getColumn(0).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(1).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(2).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(3).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(4).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(5).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(6).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(7).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(8).setResizable(false);
            tbl_vendedor.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_norm.png"))); // NOI18N
        btn_limpiar.setBorder(null);
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.setContentAreaFilled(false);
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_press.png"))); // NOI18N
        btn_limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_roll.png"))); // NOI18N
        btn_limpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_roll.png"))); // NOI18N
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Eliminar/eliminar_norm.png"))); // NOI18N
        btn_eliminar.setBorder(null);
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Eliminar/eliminar_press.png"))); // NOI18N
        btn_eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Eliminar/eliminar_roll.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Actualizar/upd_norm.png"))); // NOI18N
        btn_actualizar.setBorder(null);
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setContentAreaFilled(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Actualizar/upd_press.png"))); // NOI18N
        btn_actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Actualizar/upd_roll.png"))); // NOI18N
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Guardar/save_norm.png"))); // NOI18N
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Guardar/save_press.png"))); // NOI18N
        btn_guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Guardar/save_roll.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CORREO");

        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOMBRE");

        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ROL");

        txt_paterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONTRASEÑA");

        combo_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("APELLIDO PATERNO");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("APELLIDO MATERNO");

        txt_materno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_cc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DIRECCION");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CC");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TELEFONO");

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txt_cc, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_paterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_materno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_contraseña))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_cc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/empleado128px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped

        txt_buscar.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {

                trs.setRowFilter(RowFilter.regexFilter(txt_buscar.getText(), 1));

            }
        });

        trs = new TableRowSorter(modelo);
        tbl_vendedor.setRowSorter(trs);

    }//GEN-LAST:event_txt_buscarKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        String rol = combo_rol.getSelectedItem().toString();

        if (!"".equals(txt_cc.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_paterno.getText()) && !"".equals(txt_materno.getText()) && !"".equals(txt_direccion.getText()) && !"".equals(txt_telefono.getText()) && !"".equals(txt_contraseña.getText())) {

            l.setCc(txt_cc.getText());
            l.setNombre(txt_nombre.getText());
            l.setApellido_paterno(txt_paterno.getText());
            l.setApellido_materno(txt_materno.getText());
            l.setCorreo(txt_correo.getText());
            l.setDireccion(txt_direccion.getText());
            l.setTelefono(txt_telefono.getText());
            l.setContraseña(txt_contraseña.getText());
            l.setRol(rol);

            int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro de guardar el registro", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                lgdao.Registrar(l);
                Limpiar();
                ListarVendedor();
                nuevo();

            }

        } else {
            JOptionPane.showMessageDialog(this, "Los campos con * son obligatorios", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tbl_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vendedorMouseClicked

        if (evt.getClickCount() == 2) {

            int fila = tbl_vendedor.rowAtPoint(evt.getPoint());

            lbl_id.setText(tbl_vendedor.getValueAt(fila, 0).toString());
            txt_cc.setText(tbl_vendedor.getValueAt(fila, 1).toString());
            txt_nombre.setText(tbl_vendedor.getValueAt(fila, 2).toString());
            txt_paterno.setText(tbl_vendedor.getValueAt(fila, 3).toString());
            txt_materno.setText(tbl_vendedor.getValueAt(fila, 4).toString());
            txt_correo.setText(tbl_vendedor.getValueAt(fila, 5).toString());
            txt_direccion.setText(tbl_vendedor.getValueAt(fila, 6).toString());
            txt_telefono.setText(tbl_vendedor.getValueAt(fila, 7).toString());
            txt_contraseña.setText(tbl_vendedor.getValueAt(fila, 8).toString());

            String rolT = tbl_vendedor.getValueAt(fila, 9).toString();

            if (rolT.equals("Empleado")) {

                combo_rol.getModel().setSelectedItem("Empelado");

            } else {

                combo_rol.getModel().setSelectedItem("Administrador");

            }

            btn_guardar.setEnabled(false);
            btn_eliminar.setEnabled(true);
            btn_actualizar.setEnabled(true);

        }

    }//GEN-LAST:event_tbl_vendedorMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        String rol = combo_rol.getSelectedItem().toString();

        if ("".equals(lbl_id.getText())) {

            JOptionPane.showMessageDialog(null, "Seleccione un registro", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {

            l.setCc(txt_cc.getText());
            l.setNombre(txt_nombre.getText());
            l.setApellido_paterno(txt_paterno.getText());
            l.setApellido_materno(txt_materno.getText());
            l.setCorreo(txt_correo.getText());
            l.setDireccion(txt_direccion.getText());
            l.setTelefono(txt_telefono.getText());
            l.setContraseña(txt_contraseña.getText());
            l.setRol(rol);
            l.setId(Integer.parseInt(lbl_id.getText()));

            if (!"".equals(txt_cc.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_paterno.getText()) && !"".equals(txt_materno.getText()) && !"".equals(txt_direccion.getText()) && !"".equals(txt_telefono.getText()) && !"".equals(txt_contraseña.getText())) {

                int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro de ACTUALIZAR el registro", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {

                    lgdao.actualizar(l);
                    nuevo();
                    Limpiar();
                    ListarVendedor();
                    btn_guardar.setEnabled(true);
                    btn_eliminar.setEnabled(false);
                    btn_actualizar.setEnabled(false);

                }
            } else {

                JOptionPane.showMessageDialog(this, "Los campos con * son obligatorios", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String vacio = lbl_id.getText();

        if ("".equals(vacio)) {

            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {

            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de elimnar el registro?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {

                int id = Integer.parseInt(lbl_id.getText());
                lgdao.eliminar(id);
                nuevo();
                Limpiar();
                ListarVendedor();
                btn_guardar.setEnabled(true);
                btn_eliminar.setEnabled(false);
                btn_actualizar.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        nuevo();
        Limpiar();
        ListarVendedor();

        if (!btn_guardar.isEnabled()) {

            btn_guardar.setEnabled(true);
            btn_eliminar.setEnabled(false);
            btn_actualizar.setEnabled(false);

        }

    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> combo_rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_vendedor;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cc;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private void ListarVendedor() {

        List<Login> lg = new LoginDAO().listar();

        modelo = (DefaultTableModel) tbl_vendedor.getModel();

        Object[] ob = new Object[10];

        for (int i = 0; i < lg.size(); i++) {

            ob[0] = lg.get(i).getId();
            ob[1] = lg.get(i).getCc();
            ob[2] = lg.get(i).getNombre();
            ob[3] = lg.get(i).getApellido_paterno();
            ob[4] = lg.get(i).getApellido_materno();
            ob[5] = lg.get(i).getCorreo();
            ob[6] = lg.get(i).getDireccion();
            ob[7] = lg.get(i).getTelefono();
            ob[8] = lg.get(i).getContraseña();
            ob[9] = lg.get(i).getRol();
            modelo.addRow(ob);

        }

        tbl_vendedor.setModel(modelo);

    }

    private void nuevo() {

        lbl_id.setText("");
        txt_cc.setText("");
        txt_nombre.setText("");
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_direccion.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
        txt_contraseña.setText("");
        combo_rol.setSelectedIndex(0);
        txt_buscar.setText("");

    }

    private void Limpiar() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }

}
