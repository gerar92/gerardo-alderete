
package chekadas;

import java.io.FileNotFoundException;
import java.io.IOException;


public class MainArchivos {
    public static void main(String[] args) {
        ModeloArchivo ma ;
        
        try{
            ma = new ModeloArchivo();
            ma.escribirArchivo();
            System.out.println("Se genero exitosamente");
        }catch( FileNotFoundException e ){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e ){
            System.out.println("Error : " + e.getMessage());
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }finally{
            System.out.println("Este siempre se ejecuta");
        }
    }
}
