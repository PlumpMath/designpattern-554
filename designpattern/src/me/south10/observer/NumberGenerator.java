package me.south10.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by south10 on 2016-03-25.
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyAObservers(){
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()){
            Observer o = it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
