package Ejercicio3;
import java.awt.Point;

public class CircleDemo {
	 public static void main(String[] args) {
	        

	        Point center = new Point (10, 20);
	        Circle myCircle = new Circle(center, 5); 
	        
	        System.out.println("Círculo creado en: " + myCircle.getLocation());
	        
	    
	        System.out.println("Radio inicial (usando getDimension): " + myCircle.getDimension()); // Imprime: 5

	      
	        System.out.println("\nEstableciendo nuevo radio a 8...");
	        int[] newRadius = { 8 };
	        
	    
	        myCircle.setDimensions(newRadius); 
	        
	    
	        System.out.println("Nuevo radio (usando getDimension): " + myCircle.getDimension()); // Imprime: 8
	        
	
	        System.out.println("\nIntentando establecer dimensiones con un array de 2 elementos...");
	        int[] badArray = { 20, 30 };
	        myCircle.setDimensions(badArray);
	        
	  
	        System.out.println("Radio después del intento fallido (debe ser 8): " + myCircle.getDimension()); // Imprime: 8
	    }
}
