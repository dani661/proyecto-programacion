package supermercado;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Supermercado {

    public static void main(String[] args) throws FileNotFoundException {
        int resposta=0;
        Stock s =new Stock();
           
         // Cajeros c =new Cajeros();
           // c.Repon();
          
       while(resposta!=1){
           String[] opciones={"ver productos","comprar producto","ver cesta da compra","salir"};
           
           String r=(String)JOptionPane.showInputDialog(null,"Selecciona opcion:"," ",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones);
              switch(r){
                case "ver productos":
                    
                    break;
                case "comprar producto":
                    
                    break;
                case "ver cesta da compra":
                    
                    break;
                case "salir":
                    
                    break;
              }
            resposta= JOptionPane.showConfirmDialog(null, "Desea realizar otra accion?","", 1, 2);
            //0 e si, 1 e non
//System.out.println(resposta);
              
         }
        
           try {
            s.engadeProd();
        } catch (IOException ex) {
            Logger.getLogger(Supermercado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
