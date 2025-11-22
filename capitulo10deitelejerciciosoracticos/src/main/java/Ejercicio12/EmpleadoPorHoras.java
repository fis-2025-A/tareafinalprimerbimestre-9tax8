package Ejercicio12;



public class EmpleadoPorHoras extends Empleado {
    private double sueldo; // sueldo por hora
    private double horas; // horas trabajadas por semana

    // constructor con cinco argumentos
    public EmpleadoPorHoras(String nombre, String apellido, String nss,
                            double sueldoPorHoras, double horasTrabajadas) {
        super(nombre, apellido, nss);
        establecerSueldo(sueldoPorHoras);
        establecerHoras(horasTrabajadas);
    }

    public void establecerSueldo(double sueldoPorHoras) {
        sueldo = (sueldoPorHoras < 0.0) ? 0.0 : sueldoPorHoras;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerHoras(double horasTrabajadas) {
        horas = ((horasTrabajadas >= 0.0) && (horasTrabajadas <= 168.0)) ?
                horasTrabajadas : 0.0;
    }

    public double obtenerHoras() {
        return horas;
    }

    // Implementación de PorPagar (delegamos en ingresos o calculamos directo)
    public double obtenerMontoPago() {
        return ingresos(); 
    }

    @Override
    public double ingresos() {
        if (obtenerHoras() <= 40) // no hay tiempo extra
            return obtenerSueldo() * obtenerHoras();
        else
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "sueldo por hora", obtenerSueldo(),
                "horas trabajadas", obtenerHoras());
    }
}