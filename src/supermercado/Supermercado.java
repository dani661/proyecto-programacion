package supermercado;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Supermercado {

    public static void main(String[] args) throws FileNotFoundException {
        
        Stock s =new Stock();
            System.out.println(s.revisaStock());    //prueba del metodo
            
        try {
            s.engadeProd();
        } catch (IOException ex) {
            Logger.getLogger(Supermercado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
