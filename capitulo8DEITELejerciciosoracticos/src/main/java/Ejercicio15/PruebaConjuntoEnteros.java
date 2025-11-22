package Ejercicio15;

public class PruebaConjuntoEnteros {
    public static void main(String[] args) {
    
    	ConjuntoEnteros conjuntoA = new ConjuntoEnteros();
        ConjuntoEnteros conjuntoB = new ConjuntoEnteros();

       
        System.out.println("Llenando Conjunto A...");
        conjuntoA.insertarElemento(10);
        conjuntoA.insertarElemento(20);
        conjuntoA.insertarElemento(30);
        
       
        System.out.println("Llenando Conjunto B...");
        conjuntoB.insertarElemento(30); 
        conjuntoB.insertarElemento(40);
        conjuntoB.insertarElemento(50);
        conjuntoB.insertarElemento(105); 

        System.out.println("\nConjunto A: " + conjuntoA.aStringConjunto());
        System.out.println("Conjunto B: " + conjuntoB.aStringConjunto());

        ConjuntoEnteros union = conjuntoA.union(conjuntoB);
        System.out.println("\nUnión (A U B): " + union.aStringConjunto());

    
        ConjuntoEnteros interseccion = conjuntoA.interseccion(conjuntoB);
        System.out.println("Intersección (A n B): " + interseccion.aStringConjunto());


        System.out.println("\n¿A es igual a B? " + conjuntoA.esIgualA(conjuntoB));
        
        ConjuntoEnteros conjuntoC = new ConjuntoEnteros();
        conjuntoC.insertarElemento(10);
        conjuntoC.insertarElemento(20);
        conjuntoC.insertarElemento(30);
        System.out.println("¿A es igual a C (copia de A)? " + conjuntoA.esIgualA(conjuntoC));


        System.out.println("\nEliminando el 20 del Conjunto A...");
        conjuntoA.eliminarElemento(20);
        System.out.println("Conjunto A actualizado: " + conjuntoA.aStringConjunto());
        
     
        ConjuntoEnteros vacio = new ConjuntoEnteros();
        System.out.println("Conjunto Vacío: " + vacio.aStringConjunto());
    }
 
   }
