package Ejercicio11;

public class Complejo {
	private double parteReal;
    private double parteImaginaria;


    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }


    public Complejo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

 
    public Complejo sumar(Complejo otro) {
        double nuevaParteReal = this.parteReal + otro.parteReal;
        double nuevaParteImaginaria = this.parteImaginaria + otro.parteImaginaria;
        return new Complejo(nuevaParteReal, nuevaParteImaginaria);
    }

    public Complejo restar(Complejo otro) {
        double nuevaParteReal = this.parteReal - otro.parteReal;
        double nuevaParteImaginaria = this.parteImaginaria - otro.parteImaginaria;
        return new Complejo(nuevaParteReal, nuevaParteImaginaria);
    }

    public void imprimir() {
        System.out.printf("(%f, %f)\n", parteReal, parteImaginaria);
    }
}