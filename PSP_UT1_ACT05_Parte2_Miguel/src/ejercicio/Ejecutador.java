package ejercicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author CFGS
 */
public class Ejecutador {

    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = new ProcessBuilder("java", "-jar",
                "C:\\Users\\CFGS\\Desktop\\NetBeans_Projects\\PSP\\PSP_UT1_ACT05_Parte1_Miguel"
                + "\\dist\\PSP_UT1_ACT05_Parte1_Miguel.jar").start();
        int valorSalida = p.waitFor();

        switch (valorSalida) {
            case 0:
                System.out.println(">> Soy el Prog1: Argumento es un Nº >= 0 o se ha mandado más de un argumento");
                break;
            case 1:
                System.out.println(">> Soy el Prog1: No se han enviado argumentos al Programa 2");
                break;
            case 2:
                System.out.println(">> Soy el Prog1: Se ha pasado una cadena");
                break;
            case 3:
                System.out.println(">> Soy el Prog1: Se ha pasado un número menor que 0");
                break;
            default:
                System.out.println(">> Soy el Prog1: Otro valor de salida");
        }
    } //Fin del main

} //Fin de la clase Ejecutador
