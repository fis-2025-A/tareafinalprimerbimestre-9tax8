package Ejercicio8;

public class PruebaFecha {
	public static void main(String[] args) {
	
        Fecha fecha = new Fecha(12, 31, 2022);
        
   
        System.out.println("Fecha inicial: " + fecha);
        System.out.println("\nAvanzando un día:");
        fecha.siguienteDia();
        System.out.println("Fecha después de un día: " + fecha);
        
        for (int i = 0; i < 10; i++) {
            fecha.siguienteDia();
            System.out.println("Fecha después de " + (i+2) + " días: " + fecha);
        }

	}
}
