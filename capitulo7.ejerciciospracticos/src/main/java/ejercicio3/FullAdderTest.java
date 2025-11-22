package ejercicio3;

public class FullAdderTest {

    public static void main(String[] args) {
        
        FullAdder myAdder = new FullAdder();
        
        // --- Caso de prueba 1: 1 + 2 = 3 ---
        // 0001 + 0010 = 00011 (Resultado=3, Acarreo=0)
        int[] a1 = {1, 0, 0, 0}; // 1
        int[] b1 = {0, 1, 0, 0}; // 2
        int[] res1 = myAdder.add(a1, b1);
        printResult("1 + 2", a1, b1, res1); // Esperado: 0 0011

        // --- Caso de prueba 2: 5 + 3 = 8 ---
        // 0101 + 0011 = 01000 (Resultado=8, Acarreo=0)
        int[] a2 = {1, 0, 1, 0}; // 5
        int[] b2 = {1, 1, 0, 0}; // 3
        int[] res2 = myAdder.add(a2, b2);
        printResult("5 + 3", a2, b2, res2); // Esperado: 0 1000

        // --- Caso de prueba 3: 7 + 7 = 14 ---
        // 0111 + 0111 = 01110 (Resultado=14, Acarreo=0)
        int[] a3 = {1, 1, 1, 0}; // 7
        int[] b3 = {1, 1, 1, 0}; // 7
        int[] res3 = myAdder.add(a3, b3);
        printResult("7 + 7", a3, b3, res3); // Esperado: 0 1110

        // --- Caso de prueba 4: 15 + 1 (Overflow) ---
        // 1111 + 0001 = 10000 (Resultado=0, Acarreo=1)
        int[] a4 = {1, 1, 1, 1}; // 15
        int[] b4 = {1, 0, 0, 0}; // 1
        int[] res4 = myAdder.add(a4, b4);
        printResult("15 + 1", a4, b4, res4); // Esperado: 1 0000

        // --- Caso de prueba 5: 15 + 15 (Overflow) ---
        // 1111 + 1111 = 11110 (Resultado=14, Acarreo=1)
        int[] a5 = {1, 1, 1, 1}; // 15
        int[] b5 = {1, 1, 1, 1}; // 15
        int[] res5 = myAdder.add(a5, b5);
        printResult("15 + 15", a5, b5, res5); // Esperado: 1 1110
    }

    /**
     * Método de ayuda para imprimir los resultados de forma clara.
     * Imprime los bits de derecha a izquierda (Bit 3, Bit 2, Bit 1, Bit 0).
     */
    public static void printResult(String title, int[] a, int[] b, int[] result) {
        System.out.println("--- " + title + " ---");
        System.out.print("  ");
        printBinary(a, 4);
        System.out.println(" (" + binToDec(a, 4) + ")");
        System.out.print("+ ");
        printBinary(b, 4);
        System.out.println(" (" + binToDec(b, 4) + ")");
        System.out.println("= ----");
        System.out.print("  ");
        printBinary(result, 5); // Imprime el resultado de 5 bits
        System.out.println(" (" + binToDec(result, 5) + ")");
        System.out.println();
    }

    /**
     * Imprime un array de bits en orden inverso (de más a menos significativo).
     */
    public static void printBinary(int[] bits, int numBits) {
        // Imprime desde el bit más alto hasta el más bajo
        for (int i = numBits - 1; i >= 0; i--) {
            System.out.print(bits[i]);
        }
    }

    /**
     * Convierte un array de bits (LSB primero) a un entero.
     */
    public static int binToDec(int[] bits, int numBits) {
        int decimal = 0;
        int power = 1; // 2^0
        for (int i = 0; i < numBits; i++) {
            if (bits[i] == 1) {
                decimal += power;
            }
            power *= 2;
        }
        return decimal;
    }
}