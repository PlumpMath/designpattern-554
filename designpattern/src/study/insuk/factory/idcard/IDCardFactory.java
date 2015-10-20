package study.insuk.factory.idcard;

import java.util.ArrayList;
import java.util.List;

import study.insuk.factory.framework.Factory;
import study.insuk.factory.framework.Product;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();
	@Override
	protected Product createProduct(String owner){
		return new IDCard(owner);
	}
	
	@Override
	protected void registerProduct(Product product) {
		owners . add ( ( (IDCard) product) . getOwner () ) ;
	}
	
	public List getOwner(){
		return owners;
	}
}
