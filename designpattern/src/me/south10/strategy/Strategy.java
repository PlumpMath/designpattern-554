package me.south10.strategy;

/**
 * Created by south10 on 2016-03-04.
 */
public interface Strategy {
    public Hand nextHand();
    public void study(boolean win);
}
