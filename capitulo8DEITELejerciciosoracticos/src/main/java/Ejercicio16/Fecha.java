
package Ejercicio16;

public class Fecha {
    private int mes;      
    private int dia;      
    private int anio;     
    

    private static final String[] nombresMeses = {
        "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
   
    private static final int[] diasPorMes = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    
 
    public Fecha(int mes, int dia, int anio) {
        validarFecha(mes, dia, anio);
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    
  
    public Fecha(String nombreMes, int dia, int anio) {
        int mes = convertirMesANumero(nombreMes);
        validarFecha(mes, dia, anio);
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
   
   
    public Fecha(int diaDelAnio, int anio) {
        convertirDiaDelAnio(diaDelAnio, anio);
    }
    
 
    private int convertirMesANumero(String nombreMes) {
        for (int i = 1; i <= 12; i++) {
            if (nombreMes.equals(nombresMeses[i])) {
                return i;
            }
        }
        throw new IllegalArgumentException("Mes inválido: " + nombreMes);
    }
 
    private void convertirDiaDelAnio(int diaDelAnio, int anio) {
        if (diaDelAnio < 1 || diaDelAnio > 366) {
            throw new IllegalArgumentException("Día del año debe estar entre 1 y 366");
        }

        int[] diasPorMesActual = diasPorMes.clone();
        if (esBisiesto(anio)) {
            diasPorMesActual[2] = 29;
        }
        
        int mesTemp = 1;
        int diasRestantes = diaDelAnio;
        
        while (diasRestantes > diasPorMesActual[mesTemp]) {
            diasRestantes -= diasPorMesActual[mesTemp];
            mesTemp++;
            if (mesTemp > 12) {
                throw new IllegalArgumentException("Día del año excede los días del año: " + diaDelAnio);
            }
        }
        
        this.mes = mesTemp;
        this.dia = diasRestantes;
        this.anio = anio;
    }
    
 
    private int calcularDiaDelAnio() {
        int totalDias = dia;
        int[] diasPorMesActual = diasPorMes.clone();
        
        if (esBisiesto(anio)) {
            diasPorMesActual[2] = 29;
        }
        
        for (int i = 1; i < mes; i++) {
            totalDias += diasPorMesActual[i];
        }
        return totalDias;
    }
    
    
    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    
  
    private void validarFecha(int mes, int dia, int anio) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mes inválido: " + mes);
        }
        
        int maxDias = diasPorMes[mes];
        if (mes == 2 && esBisiesto(anio)) {
            maxDias = 29;
        }
        
        if (dia < 1 || dia > maxDias) {
            throw new IllegalArgumentException("Día inválido: " + dia + " para el mes " + mes);
        }
        
        if (anio < 0) {
            throw new IllegalArgumentException("Año inválido: " + anio);
        }
    }
    
   
    public String formatoMDAAAA() {
        return String.format("%02d/%02d/%04d", mes, dia, anio);
    }
  
    public String formatoMesDiaAnio() {
        return String.format("%s %d, %d", nombresMeses[mes], dia, anio);
    }
    
  
    public String formatoDiaDelAnio() {
        return String.format("%d %d", calcularDiaDelAnio(), anio);
    }
    
  
    public String toString() {
        return formatoMDAAAA();
    }

    public int getMes() { return mes; }
    public int getDia() { return dia; }
    public int getAnio() { return anio; }
}