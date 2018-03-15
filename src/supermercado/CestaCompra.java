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
    private ArrayList<Stock> cesta;

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
    public void engadecesta(int i) throws FileNotFoundException{
        Stock s = new Stock(); //instancio clase stock objeto s para llamar al arraylist
        s=s.stock.get(i);      // con el int del parametro selecciono pos en a.list y lo meto en s
                                
        cesta.add(s);   //añado en cesta el objeto a la lista
    }
}
