package study.insuk.prototype.framework;

public abstract class ConcreteProduct implements Product{
	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product p = null;
		try {
			p = (Product)clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public abstract void use(String s);
}
