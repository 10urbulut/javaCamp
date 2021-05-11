package nLayerdeDemo;

import nLayerdeDemo.bussiness.abstracts.ProductService;
import nLayerdeDemo.bussiness.concretes.ProductManager;
import nLayerdeDemo.core.JLoggerManagerAdapter;
import nLayerdeDemo.dataAccess.concretes.AbcProductDao;
import nLayerdeDemo.entities.concretes.Product;
 
public class Main {

	public static void main(String[] args) {
		
		
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
		
		

	}

}
