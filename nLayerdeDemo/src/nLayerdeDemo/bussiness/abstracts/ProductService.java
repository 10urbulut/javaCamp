package nLayerdeDemo.bussiness.abstracts;
import java.util.List;
import nLayerdeDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	Product get(int id);
	List<Product> getAll();

}
