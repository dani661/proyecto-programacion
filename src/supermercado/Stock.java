package supermercado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Stock {
    private String producto;
    private float precio;
    private int cantidad;
    
    File fich =new File("Stock.txt");
    PrintWriter pw;
    ArrayList<Stock> stock = new ArrayList<>();
    Scanner sc;
    
    
    public Stock() throws FileNotFoundException {
        sc=new Scanner(fich);
        String[] arrayprod=new String[3];
            while(sc.hasNextLine()){
                String linea=sc.nextLine();
                    arrayprod=linea.split(",");         //corto la linea y añado a un array
                    Stock prod=new Stock(arrayprod[0],Float.parseFloat(arrayprod[1]),
                            Integer.parseInt(arrayprod[2]));
                    stock.add(prod);              //añado producto al arraylist desde el archivo
                        
            }
    }

    public Stock(String nombreprod, float precio, int existencias) {
        this.producto = nombreprod;
        this.precio = precio;
        this.cantidad = existencias;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Stock{" + "nombreprod=" + producto + ", prescio=" + precio + ", existencias=" + cantidad + '}';
    }
    
    public void engadeProd() throws IOException{
        boolean resposta=true;
        
        while(resposta){
                JOptionPane.showMessageDialog(null,"Dame o producto a engadir: ");

                Stock prodc=new Stock(JOptionPane.showInputDialog(null,"Nome do producto"),Float.parseFloat(JOptionPane.showInputDialog
                (null,"Dame o precio do producto (float)")),Integer.parseInt(JOptionPane.showInputDialog
                (null,"Dame a cantidade do producto")));

                stock.add(prodc);
                    pw=new PrintWriter(new FileWriter(fich,true));
                            pw.write(prodc.getProducto()+","+prodc.getPrecio()+","+prodc.getCantidad()+System.getProperty("line.separator"));
                            pw.close();
            int r=JOptionPane.showConfirmDialog(null,"Queres engadir outro producto?");
                
                if(r==0){
                    resposta=true;
                }
                else{
                    resposta=false;
                }
        }
    }
    
    public String revisaStock(){
        ArrayList<String> prodreponer = new ArrayList<>();
        
        for(int i=0; i<stock.size();i++){
            if(stock.get(i).getCantidad()==0){
                prodreponer.add("O producto "+stock.get(i)
                        +" ten 0 unidades en stock e necesita repoñer.");
                //System.out.println("O producto "+stock.get(i).getProducto());
            }
            else{
                
            }
        }
        return prodreponer.toString();
    }
    
}
