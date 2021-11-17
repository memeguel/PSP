package act04_leernombre;


/**
 *
 * @author CFGS
 */

public class ACT04_LeerNombre {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error. Se necesita una cadena entre comillas.");
            System.exit(-1);
        }
        System.out.println("Nombre: "+args[0]);
    } //Fin del main

} //Fin de la clase ACT04_LeerNombre
