package Ejercicio12;

public abstract class TrabajadorPorPiezas extends Empleado{
	private double sueldo; // sueldo por pieza
	private int piezas;    // número de piezas producidas

	// Constructor
	public TrabajadorPorPiezas(String nombre, String apellido, String nss, double sueldoPorPieza, int cantidadPiezas) {
		super(nombre, apellido, nss);
		establecerSueldo(sueldoPorPieza);
		establecerPiezas(cantidadPiezas);
	}

	// Establece el sueldo por pieza
	public void establecerSueldo(double sueldoPorPieza) {
		sueldo = (sueldoPorPieza < 0.0) ? 0.0 : sueldoPorPieza;
	}

	// Obtiene el sueldo por pieza
	public double obtenerSueldo() {
		return sueldo;
	}

	// Establece la cantidad de piezas
	public void establecerPiezas(int cantidadPiezas) {
		piezas = (cantidadPiezas < 0) ? 0 : cantidadPiezas;
	}

	// Obtiene la cantidad de piezas
	public int obtenerPiezas() {
		return piezas;
	}

	// Calcula los ingresos
	@Override
	public double ingresos() {
		return obtenerSueldo() * obtenerPiezas();
	}

	// Representación en cadena
	@Override
	public String toString() {
		return String.format("trabajador por piezas: %s\n%s: $%,.2f; %s: %d",
				super.toString(), "sueldo por pieza", obtenerSueldo(),
				"piezas producidas", obtenerPiezas());
	}
}