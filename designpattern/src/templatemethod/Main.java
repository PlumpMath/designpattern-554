<<<<<<< HEAD
package templatemethod;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("?•ˆ?…•?•˜?„¸?š”");
		
		d1.display();
		d2.display();
		d3.display();
	}
}
=======
package templatemethod;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("ì•ˆë…•í•˜ì„¸ìš”");
		
		d1.display();
		d2.display();
		d3.display();
	}
}
>>>>>>> branch 'master' of https://github.com/south10/designpattern.git
