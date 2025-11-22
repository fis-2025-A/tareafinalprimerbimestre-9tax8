package ejercicio7;

public class HexagramTest {

	public static void main(String[] args) {
     Hexagram miHexagrama = new Hexagram(); 
        miHexagrama.displayCompleteHexagram();

        System.out.println("\nGenerando un segundo hexagrama...");
        Hexagram otroHexagrama = new Hexagram();
        otroHexagrama.displayCompleteHexagram();
    }
}
