
package supplychain;

/**
 *
 * @author kjimenezh
 */

public class Main {
    public static void main(String[] args){
        
        SupplyChain supplychain = new SupplyChain();
        
        Producto leche = new Producto("Leche");
        Producto harina = new Producto("Harina");
        Producto pan = new Producto("Pan");
        
        Direccion direcciongranjax = new Direccion("53 oeste","12 sur");
        Direccion direcciongranjay = new Direccion("85 oeste","11 sur");
        Direccion direccionmanufacturaw = new Direccion("53 oeste","12 sur");
        
        supplychain.addActorFarmer("Granja X", "Productora de leche", direcciongranjax);
        supplychain.getActor(0).addProducto(leche);
        supplychain.addActorFarmer("Granja Y", "Productora de harina", direcciongranjay);
        supplychain.getActor(1).addProducto(harina);
        supplychain.addActorManufacturer("Manufacturera W", "Productora de pan", direccionmanufacturaw);
        
        
    }
}
