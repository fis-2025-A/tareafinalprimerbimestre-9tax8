package Ejercicio10;

public class Triangulo extends FiguraBidimensional{
	private double base;
	private double altura;

	//Constructor
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return (base * altura) / 2;
	}

	public void imprimir(){
		System.out.println("Datos Triangulo");
		System.out.println("Area: "+ area());
	}
}