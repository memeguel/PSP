package ejercicio;


/**
 *
 * @author CFGS
 */

public class RecibirArgumentos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Programa 2: main requiere argumentos");
            System.exit(1);
        } else if (args.length == 1) {
            if (comprobarDato(args[0]) == false) {
                System.out.println("Programa 2: el argumento " + args[0] + " es una cadena");
                System.exit(2);
            } else if (Integer.parseInt(args[0]) < 0) {
                System.out.println("Programa 2: el argumento es un número negativo");
                System.exit(3);
            } else {
                System.out.println("Programa 2: el argumento es nº 0 o positivo");
                System.exit(0);
            }
        }
        else{
            System.out.println("Programa 2: el número de argumentos es mayor que 1");
            System.exit(0);
        }
    } //Fin del main

    private static boolean comprobarDato(String arg) {
        try {
            Integer.parseInt(arg);

        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

//else {
//            for (int i = 0; i < args.length; i++) {
//                if (comprobarDato(args[i]) == false) {
//                    System.out.println("Programa 2: el argumento "+args[i]+" es una cadena");
//                    System.exit(2);
//                } else if (Integer.parseInt(args[i]) < 0) {
//                    System.out.println("Programa 2: el argumento es un número negativo");
//                    System.exit(3);
//                } else {
//                    System.out.println("Programa 2: el argumento es nº 0 o positivo");
//                    System.exit(0);
//                }
//            }
//        }
} //Fin de la clase RecibirArgumentos