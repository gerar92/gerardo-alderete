/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardo.alderete;

/**
 *
 * @author T-
 */
public class GerardoAlderete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Probaremos nuestra solucion
        
        //Crear un usuario ipotetico
        Usuario u = new Usuario();
        
        //Le asignamos valores
        u.setAltura(1.75F);
        u.setPeso(74);
        
        //Generamos el modelo
        Imc imc = new Imc();       
        
        System.out.println( "El valor del imc es: " + imc.calcular(u));
        
        
    }
    
}
