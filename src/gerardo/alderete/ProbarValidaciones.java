/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardo.alderete;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-
 */
public class ProbarValidaciones {
    public static void main(String[] args) {
        
        float x = 6;
        try {
            ValidacionUsuario.validarNoNegativo(x);
            System.out.println("Primero que lanza ejecucion");
            Usuario u = new Usuario();
            u.setAltura(-2);
            System.out.println("Excepcion de ajuste de altura");
            u.setPeso(80);
            System.out.println("Excepcion del ajueste de peso");
        } catch (NumeroNoNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
