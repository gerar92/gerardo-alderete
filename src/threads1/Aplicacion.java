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
public class Aplicacion {
    public static void main(String[] args) {
        //Ciclo de vida del thread
        //Nace
        PrimerTarea pt =new PrimerTarea();
        OtraTarea ot = new OtraTarea();
        TareaReloj tr = new TareaReloj();
        //Lo ponemos en estado runnable
        pt.start();
        ot.start();
        tr.start();
        //El siguiente paso es meterlo a la cpu( esto lo hace le administrador de threads
        
    }
}
