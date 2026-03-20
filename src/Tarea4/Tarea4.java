
package Tarea4;

/**
 * Esta clase hace diferentes calculos utiles en el día a día.
 * @author Estefany Ochoa Romero
 * @version 1.0
 * @since 2026-03-20
 */

public class Tarea4 {
    
    /**
     * Punto de entrada principal del programa. 
     * Realiza llamadas a los métodos de la clase.
     * * @param args Argumentos de la línea de comandos.
     */

    public static void main(String[] args) {
        
        System.out.println("60mph son " + Utilidades.kmhAms(Utilidades.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Utilidades.hipotenusa(3, 4) + "cm");
    }

}
