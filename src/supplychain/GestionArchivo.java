
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import supplychain.Actor;

/**
 *
 * @author kjimenezh
 */

public class GestionArchivo {
    private String ruta;

    public GestionArchivo(String ruta) {
        this.ruta = ruta;
    }
    
    
    public boolean guardar(ArrayList<Actor> bd) throws FileNotFoundException, IOException{
        
        File archivo = new File(this.ruta);
        
        if(!archivo.exists()){
            archivo.createNewFile();
        }
            
        PrintStream salida = new PrintStream(archivo);
        
        for(Actor actor : bd){
            salida.print();
        }
        
        salida.flush();
        salida.close();
        return true;
    }
    
    public ArrayList<Actor> cargar() throws FileNotFoundException{
        ArrayList<Actor> data = new ArrayList<>();
        Scanner lectura = new Scanner(new File(this.ruta));
        
        while(lectura.hasNext()){
            data.add();
        }
        lectura.close();
        return data;
    }
}
