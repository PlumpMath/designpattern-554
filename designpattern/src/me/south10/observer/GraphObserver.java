package me.south10.observer;

import java.util.concurrent.TimeUnit;

/**
 * Created by south10 on 2016-03-25.
 */
public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for(int i=0; i<count; i++){
            System.out.print("*");
        }
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
