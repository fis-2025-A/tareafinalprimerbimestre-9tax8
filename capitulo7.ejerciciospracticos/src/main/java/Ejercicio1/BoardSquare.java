package Ejercicio1;

class BoardSquare {
		private Snake aSnake = null;
		private Ladder aLadder = null;
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

    // we may want to add a snake head
    void addSnake(Snake s) {
        aSnake = s;
    }

    // or add the foot of a ladder
    public void addLadder(Ladder l) {
        aLadder = l;
    }

    // methods to find out if the square has a snake or a ladder
    private boolean hasSnake() {
        return null != aSnake;
    }

    private boolean hasLadder() {
        return null != aLadder;
    }
   
    public void movePlayerPiece(PlayerPiece counter) {
        counter.setCurrentPosition(this);
        if (hasSnake()) {
            aSnake.movePlayerPiece(counter);
        }
        
        if (hasLadder()) {
            aLadder.movePlayerPiece(counter);
        }
    }
}
