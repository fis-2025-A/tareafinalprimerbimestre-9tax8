package Ejercicio13;


public class PruebaFechaYTiempo {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE CLASE FECHA Y TIEMPO ===");

   
        System.out.println("\n--- Prueba 1: Cambio de día al incrementar hora ---");
        FechaYTiempo fechaTiempo1 = new FechaYTiempo(12, 31, 2022, 23, 30, 0);
        System.out.println("Fecha y hora inicial: " + fechaTiempo1.aStringEstandar());
        System.out.println("Formato universal: " + fechaTiempo1.aStringUniversal());

        System.out.println("\nIncrementando hora (debería cambiar de día y año):");
        fechaTiempo1.incrementarHora();
        System.out.println("Después de incrementar hora: " + fechaTiempo1.aStringEstandar());
        System.out.println("Formato universal: " + fechaTiempo1.aStringUniversal());

 
        System.out.println("\n--- Prueba 2: Cambio de día con tictac ---");
        FechaYTiempo fechaTiempo2 = new FechaYTiempo(2, 28, 2023, 23, 59, 59);
        System.out.println("Fecha y hora inicial: " + fechaTiempo2.aStringEstandar());

        System.out.println("\nAplicando tictac (debería cambiar de día y mes):");
        fechaTiempo2.tictac();
        System.out.println("Después de tictac: " + fechaTiempo2.aStringEstandar());

        System.out.println("\n--- Prueba 3: Cambio de día al incrementar minuto ---");
        FechaYTiempo fechaTiempo3 = new FechaYTiempo(4, 15, 2023, 23, 59, 0);
        System.out.println("Fecha y hora inicial: " + fechaTiempo3.aStringEstandar());

        System.out.println("\nIncrementando minuto (debería cambiar de día):");
        fechaTiempo3.incrementarMinuto();
        System.out.println("Después de incrementar minuto: " + fechaTiempo3.aStringEstandar());


        System.out.println("\n--- Prueba 4: Secuencia completa cerca de fin de año ---");
        FechaYTiempo fechaTiempo4 = new FechaYTiempo(12, 31, 2023, 23, 58, 0);
        System.out.println("Fecha y hora inicial: " + fechaTiempo4.aStringEstandar());

        System.out.println("\nSecuencia de operaciones:");
        System.out.println("1. Incrementar minuto:");
        fechaTiempo4.incrementarMinuto();
        System.out.println("   Resultado: " + fechaTiempo4.aStringEstandar());

        System.out.println("2. Incrementar minuto (debería cambiar de día, mes y año):");
        fechaTiempo4.incrementarMinuto();
        System.out.println("   Resultado: " + fechaTiempo4.aStringEstandar());

        System.out.println("3. Incrementar hora:");
        fechaTiempo4.incrementarHora();
        System.out.println("   Resultado: " + fechaTiempo4.aStringEstandar());


        System.out.println("\n--- Prueba 5: Operaciones normales (sin cambio de día) ---");
        FechaYTiempo fechaTiempo5 = new FechaYTiempo(6, 15, 2023, 14, 30, 45);
        System.out.println("Fecha y hora inicial: " + fechaTiempo5.aStringEstandar());

        System.out.println("\nAplicando tictac:");
        fechaTiempo5.tictac();
        System.out.println("Después de tictac: " + fechaTiempo5.aStringEstandar());

        System.out.println("\nIncrementando minuto:");
        fechaTiempo5.incrementarMinuto();
        System.out.println("Después de incrementar minuto: " + fechaTiempo5.aStringEstandar());

        System.out.println("\nIncrementando hora:");
        fechaTiempo5.incrementarHora();
        System.out.println("Después de incrementar hora: " + fechaTiempo5.aStringEstandar());


        System.out.println("\n--- COMPARACIÓN DE FORMATOS ---");
        System.out.println("Formato estándar: " + fechaTiempo5.aStringEstandar());
        System.out.println("Formato universal: " + fechaTiempo5.aStringUniversal());
    }
}