package Ejercicio19;

import java.util.Scanner;

public class TresEnRaya {
		private Celda[][] tablero;  
	    private Celda turno;      

	 
	    public TresEnRaya() {
	        tablero = new Celda[3][3];  
	        turno = Celda.X; 
	  
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tablero[i][j] = Celda.VACIO;
	            }
	        }
	    }


	    public void imprimirTablero() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tablero[i][j] == Celda.VACIO ? " " : tablero[i][j]);
	                if (j < 2) System.out.print("|");
	            }
	            System.out.println();
	            if (i < 2) System.out.println("-----");
	        }
	    }


	    public boolean realizarMovimiento(int fila, int col) {
	        if (fila < 0 || fila >= 3 || col < 0 || col >= 3 || tablero[fila][col] != Celda.VACIO) {
	            return false; 
	        }
	        tablero[fila][col] = turno;  
	
	        turno = (turno == Celda.X) ? Celda.O : Celda.X;
	        return true;  
	    }


	    public boolean comprobarVictoria() {
	
	        for (int i = 0; i < 3; i++) {
	            if (tablero[i][0] != Celda.VACIO && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
	                return true;
	            }
	            if (tablero[0][i] != Celda.VACIO && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
	                return true;
	            }
	        }
	 
	        if (tablero[0][0] != Celda.VACIO && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
	            return true;
	        }
	        if (tablero[0][2] != Celda.VACIO && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
	            return true;
	        }
	        return false;
	    }

	    public boolean comprobarEmpate() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (tablero[i][j] == Celda.VACIO) {
	                    return false;  
	                }
	            }
	        }
	        return true;  
	    }

	    public void jugar() {
	        Scanner scanner = new Scanner(System.in);
	        boolean juegoTerminado = false;

	        while (!juegoTerminado) {
	            imprimirTablero(); 
	            System.out.println("Turno de " + (turno == Celda.X ? "X" : "O"));


	            System.out.print("Ingresa fila (0, 1, 2): ");
	            int fila = scanner.nextInt();
	            System.out.print("Ingresa columna (0, 1, 2): ");
	            int col = scanner.nextInt();

	            if (!realizarMovimiento(fila, col)) {
	                System.out.println("Movimiento inválido, intenta de nuevo.");
	                continue;
	            }

	
	            if (comprobarVictoria()) {
	                imprimirTablero();
	                System.out.println("¡El jugador " + (turno == Celda.X ? "O" : "X") + " ha ganado!");
	                juegoTerminado = true;
	            } else if (comprobarEmpate()) {
	                imprimirTablero();
	                System.out.println("¡Empate!");
	                juegoTerminado = true;
	            }
	        }
	        scanner.close();
	    }

}