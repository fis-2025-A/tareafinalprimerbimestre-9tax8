package Ejercicio3;
public class PruebaEmpleado {

	public static void main(String[] args) {
		// Crear un empleado con sueldo base más comisión
        EmpleadoBaseMasComision4 empleado = new EmpleadoBaseMasComision4(
                "Carlos", "Ramírez", "123-45-6789",
                10000.0, 0.06, 500.0
        );

        // Mostrar información del empleado
        System.out.println(empleado.toString());

        // Mostrar ingresos totales
        System.out.printf("Ingresos totales: %.2f\n", empleado.ingresos());

//Respuesta a la pregunta del ejercicio
/*Elegir entre la composición y la herencia depende mucho del contexto, pero la composición es
mucho más natural y flexible y es la que más se asemeja al mundo real y cualquier cambio que se
realice en la clase empleadoBaseMasComision no afecta directamente a la otra clase, mientras que si estamos
trabajando con herencia el mínimo cambio afecta a las clases hijas
*/

	}

}