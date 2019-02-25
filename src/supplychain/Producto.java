
package supplychain;

/**
 *
 * @author kjimenezh
 */
public class Producto {
    private String nombre;
    private String materiaprima;
    private double precio;
    private int codigodeventa;
    private Fecha fechaentrada;
    private Fecha fechasalida;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void setMateriaprima(String materiaprima) {
        this.materiaprima = materiaprima;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigodeventa(int codigodeventa) {
        this.codigodeventa = codigodeventa;
    }

    public Fecha getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Fecha fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public Fecha getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Fecha fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateriaprima() {
        return materiaprima;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCodigodeventa() {
        return codigodeventa;
    }
    
    
}
