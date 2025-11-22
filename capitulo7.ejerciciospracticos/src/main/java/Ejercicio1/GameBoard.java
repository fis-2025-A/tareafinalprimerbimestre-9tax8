package Ejercicio1;

import com.foundjava.chapter6.Die;

 class GameBoard {
	 private BoardSquare[] squares;
	 private Die die;
	 // the array will be one square bigger than needed so that we
	 // can start from array element 1, ignoring element 0
	 static final int MAX_SQUARES = 100;
	 static final int START_SQUARE = 1;
	 // the constructor creates the squares and adds the
	 // snakes and ladders
	 GameBoard()
	 {
	 die = new Die();
	 squares = new BoardSquare[START_SQUARE + MAX_SQUARES];
	 for (int i = START_SQUARE; i <= MAX_SQUARES; i++)
	 {
	 // add the next Square object to the board
	 squares[i] = new BoardSquare(i);
	 }
	 // add the ladders
	 new Ladder(squares[38], squares[1]);
	 new Ladder(squares[14], squares[4]);
	 new Ladder(squares[31], squares[9]);
	 new Ladder(squares[42], squares[21]);
	 new Ladder(squares[84], squares[28]);
	 new Ladder(squares[44], squares[36]);
	 new Ladder(squares[67], squares[51]);
	 new Ladder(squares[91], squares[71]);
	 new Ladder(squares[100], squares[80]);
	 // add the snakes
	 new Snake(squares[16], squares[6]);
	 new Snake(squares[47], squares[26]);
	 new Snake(squares[49], squares[11]);
	 new Snake(squares[56], squares[53]);
	 new Snake(squares[62], squares[19]);
	 new Snake(squares[64], squares[60]);
	 new Snake(squares[87], squares[24]);
	 new Snake(squares[93], squares[73]);
	 new Snake(squares[95], squares[75]);
	 new Snake(squares[98], squares[78]);
	 }
	 
	 BoardSquare getStartSquare()
	 {
	 return squares[START_SQUARE];
	 }
	 // this method adjusts the counter position 
	void movePlayerPiece(PlayerPiece counter) 
	{
	 BoardSquare current = counter.getCurrentPosition();
	 int nextPosition = current.getPosition() + die.getRoll();
	 if(nextPosition > MAX_SQUARES){
	 System.out.println("Sorry you need to land exactly on the last square to win!");
	 }else{
	 counter.moveTo(squares[nextPosition]);
	 }
	 
	 System.out.println(counter.getColor() + " counter on " +
	 counter.getCurrentPosition().getPosition());
	 }

}
