
package nortic.sistemadeventas.vistas;

import nortic.sistemadeventas.modelos.Pais;
import nortic.sistemadeventas.modelos.Proveedor;
import nortic.sistemadeventas.dao.ProveedorDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class VentanaProveedor extends javax.swing.JInternalFrame {

    ProveedorDAO pdao = new ProveedorDAO();
    Proveedor pr = new Proveedor();
    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter trs = null;
    
    public VentanaProveedor() {
        initComponents();
        listarProveedor();
        ArrayList<String> lista = new ArrayList<>();
        lista = Pais.combo();
        for(int i=0 ; i < lista.size(); i++){
            
            paisc.addItem(lista.get(i));
            
        }
        
    }
    
    public void listarProveedor(){
        
        List<Proveedor> lpr = new ProveedorDAO().listar();
        
        modelo = (DefaultTableModel) tbl_proveedor.getModel();
        
        Object[] ob = new Object[6];
        
        for(int i = 0 ; i < lpr.size() ; i++){
            
            ob[0] = lpr.get(i).getId();
            ob[1] = lpr.get(i).getRut_cc();
            ob[2] = lpr.get(i).getNombre();
            ob[3] = lpr.get(i).getTelefono();
            ob[4] = lpr.get(i).getDireccion();
            ob[5] = lpr.get(i).getCorreo();
            modelo.addRow(ob);
            
        }
        tbl_proveedor.setModel(modelo);
    }
    
    private void Limpiar(){
          
          for(int i=0 ; i<modelo.getRowCount();i++){
              modelo.removeRow(i);
              i = i-1;
          }
          
      }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cc_rut = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        paisc = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_proveedor = new javax.swing.JTable();
        btn_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfiltro = new javax.swing.JTextField();

        setBackground(new java.awt.Color(79, 119, 45));
        setClosable(true);
        setIconifiable(true);
        setTitle("Modulo Proveedor");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supplier24px.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        lbl_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*CC/RUT:");

        txt_cc_rut.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("*NOMBRE:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*TELEFONO:");

        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*DIRECCION:");

        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CORREO:");

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cc_rut, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txt_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(paisc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_direccion)
                    .addComponent(txt_correo))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cc_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(paisc))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl_id, txt_cc_rut, txt_correo, txt_direccion, txt_nombre, txt_telefono});

        txt_cc_rut.getAccessibleContext().setAccessibleName("");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT/CC", "NOMBRE", "TELEFONO", "DIRECCION", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_proveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_proveedor);
        if (tbl_proveedor.getColumnModel().getColumnCount() > 0) {
            tbl_proveedor.getColumnModel().getColumn(0).setResizable(false);
            tbl_proveedor.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl_proveedor.getColumnModel().getColumn(1).setResizable(false);
            tbl_proveedor.getColumnModel().getColumn(2).setResizable(false);
            tbl_proveedor.getColumnModel().getColumn(3).setResizable(false);
            tbl_proveedor.getColumnModel().getColumn(4).setResizable(false);
            tbl_proveedor.getColumnModel().getColumn(5).setResizable(false);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_norm.png"))); // NOI18N
        btn_nuevo.setBorder(null);
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setContentAreaFilled(false);
        btn_nuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_press.png"))); // NOI18N
        btn_nuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Limpiar/limpiar_roll.png"))); // NOI18N
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Eliminar/eliminar_norm.png"))); // NOI18N
        btn_eliminar.setBorder(null);
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Eliminar/eliminar_press.png"))); // NOI18N
        btn_eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Eliminar/eliminar_roll.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Actualizar/upd_norm.png"))); // NOI18N
        btn_update.setBorder(null);
        btn_update.setBorderPainted(false);
        btn_update.setContentAreaFilled(false);
        btn_update.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Actualizar/upd_press.png"))); // NOI18N
        btn_update.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Actualizar/upd_roll.png"))); // NOI18N
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Guardar/save_norm.png"))); // NOI18N
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Guardar/save_press.png"))); // NOI18N
        btn_guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Guardar/save_roll.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supplier128px.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(236, 243, 158));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar Nombre");

        txtfiltro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltroKeyTyped(evt);
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
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nuevo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(btn_eliminar)
                    .addComponent(btn_update)
                    .addComponent(btn_nuevo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        String cod = paisc.getSelectedItem().toString();
        
        if("".equals(txt_cc_rut.getText()) || "".equals(txt_nombre.getText()) || "".equals(txt_direccion.getText()) || "".equals(txt_telefono.getText())){
            
            JOptionPane.showMessageDialog(null, "Los campos con * son obligatorios","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            
           if("PAIS".equals(cod)){
               
               cod = "";
               
           }
            
           pr.setRut_cc(txt_cc_rut.getText());
           pr.setNombre(txt_nombre.getText());
           pr.setTelefono(cod+txt_telefono.getText());
           pr.setDireccion(txt_direccion.getText());
           pr.setCorreo(txt_correo.getText());
            
           int option = JOptionPane.showConfirmDialog(null, "Esta seguro de guardar el registro","ADVERTENCIA",JOptionPane.YES_NO_OPTION);
            
           if(option == JOptionPane.YES_OPTION){
                  
               pdao.RegistrarProveedor(pr);
               Limpiar();
               listarProveedor();
               
            }
             
            
        }
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void tbl_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_proveedorMouseClicked
        
        int fila = tbl_proveedor.rowAtPoint(evt.getPoint());
        
        lbl_id.setText(tbl_proveedor.getValueAt(fila, 0).toString());
        txt_cc_rut.setText(tbl_proveedor.getValueAt(fila, 1).toString());
        txt_nombre.setText(tbl_proveedor.getValueAt(fila, 2).toString());
        txt_telefono.setText(tbl_proveedor.getValueAt(fila, 3).toString());
        txt_direccion.setText(tbl_proveedor.getValueAt(fila, 4).toString());
        txt_correo.setText(tbl_proveedor.getValueAt(fila, 5).toString());
        
    }//GEN-LAST:event_tbl_proveedorMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        String cod = paisc.getSelectedItem().toString();
        
        if("".equals(lbl_id.getText())){
            
            JOptionPane.showMessageDialog(null, "Seleccione un registro","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
             
        }else{
            
            if("PAIS".equals(cod)){
                
                cod = "";
                
                } 
            
            pr.setRut_cc(txt_cc_rut.getText());
            pr.setNombre(txt_nombre.getText());
            pr.setTelefono(cod+""+txt_telefono.getText());
            pr.setDireccion(txt_direccion.getText());
            pr.setCorreo(txt_correo.getText());
            pr.setId(Integer.parseInt(lbl_id.getText())); 
            
            if(!"".equals(txt_cc_rut.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_direccion.getText()) && !"".equals(txt_telefono.getText())){
                 
                int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro de ACTUALIZAR el registro","ADVERTENCIA",JOptionPane.YES_NO_OPTION);
            
                if(opcion == JOptionPane.YES_OPTION){
                    
                    pdao.actualizar(pr);
                    Limpiar();
                    listarProveedor();
                
                }
            }else{
                
                JOptionPane.showMessageDialog(this, "Los campos con * son obligatorios","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            
            }
            
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        String vacio = lbl_id.getText();
        
        if("".equals(vacio)){
            
            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                  
       }else{
    
            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro de elimnar el registro?","ADVERTENCIA",JOptionPane.YES_NO_OPTION);
            
            if(respuesta == JOptionPane.YES_OPTION){
               
                int id = Integer.parseInt(lbl_id.getText());
                pdao.eliminar(id);
                Limpiar();
                listarProveedor();
            
        }
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void txtfiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyTyped
        
        txtfiltro.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke) {
                
                trs.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(), 2));
                
            }
        });
        
        trs = new TableRowSorter(modelo);
        tbl_proveedor.setRowSorter(trs);
        
    }//GEN-LAST:event_txtfiltroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_update;
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
    private javax.swing.JComboBox<String> paisc;
    private javax.swing.JTable tbl_proveedor;
    private javax.swing.JTextField txt_cc_rut;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txtfiltro;
    // End of variables declaration//GEN-END:variables
private void nuevo(){
    
    lbl_id.setText("");
    txt_cc_rut.setText("");
    txt_nombre.setText("");
    txt_direccion.setText("");
    txt_correo.setText("");
    txt_telefono.setText("");
    paisc.setSelectedIndex(0);
    
}

}
