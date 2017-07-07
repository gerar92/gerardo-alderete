/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

import java.util.*;

public class TareaReloj extends Thread{

    @Override
    public void run() {
        int i = 0;
        while (true) {           
            Calendar cal = Calendar.getInstance();
            //Aqui vamos 
            int hora = cal.get(Calendar.HOUR_OF_DAY);
            int minutos = cal.get(Calendar.MINUTE);
            int segundos = cal.get(Calendar.SECOND);
            
            System.out.println("La hora es " + hora + ":" + minutos + ":" + segundos);
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    
}
