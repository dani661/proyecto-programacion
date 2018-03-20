package supermercado;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cajeros {

    public Cajeros() {
    }
        
        
    public ArrayList Repon(int i,ArrayList<Stock> stocksinrep) throws FileNotFoundException{
        Stock s =new Stock();
           // ArrayList<Stock> arr;
            //   arr=s.revisaStock();
                    
                /*    for(int i=0; i<arr.size();i++){
                        System.out.println(arr.get(i).toString());
                    }
                */
                int j=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Dame as unidades a repoñer para: "+stocksinrep.get(i).getProducto()));
                        stocksinrep.get(i).setCantidad(j+stocksinrep.get(i).getCantidad());
            return stocksinrep;
    }

}
