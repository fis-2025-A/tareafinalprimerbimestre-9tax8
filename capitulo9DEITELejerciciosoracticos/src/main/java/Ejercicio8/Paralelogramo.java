package Ejercicio8;
public class Paralelogramo extends Cuadrilatero{
	//Atributos
    private int base;
    private int altura;
    //Constructor

    public Paralelogramo(int[] x, int[] y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;

    }
    //Getters y setters

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    //Metodo para calcular el area
    public int area(){
        return base* altura;
    }
}