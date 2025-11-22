package Ejercicio12;



public class EmpleadoAsalariado extends Empleado {
 private double salarioSemanal;

 // constructor de cuatro argumentos
 public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
     super(nombre, apellido, nss); // los pasa al constructor de Empleado
     establecerSalarioSemanal(salario); // valida y almacena el salario
 }

 // establece el salario
 public void establecerSalarioSemanal(double salario) {
     salarioSemanal = salario < 0.0 ? 0.0 : salario;
 }

 // devuelve el salario
 public double obtenerSalarioSemanal() {
     return salarioSemanal;
 }

 // calcula los ingresos; implementa el método de la interfaz PorPagar
 // que era abstracto en la superclase Empleado
 public double obtenerMontoPago() {
     return obtenerSalarioSemanal();
 }

 // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
 @Override
 public double ingresos() {
     return obtenerSalarioSemanal();
 }

 // devuelve representación String de un objeto EmpleadoAsalariado
 @Override
 public String toString() {
     return String.format("empleado asalariado: %s\n%s: $%,.2f",
             super.toString(), "salario semanal", obtenerSalarioSemanal());
 }
}