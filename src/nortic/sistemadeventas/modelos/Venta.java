
package nortic.sistemadeventas.modelos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Venta {
    
    Date calendario = new Date();
    DateFormat formato_de_fecha = new SimpleDateFormat("dd/MM/yyyy");
    private int id;
    private String cliente;
    private String Vendedor;
    private double total; 
    private String fecha = formato_de_fecha.format(calendario);
    
    public Venta() {
    }

    public Venta(int id, String cliente, String Vendedor, double total) {
        this.id = id;
        this.cliente = cliente;
        this.Vendedor = Vendedor;
        this.total = total;
    }

    public Date getCalendario() {
        return calendario;
    }

    public void setCalendario(Date calendario) {
        this.calendario = calendario;
    }

    public DateFormat getFormato_de_fecha() {
        return formato_de_fecha;
    }

    public void setFormato_de_fecha(DateFormat formato_de_fecha) {
        this.formato_de_fecha = formato_de_fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    

}
