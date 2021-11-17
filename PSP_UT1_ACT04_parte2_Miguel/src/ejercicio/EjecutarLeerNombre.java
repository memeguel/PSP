package ejercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CFGS
 */

public class EjecutarLeerNombre {
    public static void main(String[] args) throws IOException {
        File directorio = new File("C:\\Users\\CFGS\\Desktop\\NetBeans_Projects\\PSP\\PSP_UT1_ACT04_Miguel\\dist");
        ProcessBuilder pb=new ProcessBuilder("java","-jar","PSP_UT1_ACT04_parte1_Miguel.jar","Miguel");
        pb.directory(directorio);
        Process p=pb.start();
        
        BufferedReader bf=new BufferedReader(new InputStreamReader(p.getInputStream()));
        
        String frase;
        while ((frase=bf.readLine())!=null) {            
            System.out.println(frase);
        }
        try {
            if (p.waitFor()==0) {
                System.out.println("El programa termino correctamente");
            }
            else{
                System.out.println("El programa ha fallado");
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(EjecutarLeerNombre.class.getName()).log(Level.SEVERE, null, ex);
        }
        bf.close();
    } //Fin del main

} //Fin de la clase EjecutarLeerNombre
