package act04_ejecutarleernombre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author CFGS
 */

public class ACT04_EjecutarLeerNombre {
    public static void main(String[] args) throws InterruptedException, IOException {
        Process p=new ProcessBuilder("java","-jar","C:\\Users\\CFGS\\Desktop\\NetBeans_Projects\\PSP\\ACT04_LeerNombre\\dist\\ACT04_LeerNombre.jar","Miguel Ángel Martín Szelest").start();
        System.out.println("Salida del sumador: "+p.waitFor());
        
        InputStreamReader isr=new InputStreamReader(p.getInputStream(),"Windows-1252");
        BufferedReader br=new BufferedReader(isr);
        
        String linea;
        while((linea=br.readLine())!=null){
            System.out.println(linea);
        }
        isr.close();
        br.close();
    } //Fin del main

} //Fin de la clase ACT04_EjecutarLeerNombre
