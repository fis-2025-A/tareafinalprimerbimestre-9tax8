package com.foundjava.chapter6;

public class MainTest {
	public class DiceGame {
	    public static void main(String[] args) {
	        var die1 = new Die();
	        var die2 = new Die();
	        
	        var diceTotal = die1.getRoll() + die2.getRoll();
	        
	        System.out.println("Total of 2 dice is: " + diceTotal);
	    }
	}

}
