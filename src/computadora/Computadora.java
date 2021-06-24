/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;


/**
 *
 * @author sve_c
 */
public class Computadora {
    private String marca;
    private String modelo;
    private CPU _cpu;
    private Monitor _monitor;
    private Mouse _mouse;
    private Teclado _teclado;

    public Computadora(String hp, String pavilion, CPU cpu) {
    }

    public Computadora(String marca, String modelo, CPU _cpu, Monitor _monitor, Mouse _mouse, Teclado _teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this._cpu = _cpu;
        this._monitor = _monitor;
        this._mouse = _mouse;
        this._teclado = _teclado;
        
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ",\n _cpu=" + _cpu + ",\n _monitor=" + _monitor + ",\n _mouse=" + _mouse + ",\n _teclado=" + _teclado + '}';
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Computadora _computadora = new Computadora ("HP", "Pavilion", new CPU ("Intel", "Core i7", 5600 ), new Monitor ("ASUS","Rog strix", 24 ), new Mouse ("Logitech ", "G500 ", "Gamer" ), new Teclado ("Steelseries ", "Apex Pro ",80 , 20 )); 
          System.out.println(_computadora);
          
        
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

    public CPU getCpu() {
        return _cpu;
    }

    public void setCpu(CPU _cpu) {
        this._cpu = _cpu;
    }

    public Monitor getMonitor() {
        return _monitor;
    }

    public void setMonitor(Monitor _monitor) {
        this._monitor = _monitor;
    }

    public Mouse getMouse() {
        return _mouse;
    }

    public void setMouse(Mouse _mouse) {
        this._mouse = _mouse;
    }

    public Teclado getTeclado() {
        return _teclado;
    }

    public void setTeclado(Teclado _teclado) {
        this._teclado = _teclado;
    }
    
}
