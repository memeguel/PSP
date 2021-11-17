package ejercicio;


/**
 *
 * @author CFGS
 */

public class LeerNombre {
    public static void main(String[] args) {
        if (args.length!=1) {
            System.out.println("Solo se puede inroducir un nombre");
            System.exit(-1);
        }else{
            System.out.println("El nombre es: "+args[0].toUpperCase());
            System.exit(0); //No hace falta
        }
    } //Fin del main

} //Fin de la clase LeerNombre
