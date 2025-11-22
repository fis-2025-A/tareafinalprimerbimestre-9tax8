package Ejercicio14;

public class PruebaRectangulo {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA RECTÁNGULO SOFISTICADO ===");
        
     
        System.out.println("\n--- Prueba 1: Rectángulo por defecto ---");
        Rectangulo rect1 = new Rectangulo();
        System.out.println(rect1);
        mostrarInformacionRectangulo(rect1);
        
      
        System.out.println("\n--- Prueba 2: Rectángulo cuadrado ---");
        Rectangulo rect2 = new Rectangulo(2.0, 2.0, 5.0, 5.0);
        System.out.println(rect2);
        mostrarInformacionRectangulo(rect2);
    
        System.out.println("\n--- Prueba 3: Rectángulo rectangular ---");
        Rectangulo rect3 = new Rectangulo(1.0, 1.0, 6.0, 4.0);
        System.out.println(rect3);
        mostrarInformacionRectangulo(rect3);
  
        System.out.println("\n--- Prueba 4: Cambio de coordenadas ---");
        Rectangulo rect4 = new Rectangulo(3.0, 3.0, 8.0, 6.0);
        System.out.println("Antes del cambio: " + rect4);
        rect4.establecerCoordenadas(2.0, 2.0, 7.0, 5.0);
        System.out.println("Después del cambio: " + rect4);
        mostrarInformacionRectangulo(rect4);
        
     
        System.out.println("\n--- Prueba 5: Coordenadas inválidas ---");
        try {
            Rectangulo rect5 = new Rectangulo(1.0, 1.0, 25.0, 5.0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
        
        try {
            Rectangulo rect6 = new Rectangulo(5.0, 5.0, 3.0, 8.0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
        
        try {
            Rectangulo rect7 = new Rectangulo(-1.0, 2.0, 5.0, 6.0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
        
    
        System.out.println("\n--- Prueba 6: Comparación de rectángulos ---");
        Rectangulo[] rectangulos = {
            new Rectangulo(0.0, 0.0, 4.0, 4.0),   
            new Rectangulo(1.0, 1.0, 5.0, 3.0),   
            new Rectangulo(2.0, 2.0, 6.0, 6.0),   
            new Rectangulo(3.0, 1.0, 8.0, 4.0)    
        };
        
        for (int i = 0; i < rectangulos.length; i++) {
            System.out.println("\nRectángulo " + (i + 1) + ": " + rectangulos[i]);
            mostrarInformacionRectangulo(rectangulos[i]);
        }
    }
    
 
    private static void mostrarInformacionRectangulo(Rectangulo rect) {
        System.out.printf("Longitud: %.2f%n", rect.calcularLongitud());
        System.out.printf("Anchura: %.2f%n", rect.calcularAnchura());
        System.out.printf("Perímetro: %.2f%n", rect.calcularPerimetro());
        System.out.printf("Área: %.2f%n", rect.calcularArea());
        System.out.printf("¿Es cuadrado? %s%n", rect.esCuadrado() ? "Sí" : "No");
    }
}