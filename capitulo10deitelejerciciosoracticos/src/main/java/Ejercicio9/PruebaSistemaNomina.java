package Ejercicio9;

import java.util.Calendar;

public class PruebaSistemaNomina {

	public static void main(String[] args) {
		// crea objetos de las subclases
		EmpleadoAsalariado empleadoAsalariado =
				new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00, new Fecha(15, 5, 1990));
		EmpleadoPorHoras empleadoPorHoras =
				new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40, new Fecha(6, 6, 1985));
		EmpleadoPorComision empleadoPorComision =
				new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06, new Fecha(20, 7, 1988));
		EmpleadoBaseMasComision empleadoBaseMasComision =
				new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Fecha(5, 4, 1986));

		System.out.println("Empleados procesados por separado:\n");

		System.out.printf("%s\n%s: $%,.2f\n\n",
				empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
		System.out.printf("%s\n%s: $%,.2f\n\n",
				empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
		System.out.printf("%s\n%s: $%,.2f\n\n",
				empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
		System.out.printf("%s\n%s: $%,.2f\n\n",
				empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());

		// crea un arreglo Empleado de cuatro elementos
		Empleado empleados[] = new Empleado[4];

		// inicializa el arreglo con objetos Empleado
		empleados[0] = empleadoAsalariado;
		empleados[1] = empleadoPorHoras;
		empleados[2] = empleadoPorComision;
		empleados[3] = empleadoBaseMasComision;

		System.out.println("Empleados procesados en forma polimorfica:\n");

		// procesa en forma genérica a cada elemento en el arreglo de empleados
		for (Empleado empleadoActual : empleados) {
			System.out.println(empleadoActual); // invoca a toString

			// determina si el elemento es un EmpleadoBaseMasComision
			if (empleadoActual instanceof EmpleadoBaseMasComision) {
				// conversión descendente de la referencia de Empleado
				// a una referencia de EmpleadoBaseMasComision
				EmpleadoBaseMasComision empleado =
						(EmpleadoBaseMasComision) empleadoActual;

				double salarioBaseAnterior = empleado.obtenerSalarioBase();
				empleado.establecerSalarioBase(1.10 * salarioBaseAnterior);
				System.out.printf("el nuevo salario base con 10%% de aumento es : $%,.2f\n"
						, empleado.obtenerSalarioBase());
			} // fin de if

			System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
		} // fin de for

		// obtiene el nombre del tipo de cada objeto en el arreglo de empleados
		for (int j = 0; j < empleados.length; j++)
			System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());


		int mesActual = Calendar.getInstance().get(Calendar.MONTH) + 1; // +1 porque enero es 0

		for (Empleado empleado : empleados) {
			double salario = empleado.ingresos();
			if (empleado.getFecha().getMes() == mesActual) {
				salario += 100.0;
				System.out.printf("Feliz cumpleaños, %s! Recibes un bono de $100.%n", empleado.obtenerPrimerNombre());
			}

			System.out.printf("%s%nIngresos: $%.2f%n%n", empleado, salario);
		} // fin de main
	}
}// fin de la clase PruebaSistemaNomina
