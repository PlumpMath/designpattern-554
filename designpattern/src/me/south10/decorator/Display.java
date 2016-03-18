package me.south10.decorator;

/**
 * Created by south10 on 2016-03-18.
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public void show(){
        for(int i=0; i<getRows(); i++){
            System.out.println(getRowText(i));
        }
    }
}
