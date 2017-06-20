/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author T-
 * Encapsulamos esta clase y agregramos constructores
 */
public class Nomina {
    private String nombre;
    private String aPaterno;
    private long numeroSeguro;
    private float sueldoBase;

    public Nomina(String nombre, String aPaterno, long numeroSeguro, float sueldoBase) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.numeroSeguro = numeroSeguro;
        this.sueldoBase = sueldoBase;
    }

    public Nomina() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public long getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(long numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
