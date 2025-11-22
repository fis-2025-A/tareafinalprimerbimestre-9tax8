package Ejercicio7;

class Ladder extends Mover {
    Ladder(BoardSquare top, BoardSquare foot) {
        super(top);
        foot.addMover(this);
    }

    @Override
    public void showMessage() {
        System.out.println("Up the ladder to " + getTargetSquare().getPosition());
    }
}