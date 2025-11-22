package Ejercicio8;

public class Hexagram {

    private Coin[] coins;
    public Hexagram() {
        this.coins = new Coin[3];
        

        for (var i = 0; i < this.coins.length; i++) { 
            this.coins[i] = new Coin();
        }
    }

    public void displayCompleteHexagram() {
        
      
        var hexagramLines = new String[6]; 
        System.out.println("Generando un hexagrama del I Ching...");
        
        for (var i = 0; i < 6; i++) { 
            hexagramLines[i] = this.generateLineSymbol();
        }

        System.out.println("\n--- Hexagrama Completo ---");
        
      
        for (var i = 5; i >= 0; i--) { 
            System.out.println(hexagramLines[i]);
        }
        System.out.println("--------------------------");
    }

    private String generateLineSymbol() {
        
        
        var headsCount = 0; 
   
        for (var coin : this.coins) { 
            var result = coin.getFace(); 
            if (result.equals("heads")) {
                headsCount++;
            }
        }

        switch (headsCount) {
            case 3:  return "---- o ----";
            case 2:  return "---------";
            case 1:  return "--   --";
            case 0:  return "---- x ----";
            default: return "";
        }
    }
}
