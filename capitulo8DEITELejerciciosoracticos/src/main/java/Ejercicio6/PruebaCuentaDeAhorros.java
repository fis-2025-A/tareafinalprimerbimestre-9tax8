package Ejercicio6;

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
      
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);
        
        System.out.println("=== TASA DE INTERÉS AL 4% ===");
        

        CuentaDeAhorros.modificarTasaInteres(4.0);
        
        System.out.println("Saldo inicial:");
        System.out.print("Ahorrador 1: ");
        ahorrador1.mostrarSaldo();
        System.out.print("Ahorrador 2: ");
        ahorrador2.mostrarSaldo();
        
 
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        
        System.out.println("\nDespués de calcular el interés mensual al 4%:");
        System.out.print("Ahorrador 1: ");
        ahorrador1.mostrarSaldo();
        System.out.print("Ahorrador 2: ");
        ahorrador2.mostrarSaldo();
        
        System.out.println("\n=== TASA DE INTERÉS AL 5% ===");
        

        CuentaDeAhorros.modificarTasaInteres(5.0);
        
    
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        
        System.out.println("Después de calcular el interés mensual al 5%:");
        System.out.print("Ahorrador 1: ");
        ahorrador1.mostrarSaldo();
        System.out.print("Ahorrador 2: ");
        ahorrador2.mostrarSaldo();
    
        System.out.println("\n=== RESUMEN FINAL ===");
        System.out.printf("Ahorrador 1 - Saldo final: $%.2f%n", ahorrador1.getSaldoAhorros());
        System.out.printf("Ahorrador 2 - Saldo final: $%.2f%n", ahorrador2.getSaldoAhorros());
    }
}