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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor _monitor = new Monitor ("LG","Monitor Full HD", 15);
        CPU _cpu = new CPU ("AlienWare", "Gamer" , 5600);
        Mouse _mouse = new Mouse ("Logitech", " G500", " Gamer");
        Teclado _teclado = new Teclado ("HP ", "GTW ", 82 ,  1 );
        System.out.println("La marca de tu Monitor es: " +  _monitor.getMarca()+ " El modelo de tu monitor es: " +   _monitor.getModelo() +  " Las pulgadas de tu monitor son: " +  _monitor.getPulgadas());
        System.out.println("La marca de tu CPU es : " +  _cpu.getMarca()+ " El modelo de tu cpu es: " +   _cpu.getModelo() +  " La velocidad de procesamiento es : " +  _cpu.getVelocidadProcesador());
        System.out.println("La marca de tu mouse es : " +  _mouse.getMarca()+ " El modelo de tu mouse es: " +   _mouse.getModelo() +  " El tipo de tu mouse es : " +  _mouse.getTipo());
        System.out.println("La marca de tu teclado es : " +  _teclado.getMarca()+ " El modelo de tu teclado es: " +   _teclado.getModelo() +  " El numero de teclas es : " +  _teclado.getNumerodeTeclas() + " El valor de multimedia es : " + _teclado.getMultimedia());
        
    }
    
}
