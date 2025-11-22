package ejericio5;

public class CoinTest {

    public static void main(String[] args) {
        
      
        Coin miMoneda = new Coin();

      
        String resultado = miMoneda.getFace();
        System.out.println("Primer lanzamiento: " + resultado);

    
        System.out.println("\n--- Lanzando 10 veces ---");
        
        for (int i = 1; i <= 10; i++) {
            // Cada llamada a getFace() simula un nuevo lanzamiento
            System.out.println("Lanzamiento #" + i + ": " + miMoneda.getFace());
        }
    }
}
