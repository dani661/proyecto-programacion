/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Damian
 */
public class CestaCompra {
    private float precio,saldo,cambio;
    private int numpro;

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
       
}
