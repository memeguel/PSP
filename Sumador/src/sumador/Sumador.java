package sumador;

/**
 *
 * @author CFGS
 */
public class Sumador {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Debes introducir 2 numeros como argumentos");
            System.exit(-1);
        }
        //System.out.println("Introduzca el primer número:");
        int num1 = Integer.parseInt(args[0]);
        //System.out.println("Introduzca el segundo número:");
        int num2 = Integer.parseInt(args[1]);

        int cont = 0;
        while (num1 <= num2) {
            cont += num1;
            num1++;
        }
        System.out.println("El resultado es " + cont);
    } //Fin del main

} //Fin de la clase Sumador
