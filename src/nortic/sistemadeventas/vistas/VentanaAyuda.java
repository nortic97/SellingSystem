package nortic.sistemadeventas.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaAyuda extends javax.swing.JInternalFrame {

    public VentanaAyuda() {
        initComponents();
        Walink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        FbLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lbllinkwa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        FbLink = new javax.swing.JLabel();
        Walink = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbllinkwa = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(79, 119, 45));
        setClosable(true);
        setForeground(new java.awt.Color(236, 243, 158));
        setIconifiable(true);
        setTitle("Ayuda");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/help32px.png"))); // NOI18N

        FbLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fb64px.png"))); // NOI18N
        FbLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FbLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FbLinkMouseClicked(evt);
            }
        });

        Walink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/wp48px.png"))); // NOI18N
        Walink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Walink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WalinkMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 243, 158));
        jLabel1.setText("Sistema Diseñado por NORTIC SERVICIO TECNICO");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 243, 158));
        jLabel5.setText("Si posee problemas con el sistema comunicate a nuestro numero de");

        lbllinkwa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbllinkwa.setForeground(new java.awt.Color(236, 243, 158));
        lbllinkwa.setText("contacto");
        lbllinkwa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbllinkwa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllinkwaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 243, 158));
        jLabel7.setText("+573102845699 o haciendo click en los iconos inferiores para chatear ");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 243, 158));
        jLabel8.setText("con nosotros.");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 243, 158));
        jLabel9.setText("V 0.1.2");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 243, 158));
        jLabel10.setText("Thomas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Walink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FbLink))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbllinkwa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbllinkwa)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FbLink)
                    .addComponent(Walink))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WalinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WalinkMouseClicked

        try {
            Desktop.getDesktop().browse(new URI("https://wa.link/byzxg1"));
        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "No hay navegador instalado", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(VentanaAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_WalinkMouseClicked

    private void FbLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FbLinkMouseClicked

        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/Nortic97"));
        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "No hay navegador instalado", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(VentanaAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_FbLinkMouseClicked

    private void lbllinkwaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllinkwaMouseClicked
        lbllinkwa.setForeground(Color.BLUE.darker());
        try {
            Desktop.getDesktop().browse(new URI("https://wa.link/byzxg1"));
        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "No hay navegador instalado", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(VentanaAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbllinkwaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FbLink;
    private javax.swing.JLabel Walink;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbllinkwa;
    // End of variables declaration//GEN-END:variables
}
