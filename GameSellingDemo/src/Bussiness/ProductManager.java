package Bussiness;

import DataAccess.IProductDal;
import Entity.Product;

public class ProductManager implements IProductService {
	IProductDal productDal;
	

	public ProductManager(IProductDal productDal) {
				this.productDal = productDal;
	}

	@Override
	public void add(Product product) {
		productDal.add(product);
		
	}

	@Override
	public void delete(Product product) {
		productDal.delete(product);
		
	}

	@Override
	public void update(Product product) {
		productDal.update(product);
		
	}

}
