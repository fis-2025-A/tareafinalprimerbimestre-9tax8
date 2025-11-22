package Ejercicio10;

public enum LuzSemaforo {
	ROJO(60),     
    VERDE(45),    
    AMARILLO(10);  

    private final int duracion;  

    LuzSemaforo(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
}