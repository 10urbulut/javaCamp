package nLayerdeDemo.bussiness.concretes;

import java.util.List;

import nLayerdeDemo.bussiness.abstracts.ProductService;
import nLayerdeDemo.core.LoggerService;
import nLayerdeDemo.dataAccess.abstracts.ProductDao;
import nLayerdeDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	 ProductDao productDao;
	 LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
	
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor ");
			
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi  :" + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		
		
	}

	@Override
	public void update(Product product) {
		
		
	}

	@Override
	public Product get(int id) {
		
		return null;
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
