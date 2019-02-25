
package supplychain;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */
public class Farmer extends Actor{
    private ArrayList<Manufacturer> manufacturers;

    public Farmer(String nombre, String descripcion, Direccion direccion){
        super(nombre,descripcion,direccion);
        this.manufacturers = new ArrayList<Manufacturer>();
    }
    
    @Override
    public void darInformacion(){
        
    }
}
