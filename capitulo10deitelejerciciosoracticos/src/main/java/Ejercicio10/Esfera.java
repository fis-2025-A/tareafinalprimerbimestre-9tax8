package Ejercicio10;

public class Esfera extends FiguraTridimensional{
	//Atributos
	private double radio;
	//Constructor


	public Esfera(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return 4* Math.PI *(radio *radio);
	}
	@Override
	public double volumen(){
		return (4/3)* Math.PI*(radio*radio*radio);
	}

	//Metodo para mostrar
	public void imprimir(){
		System.out.println("Datos Esfera");
		System.out.println("Area: "+ area());
		System.out.println("Volumen: "+ volumen());

	}
}