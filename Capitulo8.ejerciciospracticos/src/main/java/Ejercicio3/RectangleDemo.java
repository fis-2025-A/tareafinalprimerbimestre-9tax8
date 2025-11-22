package Ejercicio3;
import java.awt.Point;


	public class RectangleDemo {
		public static void main(String[] args) {

        System.out.println("\n--- Creando Rectángulo ---");
        Point corner = new Point(30, 40);
        Rectangle myRect = new Rectangle(corner, 100, 50); 
        
        System.out.println("Clase: " + myRect.getClass().getSimpleName());
        System.out.println("Ubicación: " + myRect.getLocation());
        System.out.println("Alto inicial (getHeight): " + myRect.getHeight());
        System.out.println("Ancho inicial (getWidth): " + myRect.getWidth());
        
        // Usar setDimensions
        System.out.println("Cambiando dimensiones a 120x60...");
        int[] newDimensions = { 120, 60 };
        myRect.setDimensions(newDimensions);
        System.out.println("Nuevo alto (getHeight): " + myRect.getHeight());
        System.out.println("Nuevo ancho (getWidth): " + myRect.getWidth());
        
        System.out.println("\n--- PRUEBA COMPLETA ---");
    }
}
