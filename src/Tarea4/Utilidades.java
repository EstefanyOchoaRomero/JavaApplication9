
package Tarea4;

/**
 * Esta clase hace diferentes calculos utiles en el día a día.
 * @author Estefany Ochoa Romero
 * @version 1.0
 * @since 2026-03-20
 */

public class Utilidades {

/**
 * Calcula si un año es bisiesto en un año especifico.
 * @param anio el aslo que se va calcular
 * @return {@code true} si el año es bisiesto, {@code false} en caso contrario.
 */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    
/**
 * Convierte una velocidad de kilómetros por hora a metros por segundo.
 * @param kmh velocidad en Km a metros por segundo
 * @return Veclocidad equivalente en m/s
 */

    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }
    
    /**
     * Convierte una velocidad de kilómetros por hora a metros por segundo.
     * @param grados Valor del angulo en grados.
     * @return El àngul convertido en radianes.
     */

    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }
    
    /**
     * Convierte un ángulo en formato sexagesinal a radianes 
     * @param grados Grados enteros.
     * @param minutos Minutos de arco.
     * @param segundos Segundo de arco.
     * @return El ángulo total convertido a radianes.
     */

    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }
    
    /**
     * Conviert una temperatura de grados Celsicus a Fahrenheit
     * @param celsius Temperatura en grados Celsius.
     * @return Temperatura equivalente en grados Fahrenheit.
     */

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    /**
     * Convierte una temperatura de gradoS Fahrenheit a Celsisus.
     * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Temperatura equivalente en grados Celsius.
     */

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    /**
     * Calcula la longitud de una circuferencia dado su radio.
     * @param radio Radio del circulo.
     * @return El área calculada (PI * r²)
     */

    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }
    
    /**
     * Calcula la longuitud de una circunferencia dado su radio.
     * @param radio Radio de la circunferencia
     * @return La longitud calculada (2 * PI * r)
     */

    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
    
    /**
     * Calcula la potencia al cuadrado de un número.
     * @param num El número base.
     * @return El número elevado a la potencia 2.
     */

    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }
    
    /**
     * Calcula la hipotenusa de un triángulo rectángulo mediante el teorema de Pitágoras.
     * @param cateto1 Longitud del primer cateto.
     * @param cateto2 Longitud del segundo cateto.
     * @return La longitud de la hipotenusa resultante.
     */

    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }
    
    /**
     * Calcula la longitud de un cateto faltante conocidos la hipotenusa y el otro cateto.
     * @param hipotenusa Longitud de la hipotenusa.
     * @param cateto Longitud del cateto conocido.
     * @return La longitud del cateto desconocido.
     */

    public static double catetoA(double hipotenusa, double cateto) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto));
    }
    
    /**
     * Convierte una velocidad de millas por hora a kilómetros por hora.
     * @param mph Velocidad en millas por hora.
     * @return Velocidad equivalente en km/h.
     */

    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }
    
    /**
     * Convierte una velocidad de kilómetros por hora a millas por hora.
     * @param kmh Velocidad en kilómetros por hora.
     * @return Velocidad equivalente en mph.
     */

    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }

}
