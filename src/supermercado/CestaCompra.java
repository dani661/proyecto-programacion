package supermercado;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class CestaCompra {
    private float precio,saldo,cambio;
    private int numpro;
    public  ArrayList<Stock> cesta;

    public ArrayList<Stock> getCesta() {
        return cesta;
    }

    public CestaCompra() {
    }

    public CestaCompra(float precio, float saldo, float cambio, int numpro) {
        this.precio = precio;
        this.saldo = saldo;
        this.cambio = cambio;
        this.numpro = numpro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public int getNumpro() {
        return numpro;
    }

    public void setNumpro(int numpro) {
        this.numpro = numpro;
    }

    @Override
    public String toString() {
        return "CestaCompra{" + "precio=" + precio + ", saldo=" + saldo + ", cambio=" + cambio + ", numpro=" + numpro + '}';
    }
    public void engadeCesta(int i) throws FileNotFoundException{
        cesta=new ArrayList();
        CestaCompra c=new CestaCompra();
            Stock s = new Stock(); //instancio clase stock objeto s para llamar al arraylist
                // con el int del parametro selecciono pos en a.list y lo meto en cesta
            Stock obs=new Stock(s.stock.get(i).getProducto(),s.stock.get(i).getPrecio(),s.stock.get(i).getCantidad());
                   System.out.println(obs.toString());
                   
                   cesta.add(obs);   //añado en cesta el objeto a la lista
                   
    }
}
