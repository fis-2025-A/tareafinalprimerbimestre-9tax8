package Ejercicio15;

public class ConjuntoEnteros {
    private boolean [] conjunto;
    

    public ConjuntoEnteros() { 
        this.conjunto = new boolean[101];
    } 


    public void insertarElemento(int k) {
    	if (k>=0 && k<=100) {
    		conjunto [k]=true;
    	}else{
    		System.out.println("El número " + k + " está fuera de rango (0-100).");
        }	
    }

    public void eliminarElemento(int m) {
    	if (m>=0 && m<=100) {
    		conjunto [m]=false;
    	}else{ 
    		System.out.println("El número " + m + " está fuera de rango (0-100).");
    	}
       }
    
 
    public ConjuntoEnteros union(ConjuntoEnteros otroConjunto) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();

        for (int i = 0; i <= 100; i++) {
           
            if (this.conjunto[i] == true || otroConjunto.conjunto[i] == true) {
                resultado.insertarElemento(i);
            }
        }
        return resultado;
    }

 
    public ConjuntoEnteros interseccion(ConjuntoEnteros otroConjunto) {
        ConjuntoEnteros resultado = new ConjuntoEnteros();

        for (int i = 0; i <= 100; i++) {
         
            if (this.conjunto[i] == true && otroConjunto.conjunto[i] == true) {
                resultado.insertarElemento(i);
            }
        }
        return resultado;
    }

 
    public boolean esIgualA(ConjuntoEnteros otroConjunto) {
        for (int i = 0; i <= 100; i++) {
          
            if (this.conjunto[i] != otroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true; 
    }

   
    public String aStringConjunto() {
        StringBuilder sb = new StringBuilder();
        boolean estaVacio = true; 

        for (int i = 0; i <= 100; i++) {
            if (conjunto[i] == true) {
                sb.append(i).append(" "); 
                estaVacio = false; 
            }
        }
        if (estaVacio) {
            return "---"; 
        }
        return sb.toString();
    }
}
    


