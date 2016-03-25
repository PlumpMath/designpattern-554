package me.south10.observer;

import java.util.Random;

/**
 * Created by south10 on 2016-03-25.
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i=0; i<5; i++){
            number = random.nextInt(50);
            notifyAObservers();
        }
    }
}
