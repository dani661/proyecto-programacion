package supermercado;

import Display.Display;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Supermercado {

    public static void main(String[] args) throws FileNotFoundException {
        int resposta=0;
        Stock s =new Stock();
        CestaCompra c= new CestaCompra();
        
           String[] opciones={"Cliente","Cajera/o"};
           
           String r=(String)JOptionPane.showInputDialog(null,"Selecciona opcion:"," ",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones);
              switch(r){
                case "Cliente":
                    Display d1=new Display();
                        d1.setVisible(true);
                    break;
                case "Cajera/o":
                    
                    break;
              }
            
         }
        
     /*      try {
            s.engadeProd();
        } catch (IOException ex) {
            Logger.getLogger(Supermercado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    
}
