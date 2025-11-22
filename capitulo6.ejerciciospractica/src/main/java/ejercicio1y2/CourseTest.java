package ejercicio1y2;


public class CourseTest {
    public static void main(String[] args) {
        
   /*	 Ejercicio 1 
     */     
          
    //ejercicio2 
   
 
    	course javacourse = new course("Java Básico", 5, 150.0, 30);

        System.out.println("Precio normal: " + javacourse.getPricePerPerson());

        double discountedPrice = javacourse.discountedCostPerPerson(20);
        System.out.println("Precio con 20% de descuento: " + discountedPrice);

        double invalidDiscount = javacourse.discountedCostPerPerson(150);
        System.out.println("Intento con descuento inválido: " + invalidDiscount);
    }
          
  }

