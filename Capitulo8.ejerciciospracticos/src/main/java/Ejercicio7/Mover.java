package Ejercicio7;

public abstract class Mover {
    protected BoardSquare targetSquare;

    public Mover(BoardSquare targetSquare) {
        this.targetSquare = targetSquare;
    }

    public BoardSquare getTargetSquare() {
        return targetSquare;
    }

    public abstract void showMessage();

    public void movePlayerPiece(PlayerPiece counter) {
        showMessage();
        counter.setCurrentPosition(targetSquare);
    }
}
