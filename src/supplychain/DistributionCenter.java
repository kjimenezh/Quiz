
package supplychain;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */
public class DistributionCenter extends Actor{
    
    private ArrayList<Manufacturer> manufacturers;
    private ArrayList<Retail> retails;
    
    public DistributionCenter(String nombre, String descripcion, Direccion direccion){
        super(nombre,descripcion,direccion);
        this.manufacturers = new ArrayList<Manufacturer>();
        this.retails = new ArrayList<Retail>();
    }
    
    @Override
    public void darInformacion(){
        
    }
}
