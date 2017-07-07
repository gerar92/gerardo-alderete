/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads2;

/**
 *
 * @author T-
 * Aqui vamos a usar el polimorfismo
 */
public class Relojote implements Runnable, ComportamientoComer{
    public static void main(String[] args) {
            //Probemos que no odemos crear objetos de las interfaces
//            ComportamientoComer cp = new ComportamientoComer() ;
            //Aqui se crea el thread POLIFORFICAMENTE
               
            Runnable r = new Relojote();
            Thread t1 = new Thread(r, "hilo con el segundo metodo");
            
            t1.start();
            
            
            
            
    }

    @Override
    public void run() {
        System.out.println("Pronto seras un reloj");
       
    }

    @Override
    public String obtenerHabitoAlimenticio() {
        
        return "Soy reloj y no como";   
    }
}
