package me.south10.strategy;

import java.util.Random;

/**
 * Created by south10 on 2016-03-04.
 */
public class WinningStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand preHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    public Hand nextHand() {
        if(!won){
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
