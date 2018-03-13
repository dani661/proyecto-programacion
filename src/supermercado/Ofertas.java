package supermercado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ofertas {
        private String codoferta;
        private float descuento;
       
        File fich =new File("Ofertas.txt");
        PrintWriter pw;
        ArrayList<Ofertas> ofertas = new ArrayList<>();
        Scanner sc;

    public Ofertas(String codoferta, float descuento) {
        this.codoferta = codoferta;
        this.descuento = descuento;
    }
        
        
        public Ofertas() throws FileNotFoundException {
        sc=new Scanner(fich);
        String[] arrayofer=new String[3];
            while(sc.hasNextLine()){
                String linea=sc.nextLine();
                    arrayofer=linea.split(",");         //corto la linea y añado a un array
                    Ofertas prod=new Ofertas(arrayofer[0],Float.parseFloat(arrayofer[1]));
                            
                    ofertas.add(prod);              //añado producto al arraylist desde el archivo
                        
            }
    }
        
        public void calcularPrecioDescuento(float precio) throws FileNotFoundException{
            float descuento;
            Stock st = new Stock();
            descuento =st.getPrecio();
                    
                   System.out.println(st.stock.toString());
                    
                    
                    
                    
                    
            
        }
        
}
