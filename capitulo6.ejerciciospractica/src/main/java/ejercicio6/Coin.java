package ejercicio6;
import java.util.Random;


public class Coin {
		private Random rand;
 
 		public Coin() {
 			this.rand = new Random();
 		}

 public String getFace() {
    
     boolean esCara = this.rand.nextBoolean();

    
     if (esCara) {
         return "heads";
     } else {
         return "tails";
     }
     
 }
}
