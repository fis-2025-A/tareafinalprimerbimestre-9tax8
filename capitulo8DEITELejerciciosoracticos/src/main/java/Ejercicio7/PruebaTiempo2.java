package Ejercicio7;
public class PruebaTiempo2 {

	public static void main(String[] args) {
	
        Tiempo22 tiempo = new Tiempo22(23, 59, 59);
        

        System.out.println("Hora inicial: " + tiempo.aStringUniversal());

        tiempo.incrementarMinuto();
        System.out.println("Después de incrementar el minuto: " + tiempo.aStringUniversal());


        tiempo.incrementarHora();
        System.out.println("Después de incrementar la hora: " + tiempo.aStringUniversal());

  
        tiempo.tictac();
        System.out.println("Después de un tictac (un segundo): " + tiempo.aStringUniversal());

        System.out.println("Hora final: " + tiempo.aStringUniversal());

	}

}
