package Ejercicio3;


public class EmpleadoBaseMasComision4 {
	private double salarioBase; // salario base por semana
	private EmpleadoPorComision3 EmpleadoPorComision;
	// constructor con seis argumentos

	public EmpleadoBaseMasComision4( String nombre, String apellido,
			String nss, double ventas, double tarifa, double salario )
	{
		establecerSalarioBase( salario ); // valida y almacena el salario base
		//Establecer al emplado por comicion 3
		EmpleadoPorComision = new EmpleadoPorComision3(nombre, apellido, nss, ventas, tarifa);

	} // fin del constructor de EmpleadoBaseMasComision4 con seis argumentos

	// establece el salario base
	public void establecerSalarioBase( double salario )
	{
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
	} // fin del método establecerSalarioBase

	// devuelve el salario base
	public double obtenerSalarioBase()
	{
		return salarioBase;
	} // fin del método obtenerSalarioBase

	// calcula los ingresos
	public double ingresos()
	{
		return obtenerSalarioBase() + EmpleadoPorComision.ingresos();
	} // fin del método ingresos
	// devuelve representación String de EmpleadoBaseMasComision4
	public String toString()
	{
		return String.format("%s %s\n%s: %.2f", "con sueldo base", EmpleadoPorComision.toString(), "sueldo base", obtenerSalarioBase());

	} // fin del método toString

}// fin de la clase EmpleadoBaseMasComision4
