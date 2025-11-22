package Ejercicio10;

public class Circulo extends FiguraBidimensional{
	private double radio;
	//Constructor

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * (radio * radio);
	}

	public void imprimir(){
		System.out.println("Datos Circulo");
		System.out.println("Area: "+ area());
	}
}
