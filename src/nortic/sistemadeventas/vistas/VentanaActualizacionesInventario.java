package nortic.sistemadeventas.vistas;

import nortic.sistemadeventas.modelos.Inventario;
import nortic.sistemadeventas.dao.InventarioDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class VentanaActualizacionesInventario extends javax.swing.JInternalFrame {

    DefaultTableModel tmpm = new DefaultTableModel();
    private TableRowSorter<TableModel> Orden;

    public VentanaActualizacionesInventario() {
        initComponents();
        Listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_inventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Calendario = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(79, 119, 45));
        setClosable(true);
        setIconifiable(true);
        setTitle("Actualizaciones de inventario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/box24px.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "TIPO", "CANTIDAD", "VENDEDOR", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_inventario);
        if (tbl_inventario.getColumnModel().getColumnCount() > 0) {
            tbl_inventario.getColumnModel().getColumn(0).setResizable(false);
            tbl_inventario.getColumnModel().getColumn(1).setResizable(false);
            tbl_inventario.getColumnModel().getColumn(2).setResizable(false);
            tbl_inventario.getColumnModel().getColumn(3).setResizable(false);
            tbl_inventario.getColumnModel().getColumn(4).setResizable(false);
            tbl_inventario.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 243, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar fecha:");

        jButton1.setText("Refrescar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(Calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Limpiar();
        
        tbl_inventario.setRowSorter(null);
        
        Listar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (Calendario.getDate() != null) {

            DateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String Fecha = FormatoFecha.format(Calendario.getDate());

            Orden = new TableRowSorter<>(tmpm);
            tbl_inventario.setRowSorter(Orden);
            Orden.setRowFilter(RowFilter.regexFilter(Fecha, 5));

        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado una fecha", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Calendario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_inventario;
    // End of variables declaration//GEN-END:variables
 public void Listar() {

        List<Inventario> listai = new InventarioDAO().Listar();

        tmpm = (DefaultTableModel) tbl_inventario.getModel();

        Object[] ob = new Object[6];

        for (int i = 0; i < listai.size(); i++) {

            ob[0] = listai.get(i).getId();
            ob[1] = listai.get(i).getProducto();
            ob[2] = listai.get(i).getTipo();
            ob[3] = listai.get(i).getCantidad();
            ob[4] = listai.get(i).getVendedor();
            ob[5] = listai.get(i).getFecha();
            tmpm.addRow(ob);
        }
        tbl_inventario.setModel(tmpm);
    }

    private void Limpiar() {

        for (int i = 0; i < tmpm.getRowCount(); i++) {
            tmpm.removeRow(i);
            i = i - 1;
        }

    }

}
