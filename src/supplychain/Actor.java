
package supplychain;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */

public abstract class Actor {
    protected String nombre;
    protected String descripcion;
    protected Direccion direccion;
    protected ArrayList<Producto> productos;

    public Actor(String nombre, String descripcion, Direccion direccion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.productos = new ArrayList<Producto>();
    }
    
    
    public abstract void darInformacion();

    public boolean addProducto(Producto producto){
        return this.productos.add(producto);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
}
