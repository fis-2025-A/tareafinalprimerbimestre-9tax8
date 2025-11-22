package ejercicio6;

public class IChingSimulator {

    public static void main(String[] args) {
        

        Coin[] coins = new Coin[3];

      
        for (int i = 0; i < coins.length; i++) {
            coins[i] = new Coin();
        }

        int headsCount = 0;
        
        System.out.println("Lanzando 3 monedas...");

     
        for (Coin coin : coins) {
            // "Lanzamos" la moneda llamando a getFace()
            String result = coin.getFace();
            
            // Verificamos si el resultado es "heads"
            if (result.equals("heads")) {
                headsCount++;
            }
        }

        System.out.println("Resultados: " + headsCount + " caras (heads) y " + (3 - headsCount) + " cruces (tails).");
        System.out.println(""); // Línea en blanco

     
        String lineName = "";
        String lineSymbol = "";

      
        
        if (headsCount == 3) {
            
            lineName = "Old Yang line";
            lineSymbol = "---- o ----";
        
        } else if (headsCount == 2) {
       
            lineName = "Young Yang line";
            lineSymbol = "---------"; 

        } else if (headsCount == 1) {
        
            lineName = "Young Yin line";
            lineSymbol = "--   --";

        } else {
          
            lineName = "Old Yin line";
            lineSymbol = "---- x ----";
        }

        System.out.println("Línea generada:");
        System.out.println(lineName + ": " + lineSymbol);
    }
}