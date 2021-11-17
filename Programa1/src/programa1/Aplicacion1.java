package programa1;

import java.io.*;
/**
 *
 * @author CFGS
 */

public class Aplicacion1 {
    public static void main(String[] args) throws Exception {
        
	String comando = "DIR "+System.getProperty("user.home")+"\\Desktop";	

        Process p = new ProcessBuilder("cmd.exe","/c",comando).start(); 
        BufferedReader leer = new BufferedReader(new InputStreamReader(p.getInputStream())) ;
        String frase;
        
        while ((frase = leer.readLine()) != null) {
            System.out.println(frase);
        }

        leer.close();
        
        
        // cmd /c: ejecuta el comando y termina
        // cmd /k: ejecuta el comando y vuelve al prompt del cmd
    } //Fin del main

} //Fin de la clase Aplicacion1
