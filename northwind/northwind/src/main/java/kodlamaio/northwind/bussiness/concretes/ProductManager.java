package kodlamaio.northwind.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;



@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	 ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		
		return this.productDao.findAll();
	}

}
