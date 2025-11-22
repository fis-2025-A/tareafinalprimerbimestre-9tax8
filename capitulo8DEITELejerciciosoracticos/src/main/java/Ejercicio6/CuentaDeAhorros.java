package Ejercicio6;

public class CuentaDeAhorros {
   
    private static double tasaInteresAnual = 0;
    private double saldoAhorros;
    
    // Constructor
    public CuentaDeAhorros(double saldoInicial) {
        this.saldoAhorros = saldoInicial;
    }
    

    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12) / 100;
        saldoAhorros += interesMensual; 
    }
    

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }
  
    public double getSaldoAhorros() {
        return saldoAhorros;
    }
    
    public void mostrarSaldo() {
        System.out.printf("Saldo: $%.2f%n", saldoAhorros);
    }
}
		
	


