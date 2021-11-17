package lanzador;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Lanzador {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String cadena = "C:\\Users\\CFGS\\Desktop\\NetBeans_Projects\\PSP\\Sumador\\dist";
        File directorio = new File(cadena);

        String num1;
        String num2;
        System.out.println("Introduzca el primer número:");
        num1=sc.nextLine();
        System.out.println("Introduzca el segundo número:");
        num2=sc.nextLine();
        
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "Sumador.jar",num1,num2);
        pb.directory(directorio);

        Process p = pb.start();
        InputStream is = p.getInputStream();
        
        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }
        

    } //Fin del main

} //Fin de la clase Lanzador
