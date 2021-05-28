package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussiness.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;



@RestController //sen bir kontrollersın demek, java olmayanlarda beni tanısın
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return	this.productService.getAll();
		
	}
	
	@GetMapping(name="/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		
		return this.productService.getByProductName(productName);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		 return this.productService.add(product);
	}
	
	
	@GetMapping("/getByProductNameOrCategoryId")
	public DataResult<Product> getByProductNameOrCategoryId
	(@RequestParam String productName,@RequestParam("categoryId") int categoryId){
		
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	  
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
		
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(@RequestParam int pageNumber,@RequestParam int pageSize) {
	
		
		return this.productService.getAll(pageNumber, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted() {
		return this.productService.getAllSorted();
	}

}
