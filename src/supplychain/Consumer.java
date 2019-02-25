
package supplychain;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */

public class Consumer extends Actor{
    
    private ArrayList<Retail> retails;
            
    public Consumer(String nombre, String descripcion, Direccion direccion){
        super(nombre,descripcion,direccion);
        this.retails = new ArrayList<Retail>();
    }
    
    @Override
    public void darInformacion(){
        
    }
}
