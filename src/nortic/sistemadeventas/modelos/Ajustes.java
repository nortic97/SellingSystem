package nortic.sistemadeventas.modelos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Ajustes {

    FileWriter fichero = null;
    PrintWriter pw = null;

    public String GuardarConfig(String base, String puerto, String host, String user, String pass) {
        try {
            fichero = new FileWriter("./conf/BD.conf");
            pw = new PrintWriter(fichero);

            pw.println(base);
            pw.println(puerto);
            pw.println(host);
            pw.println(user);
            pw.println(pass);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(null, e2.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }

    public String ProbarConexion(String base, String puerto, String host, String user, String pass) {

        try {
            fichero = new FileWriter("./conf/BDtemp.conf");
            pw = new PrintWriter(fichero);

            pw.println(base);
            pw.println(puerto);
            pw.println(host);
            pw.println(user);
            pw.println(pass);

        } catch (IOException e) {
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(null, e2.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }

    public void borrartemp() {

        File archivo = new File("./conf/BDtemp.conf");

        archivo.delete();

    }

}
