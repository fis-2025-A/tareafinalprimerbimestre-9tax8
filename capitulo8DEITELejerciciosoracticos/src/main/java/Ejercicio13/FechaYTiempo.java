package Ejercicio13;

public class FechaYTiempo {
	private Fecha fecha;
    private Tiempo22 tiempo;

 
    public FechaYTiempo(int mes, int dia, int anio, int hora, int minuto, int segundo) {
        this.fecha = new Fecha(mes, dia, anio);
        this.tiempo = new Tiempo22(hora, minuto, segundo);
    }

  
    public void incrementarHora() {
        int horaAntes = tiempo.obtenerHora(); 
        tiempo.incrementarHora();
        

        if (horaAntes == 23 && tiempo.obtenerHora() == 0) {
            fecha.siguienteDia();
        }
    }


    public void tictac() {
        int horaAntes = tiempo.obtenerHora();
        int minutoAntes = tiempo.obtenerMinuto();
        int segundoAntes = tiempo.obtenerSegundo();
        
        tiempo.tictac();
        
     
        if (horaAntes == 23 && minutoAntes == 59 && segundoAntes == 59 && 
            tiempo.obtenerHora() == 0 && tiempo.obtenerMinuto() == 0 && tiempo.obtenerSegundo() == 0) {
            fecha.siguienteDia();
        }
    }

 
    public void incrementarMinuto() {
        int horaAntes = tiempo.obtenerHora();
        int minutoAntes = tiempo.obtenerMinuto();
        
        tiempo.incrementarMinuto();
        

        if (horaAntes == 23 && minutoAntes == 59 && 
            tiempo.obtenerHora() == 0 && tiempo.obtenerMinuto() == 0) {
            fecha.siguienteDia();
        }
    }

 
    public String aStringEstandar() {
        return String.format("%s %s", fecha.toString(), tiempo.toString());
    }

    public String aStringUniversal() {
        return String.format("%s %s", fecha.toString(), tiempo.aStringUniversal());
    }

    public String toString() {
        return aStringEstandar();
    }
}