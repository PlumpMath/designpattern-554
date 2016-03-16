package me.south10.abstractfactory.tablefactory;

import me.south10.abstractfactory.factory.Factory;
import me.south10.abstractfactory.factory.Link;
import me.south10.abstractfactory.factory.Page;
import me.south10.abstractfactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
