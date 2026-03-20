
package Tarea4;

public class Tarea4 {

    public static void main(String[] args) {
        
        System.out.println("60mph son " + Utilidades.kmhAms(Utilidades.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Utilidades.hipotenusa(3, 4) + "cm");
    }

}
