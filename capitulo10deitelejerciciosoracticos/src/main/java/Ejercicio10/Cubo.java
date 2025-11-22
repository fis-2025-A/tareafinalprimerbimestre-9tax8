package Ejercicio10;

public class Cubo extends FiguraTridimensional{
	//Atributos
	private double longitudLado;

	//Cosntructor

	public Cubo(double longitudLado) {
		this.longitudLado = longitudLado;
	}

	@Override
	public double area() {
		return 6*(longitudLado*longitudLado);
	}
	@Override
	public double volumen(){
		return (longitudLado*longitudLado*longitudLado);
	}

	//Metodo para mostrar
	public void imprimir(){
		System.out.println("Datos Cubo");
		System.out.println("Area: "+ area());
		System.out.println("Volumen: "+ volumen());

	}
}