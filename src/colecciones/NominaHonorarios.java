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
public class NominaHonorarios  extends Nomina{
    private float isr;
    private float iva;

    public NominaHonorarios(float isr, float iva, String nombre, String aPaterno, long numeroSeguro, float sueldoBase) {
        super(nombre, aPaterno, numeroSeguro, sueldoBase);
        this.isr = isr;
        this.iva = iva;
    }

    public NominaHonorarios() {
        
    }
    
    

    public float getIsr() {
        return isr;
    }

    public void setIsr(float isr) {
        this.isr = isr;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
