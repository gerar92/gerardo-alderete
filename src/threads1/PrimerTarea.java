/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-
 */
//Primera forma que creacion de un thread que es la mas facil y consiste en heredar la clase thread
// Paso 1. Heredamos la clase Thread
public class PrimerTarea extends Thread{

 
    //Paso 2. Sobreescribimos el metodo run
       @Override
    public void run() {
           
           //setName("Primer Thread");
           String nombre = getName();
           System.out.println("Soy un thread que no hace nada " + getName());
          
    }
}
