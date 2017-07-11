/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads3;

import java.util.Calendar;

/**
 *
 * @author T-
 */
public class Aplicacion {
    public static void main(String[] args) {
        //A este tipo de threads se les lllama threads de fondo
        Thread t1 = new Thread( new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try{
                        Calendar cal = Calendar.getInstance();
                        int hora = cal.get(Calendar.HOUR_OF_DAY);
                        int minuto = cal.get(Calendar.MINUTE);
                        int segundo = cal.get(Calendar.SECOND);
                        System.out.println("" + hora + ":" + minuto + ":"+ segundo);
                        Thread.sleep(1000);
                       
                        
                    }catch(Exception e){
                        
                    }
                }
            }
        }
        );
        
        
        t1.start();
           
    }
}
