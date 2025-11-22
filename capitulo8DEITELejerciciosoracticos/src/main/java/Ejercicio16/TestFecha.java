
package Ejercicio16;

public class TestFecha {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA CLASE FECHA CON TRES FORMATOS ===");
        
      
        System.out.println("\n--- Constructor 1: Tres enteros (MM/DD/AAAA) ---");
        Fecha fecha1 = new Fecha(6, 15, 1992);
        System.out.println("Fecha creada: 6, 15, 1992");
        System.out.println("Formato MM/DD/AAAA: " + fecha1.formatoMDAAAA());
        System.out.println("Formato Mes DD, AAAA: " + fecha1.formatoMesDiaAnio());
        System.out.println("Formato DDD AAAA: " + fecha1.formatoDiaDelAnio());
        
    
        System.out.println("\n--- Constructor 2: String y dos enteros (Mes DD, AAAA) ---");
        Fecha fecha2 = new Fecha("Junio", 15, 1992);
        System.out.println("Fecha creada: \"Junio\", 15, 1992");
        System.out.println("Formato MM/DD/AAAA: " + fecha2.formatoMDAAAA());
        System.out.println("Formato Mes DD, AAAA: " + fecha2.formatoMesDiaAnio());
        System.out.println("Formato DDD AAAA: " + fecha2.formatoDiaDelAnio());
        
        // Prueba 3: Constructor con dos enteros (DDD AAAA)
        System.out.println("\n--- Constructor 3: Dos enteros (DDD AAAA) ---");
        Fecha fecha3 = new Fecha(167, 1992); // 15 de junio = día 167
        System.out.println("Fecha creada: 167, 1992 (día 167 del año 1992)");
        System.out.println("Formato MM/DD/AAAA: " + fecha3.formatoMDAAAA());
        System.out.println("Formato Mes DD, AAAA: " + fecha3.formatoMesDiaAnio());
        System.out.println("Formato DDD AAAA: " + fecha3.formatoDiaDelAnio());
        
        // Prueba 4: Año bisiesto
        System.out.println("\n--- Prueba con año bisiesto ---");
        Fecha fecha4 = new Fecha(60, 2024); // 29 de febrero 2024 (bisiesto)
        System.out.println("Fecha creada: 60, 2024 (día 60 del año bisiesto 2024)");
        System.out.println("Formato MM/DD/AAAA: " + fecha4.formatoMDAAAA());
        System.out.println("Formato Mes DD, AAAA: " + fecha4.formatoMesDiaAnio());
        System.out.println("Formato DDD AAAA: " + fecha4.formatoDiaDelAnio());
        

        System.out.println("\n--- Pruebas con diferentes meses ---");
        Fecha[] fechas = {
            new Fecha(1, 1, 2023),      
            new Fecha("Febrero", 28, 2023), 
            new Fecha(365, 2023),       
            new Fecha("Diciembre", 31, 2023) 
        };
        
        String[] descripciones = {
            "1 de enero 2023",
            "28 de febrero 2023", 
            "Día 365 de 2023 (31 dic)",
            "31 de diciembre 2023"
        };
        
        for (int i = 0; i < fechas.length; i++) {
            System.out.println("\n" + descripciones[i] + ":");
            System.out.println("  MM/DD/AAAA: " + fechas[i].formatoMDAAAA());
            System.out.println("  Mes DD, AAAA: " + fechas[i].formatoMesDiaAnio());
            System.out.println("  DDD AAAA: " + fechas[i].formatoDiaDelAnio());
        }
        
        // Prueba 6: Validación de errores
        System.out.println("\n--- Pruebas de validación (deben lanzar excepciones) ---");
        
        try {
            Fecha fechaError1 = new Fecha(13, 1, 2023); // Mes inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado - Mes 13: " + e.getMessage());
        }
        
        try {
            Fecha fechaError2 = new Fecha(2, 29, 2023); // Febrero no bisiesto
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado - 29 feb 2023: " + e.getMessage());
        }
        
        try {
            Fecha fechaError3 = new Fecha("Junio", 31, 2023); // Junio tiene 30 días
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado - 31 de junio: " + e.getMessage());
        }
        
        try {
            Fecha fechaError4 = new Fecha(367, 2023); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado - día 367: " + e.getMessage());
        }
        
        System.out.println("\n=== TODAS LAS PRUEBAS COMPLETADAS ===");
    }
}