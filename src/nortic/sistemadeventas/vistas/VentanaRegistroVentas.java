package nortic.sistemadeventas.vistas;

import nortic.sistemadeventas.modelos.Venta;
import nortic.sistemadeventas.dao.VentaDAO;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class VentanaRegistroVentas extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    Venta ve = new Venta();
    VentaDAO vedao = new VentaDAO();
    TableRowSorter trs = null;
    
    public VentanaRegistroVentas() {
        initComponents();
        listarv();
    }
    
    public void listarv() {
        
        List<Venta> v = new VentaDAO().Listar();
        
        modelo = (DefaultTableModel) tbl_listar_facturas.getModel();
        
        Object[] ob = new Object[5];
        
        for (int i = 0; i < v.size(); i++) {
            
            ob[0] = v.get(i).getId();
            ob[1] = v.get(i).getCliente();
            ob[2] = v.get(i).getVendedor();
            ob[3] = v.get(i).getTotal();
            ob[4] = v.get(i).getFecha();
            
            modelo.addRow(ob);
        }
        tbl_listar_facturas.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_listar_facturas = new javax.swing.JTable();

        setBackground(new java.awt.Color(79, 119, 45));
        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de ventas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculator24px.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 243, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Factura");

        txtNumeroFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroFacturaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFacturaKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_listar_facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FACT", "CLIENTE", "VENDEDOR", "TOTAL", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listar_facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listar_facturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_listar_facturas);
        if (tbl_listar_facturas.getColumnModel().getColumnCount() > 0) {
            tbl_listar_facturas.getColumnModel().getColumn(0).setResizable(false);
            tbl_listar_facturas.getColumnModel().getColumn(1).setResizable(false);
            tbl_listar_facturas.getColumnModel().getColumn(2).setResizable(false);
            tbl_listar_facturas.getColumnModel().getColumn(3).setResizable(false);
            tbl_listar_facturas.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_listar_facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listar_facturasMouseClicked
        int fila = tbl_listar_facturas.rowAtPoint(evt.getPoint());
        String NumeroFactura = tbl_listar_facturas.getValueAt(fila, 0).toString();
        
        if (evt.getClickCount() == 2) {
            try {
                File Factura = new File("./Reportes/" + NumeroFactura + ".pdf");
                Desktop.getDesktop().open(Factura);
            } catch (IOException e) {
            }
        }

    }//GEN-LAST:event_tbl_listar_facturasMouseClicked

    private void txtNumeroFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFacturaKeyPressed

    }//GEN-LAST:event_txtNumeroFacturaKeyPressed

    private void txtNumeroFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFacturaKeyTyped
        
        txtNumeroFactura.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent ke) {
                
                trs.setRowFilter(RowFilter.regexFilter(txtNumeroFactura.getText(), 0));
                
            }
        });
        
        trs = new TableRowSorter(modelo);
        tbl_listar_facturas.setRowSorter(trs);
        
    }//GEN-LAST:event_txtNumeroFacturaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_listar_facturas;
    private javax.swing.JTextField txtNumeroFactura;
    // End of variables declaration//GEN-END:variables

    public void LimpiarTabla() {
        
        modelo.setRowCount(0);
        
    }
    
}
