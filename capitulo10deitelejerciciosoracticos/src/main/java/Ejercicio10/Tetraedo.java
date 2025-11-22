package Ejercicio10;

public class Tetraedo extends FiguraTridimensional{
	//Atributos
	private double arista;
	private double base;
	private double altura;
	//Constructores

	public Tetraedo(double arista, double base, double altura) {
		this.arista = arista;
		this.base= base;
		this.altura = altura;
	}

	//Metodos
	@Override
	public double area() {
		return Math.sqrt(3)*(arista*arista);
	}
	@Override
	public double volumen(){
		//Primero calcular el area de la base
		double base = (Math.sqrt(3)/4) *(arista*arista);
		return 1/3*base*altura;
	}

	//Metodo para mostrar
	public void imprimir(){
		System.out.println("Datos Tetraedo");
		System.out.println("Area: "+ area());
		System.out.println("Volumen: "+ volumen());

	}
}