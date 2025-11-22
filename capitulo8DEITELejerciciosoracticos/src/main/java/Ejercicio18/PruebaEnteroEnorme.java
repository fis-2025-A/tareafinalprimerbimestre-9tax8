package Ejercicio18;

public class PruebaEnteroEnorme {

	public static void main(String[] args) {
		EnteroEnorme numero1 = new EnteroEnorme();
        numero1.parse("12345678901234567890123456789012345678");

        EnteroEnorme numero2 = new EnteroEnorme();
        numero2.parse("98765432109876543210987654321098765432");

        System.out.println("Número 1: " + numero1.toString());
        System.out.println("Número 2: " + numero2.toString());

        EnteroEnorme suma = numero1.sumar(numero2);
        System.out.println("Suma: " + suma.toString());

        EnteroEnorme resta = numero1.restar(numero2);
        System.out.println("Resta: " + resta.toString());

        System.out.println("¿Número 1 es igual a Número 2? " + numero1.esIgualA(numero2));
        System.out.println("¿Número 1 es mayor que Número 2? " + numero1.esMayorQue(numero2));
	}

}