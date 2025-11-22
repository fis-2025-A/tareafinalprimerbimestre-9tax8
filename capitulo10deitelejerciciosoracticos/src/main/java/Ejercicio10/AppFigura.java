package Ejercicio10;

public class AppFigura {
	public static void main(String args[]) {
		
		Circulo c = new Circulo(3);
		Cuadrado Cu = new Cuadrado(5);
		Triangulo T = new Triangulo(4, 5);
		Esfera E = new Esfera(4);
		Cubo Cubo = new Cubo(5);
		Tetraedo Te = new Tetraedo(4, 7, 5);

		Figura []figuras= new Figura[6];
		figuras[0] = c;
		figuras[1] = Cu;
		figuras[2] = T;
		figuras[3] = E;
		figuras[4] = Cubo;
		figuras[5] = Te;

		c.area();
		c.imprimir();

		Cu.area();
		Cu.imprimir();
		T.area();
		T.imprimir();

		E.volumen();
		E.area();
		E.imprimir();

		Cubo.area();
		Cubo.volumen();
		Cubo.imprimir();

		Te.area();
		Te.volumen();
		Te.imprimir();


	}
}