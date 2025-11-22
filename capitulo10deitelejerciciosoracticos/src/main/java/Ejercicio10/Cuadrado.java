package Ejercicio10;

public class Cuadrado extends FiguraBidimensional{
	private double lado;

	//Constructor

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	//Area
	@Override
	public double area() {
		return lado * lado;
	}
	//imprimir
	public void imprimir(){
		System.out.println("Datos Cuadrado");
		System.out.println("Area: "+ area());
	}
}