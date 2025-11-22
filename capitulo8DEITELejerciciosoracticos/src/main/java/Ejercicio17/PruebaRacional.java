
package Ejercicio17;
public class PruebaRacional {

	public static void main(String[] args) {
	
		Racional fraccion1 = new Racional(2, 3); 
		Racional fraccion2 = new Racional(3, 4); 

		Racional suma = Racional.sumar(fraccion1, fraccion2);
		System.out.println("Suma: " + suma.aString());

	
		Racional resta = Racional.restar(fraccion1, fraccion2);
		System.out.println("Resta: " + resta.aString()); 

	
		Racional multiplicacion = Racional.multiplicar(fraccion1, fraccion2);
		System.out.println("Multiplicación: " + multiplicacion.aString()); 

	
		Racional division = Racional.dividir(fraccion1, fraccion2);
		System.out.println("División: " + division.aString()); 

		System.out.println("Fracción 1 en flotante: " + fraccion1.aStringFlotante(2)); // 0.67
		System.out.println("Fracción 2 en flotante: " + fraccion2.aStringFlotante(2)); // 0.75

	}

}