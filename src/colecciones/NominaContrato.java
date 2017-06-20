/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author T-
 */
public class NominaContrato extends Nomina{

    public NominaContrato(String nombre, String aPaterno, long numeroSeguro, float sueldoBase) {
        super(nombre, aPaterno, numeroSeguro, sueldoBase);
    }

    public NominaContrato() {
    }

    @Override
    public String toString() {
        return "NominaContrato{" + '}';
    }

  
    
}
