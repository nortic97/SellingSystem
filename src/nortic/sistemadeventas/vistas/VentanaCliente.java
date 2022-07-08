package nortic.sistemadeventas.vistas;

import nortic.sistemadeventas.modelos.Cliente;
import nortic.sistemadeventas.dao.ClienteDAO;
import nortic.sistemadeventas.modelos.Pais;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaCliente extends javax.swing.JInternalFrame {

    Cliente c = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter trs = null;

    public VentanaCliente() {
        initComponents();
        btn_actualizar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        ListarCliente();
        ArrayList<String> lista = new ArrayList<>();

        lista = Pais.combo();

        for (int i = 0; i < lista.size(); i++) {

            pais.addItem(lista.get(i));

        }

    }

    private void ListarCliente() {

        List<Cliente> lc = new ClienteDAO().Listar();

        modelo = (DefaultTableModel) tbl_clientes.getModel();

        Object[] ob = new Object[8];

        for (int i = 0; i < lc.size(); i++) {

            ob[0] = lc.get(i).getId();
            ob[1] = lc.get(i).getCc();
            ob[2] = lc.get(i).getNombre();
            ob[3] = lc.get(i).getPaterno();
            ob[4] = lc.get(i).getMaterno();
            ob[5] = lc.get(i).getCorreo();
            ob[6] = lc.get(i).getDireccion();
            ob[7] = lc.get(i).getTelefono();
            modelo.addRow(ob);

        }

        tbl_clientes.setModel(modelo);

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
        lbl_id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        pais = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        btn_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_cc_buscar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(79, 119, 45));
        setClosable(true);
        setForeground(new java.awt.Color(236, 243, 158));
        setIconifiable(true);
        setTitle("Modulo Cliente");
        setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/client24px.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_id.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*NOMBRE:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID:");

        txt_nombre.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_paterno.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_paterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*APELLIDO PATERNO:");

        txt_cc.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_cc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ccActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*CC:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("*APELLIDO MATERNO:");

        txt_materno.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_materno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CORREO:");

        txt_correo.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("*DIRECCION:");

        txt_direccion.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("*TELEFONO:");

        txt_telefono.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pais.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txt_cc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_paterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefono))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txt_direccion))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(txt_materno))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_clientes.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CC", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "CORREO", "DIRECCION", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_clientes);
        if (tbl_clientes.getColumnModel().getColumnCount() > 0) {
            tbl_clientes.getColumnModel().getColumn(0).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl_clientes.getColumnModel().getColumn(1).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(2).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(3).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(4).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(5).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(6).setResizable(false);
            tbl_clientes.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_norm.png"))); // NOI18N
        btn_nuevo.setToolTipText("Limpia los campos para un nuevo registro");
        btn_nuevo.setBorder(null);
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setContentAreaFilled(false);
        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_press.png"))); // NOI18N
        btn_nuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_roll.png"))); // NOI18N
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Eliminar/eliminar_norm.png"))); // NOI18N
        btn_eliminar.setToolTipText("Eliminar registros");
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
        btn_actualizar.setToolTipText("Actualizar registros");
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
        btn_guardar.setToolTipText("Guardar registros");
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/client128px.png"))); // NOI18N

        jLabel10.setForeground(new java.awt.Color(236, 243, 158));
        jLabel10.setText("CC:");

        txt_cc_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cc_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cc_buscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cc_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_cc_buscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ccActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        String cod = pais.getSelectedItem().toString();

        if (!"".equals(txt_cc.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_paterno.getText()) && !"".equals(txt_materno.getText()) && !"".equals(txt_direccion.getText()) && !"".equals(txt_telefono.getText())) {

            if ("PAIS".equals(cod)) {
                cod = "";
            }
            c.setCc(txt_cc.getText());
            c.setNombre(txt_nombre.getText());
            c.setPaterno(txt_paterno.getText());
            c.setMaterno(txt_materno.getText());
            c.setCorreo(txt_correo.getText());
            c.setDireccion(txt_direccion.getText());
            c.setTelefono(cod + " " + txt_telefono.getText());

            int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro de guardar el registro", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                cdao.registrarcliente(c);
                Limpiar();
                nuevo();
                ListarCliente();

            }

        } else {
            JOptionPane.showMessageDialog(this, "Los campos con * son obligatorios", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed

        if (!btn_guardar.isEnabled()) {

            btn_guardar.setEnabled(true);
            btn_eliminar.setEnabled(false);
            btn_actualizar.setEnabled(false);
            
        }

        nuevo();
        Limpiar();
        ListarCliente();
        
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        String vacio = lbl_id.getText();
        if ("".equals(vacio)) {

            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {

            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de elimnar el registro?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {

                int id = Integer.parseInt(lbl_id.getText());
                cdao.eliminar(id);
                btn_guardar.setEnabled(true);
                btn_eliminar.setEnabled(false);
                btn_actualizar.setEnabled(false);
                Limpiar();
                nuevo();
                ListarCliente();

            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked

        if (evt.getClickCount() == 2) {

            int fila = tbl_clientes.rowAtPoint(evt.getPoint());

            lbl_id.setText(tbl_clientes.getValueAt(fila, 0).toString());
            txt_cc.setText(tbl_clientes.getValueAt(fila, 1).toString());
            txt_nombre.setText(tbl_clientes.getValueAt(fila, 2).toString());
            txt_paterno.setText(tbl_clientes.getValueAt(fila, 3).toString());
            txt_materno.setText(tbl_clientes.getValueAt(fila, 4).toString());
            txt_correo.setText(tbl_clientes.getValueAt(fila, 5).toString());
            txt_direccion.setText(tbl_clientes.getValueAt(fila, 6).toString());
            txt_telefono.setText(tbl_clientes.getValueAt(fila, 7).toString());

            btn_actualizar.setEnabled(true);
            btn_eliminar.setEnabled(true);
            btn_guardar.setEnabled(false);

        }

    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        String cod = pais.getSelectedItem().toString();

        if ("".equals(lbl_id.getText())) {

            JOptionPane.showMessageDialog(null, "Seleccione un registro", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {

            if ("PAIS".equals(cod)) {

                cod = "";

            }

            c.setCc(txt_cc.getText());
            c.setNombre(txt_nombre.getText());
            c.setPaterno(txt_paterno.getText());
            c.setMaterno(txt_materno.getText());
            c.setCorreo(txt_correo.getText());
            c.setDireccion(txt_direccion.getText());
            c.setTelefono(cod + "" + txt_telefono.getText());
            c.setId(Integer.parseInt(lbl_id.getText()));

            if (!"".equals(txt_cc.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_paterno.getText()) && !"".equals(txt_materno.getText()) && !"".equals(txt_direccion.getText()) && !"".equals(txt_telefono.getText())) {

                int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro de ACTUALIZAR el registro", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {

                    cdao.actualizar(c);
                    btn_guardar.setEnabled(true);
                    btn_eliminar.setEnabled(false);
                    btn_actualizar.setEnabled(false);
                    Limpiar();
                    nuevo();
                    ListarCliente();

                }
            } else {

                JOptionPane.showMessageDialog(this, "Los campos con * son obligatorios", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            }

        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_cc_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cc_buscarKeyTyped

        txt_cc_buscar.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {

                trs.setRowFilter(RowFilter.regexFilter(txt_cc_buscar.getText(), 1));

            }
        });

        trs = new TableRowSorter(modelo);
        tbl_clientes.setRowSorter(trs);

    }//GEN-LAST:event_txt_cc_buscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JComboBox<String> pais;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_cc;
    private javax.swing.JTextField txt_cc_buscar;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
private void nuevo() {

        lbl_id.setText("");
        txt_cc.setText("");
        txt_nombre.setText("");
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_direccion.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
        txt_cc_buscar.setText("");
        pais.setSelectedIndex(0);

    }
}
