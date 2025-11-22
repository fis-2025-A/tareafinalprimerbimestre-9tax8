package Ejercicio1;

public class PlayerPiece {
    private String color;
    private BoardSquare currentPosition;

    public PlayerPiece(String color) {
        this.color = color;
    }

    public void setCurrentPosition(BoardSquare newPosition) {
        this.currentPosition = newPosition;
    }

    public BoardSquare getCurrentPosition() {
        return this.currentPosition;
    }

    public String getColor() {
        return this.color;
    }
    public void moveTo(BoardSquare newSquare) {
      
        newSquare.movePlayerPiece(this);
    }
}