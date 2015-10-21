package factorymethod.idcard;


import java.util.ArrayList;
import java.util.List;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

public class IDCardFactory extends Factory{
	private List owners = new ArrayList();
	
	@Override
	protected void registerProduct(Product p) {
		owners.add(((IDCard)p).getOwner());
	}

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

}
