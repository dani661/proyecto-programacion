package supermercado;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Cajeros {

    public Cajeros() {
    }
        
        
    public void Repon() throws FileNotFoundException{
        Stock s =new Stock();
            ArrayList<Stock> arr;
                arr=s.revisaStock();
                    
                    for(int i=0; i<arr.size();i++){
                        System.out.println(arr.get(i).toString());
                    }
                
    }
}
