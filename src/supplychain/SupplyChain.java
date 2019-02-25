
package supplychain;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */
public class SupplyChain {
    private ArrayList<Actor> actors;
    private ArrayList<Producto> productos;
    
    public SupplyChain(){
        this.actors = new ArrayList<Actor>();
        this.productos = new ArrayList<Producto>();
    }
    
    public boolean addActorFarmer(String nombre, String descripcion, Direccion direccion){
        return this.actors.add(new Farmer(nombre,descripcion,direccion));
    } 
    public boolean addActorManufacturer(String nombre, String descripcion, Direccion direccion){
        return this.actors.add(new Manufacturer(nombre,descripcion,direccion));
    } 
    public boolean addActorDistributionCenter(String nombre, String descripcion, Direccion direccion){
        return this.actors.add(new DistributionCenter(nombre,descripcion,direccion));
    } 
    public boolean addActorRetail(String nombre, String descripcion, Direccion direccion){
        return this.actors.add(new Retail(nombre,descripcion,direccion));
    } 
    public boolean addActorConsumer(String nombre, String descripcion, Direccion direccion){
        return this.actors.add(new Consumer(nombre,descripcion,direccion));
    } 
    
    public Actor getActor(int pos){
        return this.actors.get(pos);
    }
    public boolean addProducto(Producto producto){
        return this.productos.add(producto);
    }
}
