package nortic.sistemadeventas.vistas;

import CryptographyJava.Crypthography;
import java.awt.Color;
import nortic.sistemadeventas.modelos.Login;
import nortic.sistemadeventas.dao.LoginDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class VentanaLogin extends javax.swing.JFrame {

    Login l = new Login();
    VentanaPrincipal home = new VentanaPrincipal();
    LoginDAO ldao = new LoginDAO();
    File dll = null;
    FileReader fr = null;
    BufferedReader br = null;

    public VentanaLogin() {

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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(79, 119, 45));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 243, 158));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 243, 158));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USUARIO:");
        jLabel3.setToolTipText("");

        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Comprobar/comprobar_norm.png"))); // NOI18N
        btn_ingresar.setBorder(null);
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setContentAreaFilled(false);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.setFocusPainted(false);
        btn_ingresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Comprobar/comprobar_press.png"))); // NOI18N
        btn_ingresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/nortic/sistemadeventas/images/Comprobar/comprobar_roll.png"))); // NOI18N
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_bd.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_bd.setForeground(new java.awt.Color(236, 243, 158));
        btn_bd.setText("Ajustes");
        btn_bd.setToolTipText("");
        btn_bd.setBorderPainted(false);
        btn_bd.setContentAreaFilled(false);
        btn_bd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bdActionPerformed(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Registrar.setForeground(new java.awt.Color(236, 243, 158));
        Registrar.setText("Registro");
        Registrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(1, 1, 1)));
        Registrar.setBorderPainted(false);
        Registrar.setContentAreaFilled(false);
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_bd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txt_password))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login128px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111))
                    .addComponent(lbl_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

        Object[] choises = {"Administrador", "Usuario", "Cancelar"};

        int option = JOptionPane.showOptionDialog(null, "Seguro que desea Registrar Usuarios", "ALERTA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choises, choises[2]);
        String lic = "";

        try {

            dll = new File("./conf/License.conf");

            fr = new FileReader(dll);
            br = new BufferedReader(fr);

            lic = br.readLine();

            if (option == 0) {

                String codigo = JOptionPane.showInputDialog(null, "Ingrese codigo maestro", "CODIGO MAESTRO", JOptionPane.QUESTION_MESSAGE);
                codigo = Crypthography.getSHA256(codigo);

                if (codigo == null) {

                    JOptionPane.showMessageDialog(null, "Operacion Cancelada", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    while (!codigo.equals(lic)) {

                        JOptionPane.showMessageDialog(null, "Codigo erroneo", "INFORMACION", JOptionPane.ERROR_MESSAGE);
                        codigo = JOptionPane.showInputDialog(null, "Ingrese codigo maestro", "CODIGO MAESTRO", JOptionPane.QUESTION_MESSAGE);
                        codigo = Crypthography.getSHA256(codigo);

                        if (codigo == null) {
                            JOptionPane.showMessageDialog(null, "Operacion Cancelada", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        }

                    }

                    VentanaRegistro frame = new VentanaRegistro(true);
                    frame.setVisible(true);

                }

            } else if (option == 1) {

                VentanaRegistro frame = new VentanaRegistro(false);
                frame.setVisible(true);

            } else if (option == 2) {

                JOptionPane.showMessageDialog(null, "Operacion Cancelada", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (IOException e) {

            if (!dll.exists()) {

                try {

                    FileWriter code = new FileWriter(dll);

                    PrintWriter pr = new PrintWriter(code);

                    String data = Crypthography.getSHA256("ThomasNG151213");

                    pr.println(data);
                    pr.close();

                } catch (IOException e2) {

                    JOptionPane.showMessageDialog(null, e2.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            }

            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(null, e2.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_RegistrarActionPerformed

    private void btn_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bdActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea acceder a los ajustes...", "ALERTA", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            VentanaAjustes a = new VentanaAjustes();
            a.setVisible(true);

        }

    }//GEN-LAST:event_btn_bdActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

        inicio();

    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {

            inicio();

        }

    }//GEN-LAST:event_txt_passwordKeyPressed


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

    public void inicio() {

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

    }
}
