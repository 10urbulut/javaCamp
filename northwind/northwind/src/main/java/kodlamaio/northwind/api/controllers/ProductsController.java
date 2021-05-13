package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;



@RestController //sen bir kontrollersın demek
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Product> getAll(){
		return 	this.productService.getAll();
		
	}
	
	

}
