package nLayerdeDemo.dataAccess.abstracts;
import java.util.List;

import nLayerdeDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	Product get(int id);
	List<Product>  getAll();
	

}
