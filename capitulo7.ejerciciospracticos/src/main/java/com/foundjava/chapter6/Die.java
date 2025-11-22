package com.foundjava.chapter6;

import java.util.Random;

public class Die {
    
    private int lastRoll; 

  
    public int getRoll() {
        var randomNumberGenerator = new Random();
        var randomNumber = randomNumberGenerator.nextInt(6) + 1;
        lastRoll = randomNumber;
        return randomNumber;
    }

    public int getLastRoll() {
        return lastRoll;
    }
}

