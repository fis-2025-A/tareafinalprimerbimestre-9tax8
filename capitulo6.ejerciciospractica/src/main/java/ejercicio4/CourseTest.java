package ejercicio4;

// porque ambas clases están en el paquete 'ejercicio4'.

public class CourseTest {

	 public static void main(String[] args) {
	           	          
		    System.out.println("--- Pruebas Ejercicio 2 (Descuentos) ---");
		    course javacourse = new course("Java Básico", 5, 150.0, 30);

	        System.out.println("Precio normal: " + javacourse.getPricePerPerson());

	        double discountedPrice = javacourse.discountedCostPerPerson(20);
	        System.out.println("Precio con 20% de descuento: " + discountedPrice);

	        double invalidDiscount = javacourse.discountedCostPerPerson(150);
	        System.out.println("Intento con descuento inválido: " + invalidDiscount);
	        
	        System.out.println("\n--- Pruebas Nuevos Requisitos ---");
	        
	  
	        System.out.println("Nombre de la compañía: " + course.TRAINING_COMPANY_NAME);
	        
	      
	        double tarifaPlana = 3000.0;
	        int numParticipantes = 25;
	        
	   
	        double costePorPersona = course.calculateCustomCostPerHead(tarifaPlana, numParticipantes);
	        
	        System.out.println("Para un curso con tarifa plana de " + tarifaPlana + 
	                           " y " + numParticipantes + " participantes:");
	        System.out.println("El coste por persona es: " + costePorPersona);
	        
	   
	        System.out.println("\nPrueba con 0 participantes:");
	        double costeInvalido = course.calculateCustomCostPerHead(1000.0, 0);
	        System.out.println("Coste retornado: " + costeInvalido);
	    }
}