/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author T-
 */
public class GenerarNominas {
    public static void main(String[] args) {
        NominaContrato nc = new NominaContrato("Juan", "Lopez",1234,4500);
        NominaHonorarios nh = new NominaHonorarios( 0.16f,0.16f,"Ana","Perez", 4321,6000);
        
        //generamos un arrayList para meter las dos nominas anteriores
        ArrayList<Nomina> misNominas = new ArrayList<>();
        misNominas.add(nc);
        misNominas.add(nh);
        
        for( Nomina n : misNominas){
            System.out.println("El nombre del usuario es : " + n.getNombre());
        }
    }
}
