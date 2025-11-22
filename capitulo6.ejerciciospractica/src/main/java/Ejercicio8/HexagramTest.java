package Ejercicio8;

public class HexagramTest {

    // 'args' es un PARÁMETRO, no se puede usar 'var'.
    public static void main(String[] args) {
        
        // ANTES: Hexagram miHexagrama = new Hexagram();
        var miHexagrama = new Hexagram(); // <-- CAMBIO 1
        // El compilador infiere 'Hexagram' por el constructor 'new Hexagram()'

        miHexagrama.displayCompleteHexagram();

        System.out.println("\nGenerando un segundo hexagrama...");
        
        // ANTES: Hexagram otroHexagrama = new Hexagram();
        var otroHexagrama = new Hexagram(); // <-- CAMBIO 2
        
        otroHexagrama.displayCompleteHexagram();
    }
}
