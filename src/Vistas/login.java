package Vistas;

import Modelo.Login;
import Modelo.LoginDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    Login l = new Login();
    VentanaPrincipal home = new VentanaPrincipal();
    LoginDAO ldao = new LoginDAO();
    File dll = null;
    FileReader fr = null;
    BufferedReader br = null;

    public login() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        File carpeta = new File("./Reportes");
        File directorio = new File("./conf");
        File cfg = new File("./conf/BD.conf");
        File img = new File("./Img");

        if (!carpeta.exists()) {
            if (carpeta.mkdirs()) {
            }
        }
        if (!img.exists()) {
            if (img.mkdirs()) {
            }
        }
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
            }
        }

        if (!cfg.exists()) {
            lbl_info.setText("No hay Configuraciones...");
        } else {
            lbl_info.setText("Archivo cfg cargado con exito...");
        }       
    }

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/key32px.png"));
        return retValue;
    }

    public void validar() {

        String cc = txt_user.getText();
        String pass = String.valueOf(txt_password.getText());

        if (!"".equals(cc) || !"".equals(pass)) {

            l = ldao.ingresar(cc, pass);

            if (l.getCc() != null && l.getContraseña() != null) {

                home = new VentanaPrincipal(l);
                home.setVisible(true);
                dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Usuario o Contraseña inavalidos", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        btn_bd = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesion");
        setIconImage(getIconImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA:");
        jLabel2.setToolTipText("");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USUARIO:");
        jLabel3.setToolTipText("");

        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_ingresar.setText("INGRESAR");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_bd.setText("Ajustes");
        btn_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bdActionPerformed(evt);
            }
        });

        Registrar.setText("Registro");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_user))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_password))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_bd, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bd)
                    .addComponent(Registrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login128px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

        if ("".equals(txt_user.getText()) || "".equals(txt_password.getText())) {

            if ("".equals(txt_user.getText()) && "".equals(txt_password.getText())) {

                JOptionPane.showMessageDialog(null, "Datos Vacios", "ERROR", JOptionPane.INFORMATION_MESSAGE);

            } else if ("".equals(txt_user.getText())) {

                JOptionPane.showMessageDialog(null, "Usuario vacio", "USUARIO", JOptionPane.INFORMATION_MESSAGE);
                txt_user.requestFocus();

            } else if ("".equals(txt_password.getText())) {

                JOptionPane.showMessageDialog(null, "Contraseña vacia", "CONTRASEÑA", JOptionPane.INFORMATION_MESSAGE);
                txt_password.requestFocus();

            }
        } else {

            validar();

        }

    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bdActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea acceder a los ajustes...", "ALERTA", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            VentanaAjustes a = new VentanaAjustes();
            a.setVisible(true);

        }


    }//GEN-LAST:event_btn_bdActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea Registrar Usuarios", "ALERTA", JOptionPane.YES_NO_OPTION);
        String lic = "";

        try {

            dll = new File("./conf/License.conf");
            fr = new FileReader(dll);
            br = new BufferedReader(fr);

            lic = br.readLine();

        } catch (IOException e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
        }

        if (option == JOptionPane.YES_OPTION) {

            String codigo = JOptionPane.showInputDialog(null, "Ingrese codigo maestro", "CODIGO MAESTRO", JOptionPane.QUESTION_MESSAGE);

            if (codigo == null) {

                JOptionPane.showMessageDialog(null, "Operacion Cancelada", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            } else {

                while (!codigo.equals(lic)) {

                    JOptionPane.showMessageDialog(null, "Codigo erroneo", "INFORMACION", JOptionPane.ERROR_MESSAGE);
                    codigo = JOptionPane.showInputDialog(null, "Ingrese codigo maestro", "CODIGO MAESTRO", JOptionPane.QUESTION_MESSAGE);

                    if (codigo == null) {
                        JOptionPane.showMessageDialog(null, "Operacion Cancelada", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }

                }

                VentanaRegistro frame = new VentanaRegistro();
                this.dispose();
                frame.setVisible(true);

            }

        }


    }//GEN-LAST:event_RegistrarActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JButton btn_bd;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbl_info;
    private javax.swing.JPasswordField txt_password;
    public static javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
