package Ejercicio8;
public class Cuadrilatero {
	//Atributos
    //Pares de coordenadas x-y para los cuatro puntos fi nales del Cuadrilatero
    private int [] x = new int[4];
    private int [] y = new int[4];
    //Generar el constructor

    public Cuadrilatero(int[] x, int [] y) {
        this.x = x;
        this.y = y;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }
}