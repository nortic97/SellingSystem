
package nortic.sistemadeventas.modelos;

public class Proveedor {
    
    private int id;
    private String rut_cc;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;

    public Proveedor() {
    }

    public Proveedor(int id, String rut_cc, String nombre, String telefono, String direccion, String correo) {
        this.id = id;
        this.rut_cc = rut_cc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut_cc() {
        return rut_cc;
    }

    public void setRut_cc(String rut_cc) {
        this.rut_cc = rut_cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
