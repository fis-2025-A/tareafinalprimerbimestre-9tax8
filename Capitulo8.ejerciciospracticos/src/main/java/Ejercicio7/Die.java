package Ejercicio7;

import java.util.Random;

public class Die {
    
    private int lastRoll; 
 
    private Random randomNumberGenerator = new Random();

    public int roll() {
        var randomNumber = randomNumberGenerator.nextInt(6) + 1;
        lastRoll = randomNumber;
        return randomNumber;
    }

    public int getLastRoll() {
        return lastRoll;
    }
}