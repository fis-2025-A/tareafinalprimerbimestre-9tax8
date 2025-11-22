package Ejercicio12;

// Corrección: Ahora extiende Ejercicio12.EmpleadoPorComision implícitamente
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase; // salario base por semana

    public EmpleadoBaseMasComision(String nombre, String apellido,
                                   String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        establecerSalarioBase(salario);
    }

    public void establecerSalarioBase(double salario) {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // Implementación de PorPagar
    @Override
    public double obtenerMontoPago() {
        return ingresos();
    }

    @Override
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "con salario base", super.toString(),
                "salario base", obtenerSalarioBase());
    }
}