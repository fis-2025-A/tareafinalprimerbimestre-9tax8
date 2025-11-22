package Ejercicio11;

public class PruebaComplejo {

	public static void main(String[] args) {
		
        Complejo numero1 = new Complejo(3.0, 2.0); 
        Complejo numero2 = new Complejo(1.0, 4.0); 

   
        System.out.print("Número 1: ");
        numero1.imprimir();
        System.out.print("Número 2: ");
        numero2.imprimir();

        Complejo resultadoSuma = numero1.sumar(numero2);
        System.out.print("Resultado de la suma: ");
        resultadoSuma.imprimir();

        Complejo resultadoResta = numero1.restar(numero2);
        System.out.print("Resultado de la resta: ");
        resultadoResta.imprimir();
	}

}