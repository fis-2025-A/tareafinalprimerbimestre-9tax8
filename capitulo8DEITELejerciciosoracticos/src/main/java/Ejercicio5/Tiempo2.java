package Ejercicio5;

public class Tiempo2 {
    
    private int segundosDesdeMedianoche;
    
    public Tiempo2() {
        this(0, 0, 0);
    }
    
    public Tiempo2(int h) {
        this(h, 0, 0);
    }
    
    public Tiempo2(int h, int m) {
        this(h, m, 0);
    }
    
    public Tiempo2(int h, int m, int s) {
        establecerTiempo(h, m, s);
    }
    
    public Tiempo2(Tiempo2 tiempo) {
        this.segundosDesdeMedianoche = tiempo.segundosDesdeMedianoche;
    }
    
    public void establecerTiempo(int h, int m, int s) {
        int segundos = 0;
        if (h >= 0 && h < 24) segundos += h * 3600;
        if (m >= 0 && m < 60) segundos += m * 60;
        if (s >= 0 && s < 60) segundos += s;
        this.segundosDesdeMedianoche = segundos;
    }
    
    public void establecerHora(int h) {
        if (h >= 0 && h < 24) {
 
            int minutosActuales = obtenerMinuto();
            int segundosActuales = obtenerSegundo();
            this.segundosDesdeMedianoche = h * 3600 + minutosActuales * 60 + segundosActuales;
        }
    }
    
    public void establecerMinuto(int m) {
        if (m >= 0 && m < 60) {
            // Mantener la hora y segundos actuales, solo cambiar los minutos
            int horasActuales = obtenerHora();
            int segundosActuales = obtenerSegundo();
            this.segundosDesdeMedianoche = horasActuales * 3600 + m * 60 + segundosActuales;
        }
    }
    
    public void establecerSegundo(int s) {
        if (s >= 0 && s < 60) {
            // Mantener la hora y minutos actuales, solo cambiar los segundos
            int horasActuales = obtenerHora();
            int minutosActuales = obtenerMinuto();
            this.segundosDesdeMedianoche = horasActuales * 3600 + minutosActuales * 60 + s;
        }
    }
    
    public int obtenerHora() {
        return segundosDesdeMedianoche / 3600;
    }
    
    public int obtenerMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }
    
    public int obtenerSegundo() {
        return segundosDesdeMedianoche % 60;
    }
    
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }
    
    public String toString() {
        int hora12 = (obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12;
        String periodo = (obtenerHora() < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", hora12, obtenerMinuto(), obtenerSegundo(), periodo);
    }
}