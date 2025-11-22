package Ejercicio4;


public class PruebaRectangulo {
    public static void main(String[] args) {
        
    	Rectangulo rect1 = new Rectangulo();
        System.out.println("Rectángulo 1 (valores por defecto):");
        System.out.println("Longitud: " + rect1.getLongitud());
        System.out.println("Anchura: " + rect1.getAnchura());
        System.out.println("Perímetro: " + rect1.calcularPerimetro());
        System.out.println("Área: " + rect1.calcularArea());
        System.out.println();
        
      
        Rectangulo rect2 = new Rectangulo(5.5, 3.2);
        System.out.println("Rectángulo 2 (5.5 x 3.2):");
        System.out.println("Longitud: " + rect2.getLongitud());
        System.out.println("Anchura: " + rect2.getAnchura());
        System.out.println("Perímetro: " + rect2.calcularPerimetro());
        System.out.println("Área: " + rect2.calcularArea());
        System.out.println();
        
      
        rect2.setLongitud(8.7);
        rect2.setAnchura(4.3);
        System.out.println("Rectángulo 2 después de modificar (8.7 x 4.3):");
        System.out.println("Perímetro: " + rect2.calcularPerimetro());
        System.out.println("Área: " + rect2.calcularArea());
        System.out.println();
        
      
        System.out.println("Probando valores inválidos:");
        rect2.setLongitud(25.0);  
        rect2.setLongitud(-2.0);  
        rect2.setAnchura(0.0);    
        rect2.setAnchura(20.0);   
    }
             
 }

