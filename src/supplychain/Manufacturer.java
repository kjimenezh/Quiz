
package supplychain;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */
public class Manufacturer extends Actor{
    private ArrayList<Farmer> farmers;
    private ArrayList<DistributionCenter> distributioncenters;
    
    public Manufacturer(String nombre, String descripcion, Direccion direccion){
        super(nombre,descripcion,direccion);
        this.farmers = new ArrayList<Farmer>();
        this.distributioncenters = new ArrayList<DistributionCenter>();
    }
    
    @Override
    public void darInformacion(){
        
    }
}
