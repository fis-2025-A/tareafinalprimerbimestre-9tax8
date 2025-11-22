package Ejercicio7;

class BoardSquare {
    private Mover mover = null;  
    private int position;

    BoardSquare(int position) {
        setPosition(position);
    }

    int getPosition() {
        return position;
    }

    private void setPosition(int position) {
        this.position = position;
    }

    void addMover(Mover mover) {
        this.mover = mover;
    }

    private boolean hasMover() {
        return mover != null;
    }

    public void movePlayerPiece(PlayerPiece counter) {
        counter.setCurrentPosition(this);
        if (hasMover()) {
            mover.movePlayerPiece(counter);
        }
    }
}
