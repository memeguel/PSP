package lanzador2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 *
 * @author CFGS
 */
//C:\Users\CFGS\Desktop\NetBeans_Projects\PSP\Sumador2\dist\Sumador2.jar
public class Lanzador2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p=new ProcessBuilder("java","-jar","C:\\Users\\CFGS\\Desktop\\NetBeans_Projects\\PSP\\ACT03_Sumador\\dist\\ACT03_Sumador.jar","5","10").start();
        System.out.println("Salida del sumador: "+p.waitFor());
        
        //Sin buffer
//        InputStream is=p.getInputStream();
//        int c;
//        while((c=is.read())!=-1){
//            System.out.print((char)c);
//        }
//        System.out.println("");

        InputStreamReader isr=new InputStreamReader(p.getInputStream(),"Windows-1252");
        BufferedReader br=new BufferedReader(isr);
        
        String linea;
        while((linea=br.readLine())!=null){
            System.out.println(linea);
        }
        isr.close();
        br.close();
    } //Fin del main

} //Fin de la clase Lanzador2
