package supermercado;

import Display.CajerosDisplay;
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
           Cajeros cs = new Cajeros();
           
          // cs.Repon(4,s.stock);
           String[] opciones={"Cliente","Cajera/o"};
           
           String r=(String)JOptionPane.showInputDialog(null,"Selecciona opcion:"," ",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones);
              switch(r){
                case "Cliente":
                    Display d1=new Display();
                        d1.setVisible(true);
                    break;
                case "Cajera/o":
                    CajerosDisplay d2=new CajerosDisplay();
                        d2.setVisible(true);
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
