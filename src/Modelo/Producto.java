
package Modelo;


public class Producto {
    
    private int id;
    private String nombre;
    private String codigo;
    private String proveedor;
    private int stock;
    private double precio;

    public Producto() {
    }

    public Producto(int id, String nombre, String codigo, String proveedor, int stock, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.stock = stock;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
