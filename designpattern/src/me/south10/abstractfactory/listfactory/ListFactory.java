package me.south10.abstractfactory.listfactory;

import me.south10.abstractfactory.factory.Factory;
import me.south10.abstractfactory.factory.Link;
import me.south10.abstractfactory.factory.Page;
import me.south10.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
}
