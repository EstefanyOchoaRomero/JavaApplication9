
package Tarea4;

public class Tarea4 {

    public static void main(String[] args) {
        System.out.println("Febrero de 2026 tiene " + Utilidades.diasEnMesArray(2, 2026) + " días");
        System.out.println("60mph son " + Utilidades.kmhAms(Utilidades.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Utilidades.hip(3, 4) + "cm");
    }

}
