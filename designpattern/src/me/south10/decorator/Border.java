package me.south10.decorator;

/**
 * Created by south10 on 2016-03-18.
 */
public abstract class Border extends Display{
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
