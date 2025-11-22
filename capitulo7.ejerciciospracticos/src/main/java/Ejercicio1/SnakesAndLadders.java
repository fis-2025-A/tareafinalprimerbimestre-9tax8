package Ejercicio1;

public class SnakesAndLadders {
	
    private GameBoard board;


    public SnakesAndLadders() {
        board = new GameBoard();
    }


    public void play() {
        
    
        PlayerPiece counterRed = new PlayerPiece("Red");
        PlayerPiece counterBlue = new PlayerPiece("Blue"); // <-- NUEVO

   
        counterRed.setCurrentPosition(board.getStartSquare());
        counterBlue.setCurrentPosition(board.getStartSquare()); // <-- NUEVO

  
        boolean gameWon = false; 
        System.out.println("¡Comienza el juego! " + counterRed.getColor() + " vs " + counterBlue.getColor());

        
        while (!gameWon) {
  
            board.movePlayerPiece(counterRed);

            if (counterRed.getCurrentPosition().getPosition() == GameBoard.MAX_SQUARES) {
                gameWon = true; 
                System.out.println(counterRed.getColor() +
                        " counter finished on " +
                        counterRed.getCurrentPosition().getPosition());
                break; 
            }

          
            board.movePlayerPiece(counterBlue);

           
            if (counterBlue.getCurrentPosition().getPosition() == GameBoard.MAX_SQUARES) {
                gameWon = true;
                System.out.println(counterBlue.getColor() +
                        " counter finished on " +
                        counterBlue.getCurrentPosition().getPosition());
                break; 
            }
        }
        
        System.out.println("--- ¡Fin del juego! ---");
     
    }

    public static void main(String[] args) {
        SnakesAndLadders myGame = new SnakesAndLadders();
        myGame.play();
    }
	
	
}
	

