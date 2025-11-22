package com.foundjava.chapter6;

public class example5 {

	public static void main(String[] args) {

        // Genera un número aleatorio (entre 0.0 y 1.0)
        double value = Math.random();

        // Convierte el número aleatorio a String
        String aString = String.valueOf(value);

        // Otro número double
        double realNumber = 3.1417;

        // Convertir double a String
        String doubleString = String.valueOf(realNumber);

        // Imprimir resultados
        System.out.println("Número aleatorio: " + value);
        System.out.println("Número aleatorio (String): " + aString);

        System.out.println("Número real: " + realNumber);
        System.out.println("Número real (String): " + doubleString);

        // Ejemplo de impresión directa (Java lo convierte a String automáticamente)
        System.out.println(3.1417); 
    }
}
