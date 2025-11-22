package Ejercicio12;

public class Complejo {
   
    private double parteReal;
    private double parteImaginaria;
    
   
    public Complejo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }
    
 
    public Complejo(double real, double imaginaria) {
        this.parteReal = real;
        this.parteImaginaria = imaginaria;
    }
    
 
    public Complejo sumar(Complejo otro) {
        double sumaReal = this.parteReal + otro.parteReal;
        double sumaImaginaria = this.parteImaginaria + otro.parteImaginaria;
        return new Complejo(sumaReal, sumaImaginaria);
    }
    

    public Complejo restar(Complejo otro) {
        double restaReal = this.parteReal - otro.parteReal;
        double restaImaginaria = this.parteImaginaria - otro.parteImaginaria;
        return new Complejo(restaReal, restaImaginaria);
    }

    public void imprimir() {
        System.out.printf("(%.2f, %.2f)", parteReal, parteImaginaria);
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", parteReal, parteImaginaria);
    }
    
   
    public double getParteReal() {
        return parteReal;
    }
    
    public double getParteImaginaria() {
        return parteImaginaria;
    }
}

