
package supplychain;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */
public class Retail extends Actor{
    
    private ArrayList<DistributionCenter> distributioncenters;
    private ArrayList<Consumer> consumers;
    
    public Retail(String nombre, String descripcion, Direccion direccion){
        super(nombre,descripcion,direccion);
        this.distributioncenters = new ArrayList<DistributionCenter>();
        this.consumers = new ArrayList<Consumer>();
    }
    
    @Override
    public void darInformacion(){
        
    }
}
