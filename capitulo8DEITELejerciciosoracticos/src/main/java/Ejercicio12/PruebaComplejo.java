package Ejercicio12;

public class PruebaComplejo {
    public static void main(String[] args) {
        System.out.println("=== OPERACIONES CON NÚMEROS COMPLEJOS ===");
        
        
        Complejo c1 = new Complejo(); 
        Complejo c2 = new Complejo(3.5, 2.8); 
        Complejo c3 = new Complejo(1.2, -4.7); 
        Complejo c4 = new Complejo(-2.3, 5.1); 
        
        System.out.println("\n--- Números complejos creados ---");
        System.out.print("c1 (constructor sin argumentos): ");
        c1.imprimir();
        System.out.print("\nc2 (3.5, 2.8): ");
        c2.imprimir();
        System.out.print("\nc3 (1.2, -4.7): ");
        c3.imprimir();
        System.out.print("\nc4 (-2.3, 5.1): ");
        c4.imprimir();
        
     
        System.out.println("\n\n--- OPERACIONES DE SUMA ---");
        System.out.print("c2 + c3 = ");
        Complejo suma1 = c2.sumar(c3);
        suma1.imprimir();
        System.out.printf(" = %.2f + %.2fi", suma1.getParteReal(), suma1.getParteImaginaria());
        
        System.out.print("\nc3 + c4 = ");
        Complejo suma2 = c3.sumar(c4);
        suma2.imprimir();
        System.out.printf(" = %.2f + %.2fi", suma2.getParteReal(), suma2.getParteImaginaria());

        System.out.println("\n\n--- OPERACIONES DE RESTA ---");
        System.out.print("c2 - c3 = ");
        Complejo resta1 = c2.restar(c3);
        resta1.imprimir();
        System.out.printf(" = %.2f + %.2fi", resta1.getParteReal(), resta1.getParteImaginaria());
        
        System.out.print("\nc3 - c4 = ");
        Complejo resta2 = c3.restar(c4);
        resta2.imprimir();
        System.out.printf(" = %.2f + %.2fi", resta2.getParteReal(), resta2.getParteImaginaria());
        
        System.out.print("\nc4 - c2 = ");
        Complejo resta3 = c4.restar(c2);
        resta3.imprimir();
        System.out.printf(" = %.2f + %.2fi", resta3.getParteReal(), resta3.getParteImaginaria());
        
   
        System.out.println("\n\n--- OPERACIONES COMBINADAS ---");
        System.out.print("(c2 + c3) - c4 = ");
        Complejo combinado = c2.sumar(c3).restar(c4);
        combinado.imprimir();
        
     
        System.out.print("\n\nc1 (cero) + c2 = ");
        Complejo sumaConCero = c1.sumar(c2);
        sumaConCero.imprimir();
        
        System.out.print("\nc2 - c1 (cero) = ");
        Complejo restaConCero = c2.restar(c1);
        restaConCero.imprimir();
   
        System.out.println("\n\n--- FORMATOS DE IMPRESIÓN ---");
        System.out.println("Usando imprimir():");
        System.out.print("c2 = "); c2.imprimir();
        System.out.print("\nc3 = "); c3.imprimir();
        
        System.out.println("\n\nUsando toString():");
        System.out.println("c2 = " + c2.toString());
        System.out.println("c3 = " + c3.toString());
        System.out.println("Suma c2 + c3 = " + c2.sumar(c3).toString());
    }
}