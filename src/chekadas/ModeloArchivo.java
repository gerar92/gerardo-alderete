/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chekadas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author T-
 */
public class ModeloArchivo {
    public void escribirArchivo() throws FileNotFoundException, IOException{
        //Paso 1 Generar archvo
        File file = new File("archivando");
        //El siguiente paso es muy importante
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        String miObjeto = "Este es un objeto de la clase string";
        oos.writeObject(miObjeto);
        
        System.out.println("Se guardo tu string con exito");      
        
    }
}
