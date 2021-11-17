package sumador2;


/**
 *
 * @author CFGS
 */

public class Sumador2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Debes introducir 2 numeros como argumentos");
            System.exit(-1);
        }else{
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            System.out.printf("La suma de %d + %d es: %d%n",num1,num2,num1+num2);
        }
    } //Fin del main

} //Fin de la clase Sumador2
