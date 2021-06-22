/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author sve_c
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int NumerodeTeclas;
    private int multimedia;

   // public Teclado() {
    //}

        public Teclado(String marca, String modelo, int NumerodeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.NumerodeTeclas = NumerodeTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumerodeTeclas() {
        return NumerodeTeclas;
    }

    public void setNumerodeTeclas(int NumerodeTeclas) {
        this.NumerodeTeclas = NumerodeTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", NumerodeTeclas=" + NumerodeTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
    
}
