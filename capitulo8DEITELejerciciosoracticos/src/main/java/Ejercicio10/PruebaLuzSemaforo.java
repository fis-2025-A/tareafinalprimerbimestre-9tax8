package Ejercicio10;

public class PruebaLuzSemaforo {

	public static void main(String[] args) {
	
        for (LuzSemaforo luz : LuzSemaforo.values()) {
            System.out.printf("La luz %s tiene una duración de %d segundos.%n", luz, luz.getDuracion());
        }

	}

}