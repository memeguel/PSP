package programa2;

import java.io.*;
/**
 *
 * @author CFGS
 */

public class Aplicacion2 {
    public static void main(String[] args) throws Exception {
        String cadena="C:\\Users\\CFGS\\Desktop\\NetBeans_Projects\\PSP\\Programa1\\dist";
		File directorio=new File(cadena);
		
		ProcessBuilder pb = new ProcessBuilder("java","-jar","Programa1.jar");
		
		//Cambiamos el directorio de trabajo
		pb.directory(directorio);
		
		Process p = pb.start();
		InputStream is = p.getInputStream();
		
		int c;
		while((c = is.read()) != -1){
			System.out.print((char)c);
		}
		is.close();
                
                
    } //Fin del main

} //Fin de la clase Aplicacion2
