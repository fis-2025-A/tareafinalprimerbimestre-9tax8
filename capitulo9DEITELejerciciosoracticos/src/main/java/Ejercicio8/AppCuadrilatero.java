package Ejercicio8;


public class AppCuadrilatero {

	public static void main(String[] args) {
		int[] x = {0, 0, 4, 4};
		int[] y = {0, 3, 3, 0};

		Trapezoide t = new Trapezoide(x, y, 10, 6, 5);
		Paralelogramo p = new Paralelogramo(x, y, 8, 4);
		Rectangulo r = new Rectangulo(x, y, 6, 3);
		Cuadrado c = new Cuadrado(x, y, 4);

		System.out.printf("Área del trapezoide: ", t.calcularArea());
		System.out.printf("Área del paralelogramo: ", p.area());
		System.out.printf("Área del rectángulo: ", r.area());
		System.out.printf("Área del cuadrado:", c.area());

	}

}