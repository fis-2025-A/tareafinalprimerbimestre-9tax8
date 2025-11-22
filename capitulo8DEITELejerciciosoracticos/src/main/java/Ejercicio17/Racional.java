package Ejercicio17;

public class Racional {
	private int numerador;
	private int denominador;

	
	public Racional() {
		this.numerador = 1;
		this.denominador = 2;
		reducir();
	}

	
	public Racional(int numerador, int denominador) {
		if (denominador == 0) {
			throw new IllegalArgumentException("El denominador no puede ser cero.");
		}
		this.numerador = numerador;
		this.denominador = denominador;
		reducir();
	}

	private void reducir() {
		int mcd = mcd(numerador, denominador);
		numerador /= mcd;
		denominador /= mcd;

	
		if (denominador < 0) {
			numerador = -numerador;
			denominador = -denominador;
		}
	}

	private int mcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}


	public static Racional sumar(Racional r1, Racional r2) {
		int numeradorResultado = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
		int denominadorResultado = r1.denominador * r2.denominador;
		Racional resultado = new Racional(numeradorResultado, denominadorResultado);
		return resultado;
	}


	public static Racional restar(Racional r1, Racional r2) {
		int numeradorResultado = r1.numerador * r2.denominador - r2.numerador * r1.denominador;
		int denominadorResultado = r1.denominador * r2.denominador;
		Racional resultado = new Racional(numeradorResultado, denominadorResultado);
		return resultado;
	}


	public static Racional multiplicar(Racional r1, Racional r2) {
		int numeradorResultado = r1.numerador * r2.numerador;
		int denominadorResultado = r1.denominador * r2.denominador;
		Racional resultado = new Racional(numeradorResultado, denominadorResultado);
		return resultado;
	}


	public static Racional dividir(Racional r1, Racional r2) {
		if (r2.numerador == 0) {
			throw new IllegalArgumentException("No se puede dividir por una fracción con numerador 0.");
		}
		int numeradorResultado = r1.numerador * r2.denominador;
		int denominadorResultado = r1.denominador * r2.numerador;
		Racional resultado = new Racional(numeradorResultado, denominadorResultado);
		return resultado;
	}

	
	public String aString() {
		return numerador + "/" + denominador;
	}


	public String aStringFlotante(int precision) {
		double resultado = (double) numerador / denominador;
		return String.format("%." + precision + "f", resultado);
	}
}