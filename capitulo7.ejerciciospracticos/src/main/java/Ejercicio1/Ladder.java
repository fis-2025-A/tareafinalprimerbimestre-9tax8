package Ejercicio1;

class Ladder {
	private BoardSquare top;
	 Ladder(BoardSquare top, BoardSquare foot)
	 {
		 setTop(top);
		 foot.addLadder(this);
	 }
	 
	 private void setTop(BoardSquare top){
		 this.top = top;
	 }
	 
	 private BoardSquare getTop(){
		 return top;
	 }
	 
	 void movePlayerPiece(PlayerPiece counter){
		 
	 System.out.println("Up the ladder to " + getTop().getPosition());
	 counter.setCurrentPosition(getTop());
	 }
}
