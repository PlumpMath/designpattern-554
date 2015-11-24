package study.insuk.prototype.framework;

public class MessageBox extends ConcreteProduct {
	private char decochar;
	
	public MessageBox(char decoder) {
		// TODO Auto-generated constructor stub
		this.decochar = decoder;
	}
	
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int length = s.getBytes().length;
		for(int i=0; i < length + 4; i++){
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + "" + s + "" + decochar);
		for(int i=0; i < length + 4; i++){
			System.out.print(decochar);
		}
		System.out.println("");
		
	}



}
