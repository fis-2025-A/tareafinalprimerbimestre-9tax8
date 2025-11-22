package Ejercicio7;

class Snake extends Mover {
    Snake(BoardSquare head, BoardSquare tail) {
        super(tail);
        head.addMover(this);
    }

    @Override
    public void showMessage() {
        System.out.println("Down the snake to " + getTargetSquare().getPosition());
    }
}


