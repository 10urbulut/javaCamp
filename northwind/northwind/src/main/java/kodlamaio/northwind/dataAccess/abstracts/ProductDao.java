package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{//integer id' yi temsil ediyor
	
	 Product getByProductName(String productName);
	 
	 Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	 
	 //category demek jpa da default olarak categoryid den getir demek
	 List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	 
	 List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	 
	 List<Product> getByProductNameContains(String productName);
	 
	 List<Product> getByProductNameStartsWith(String productName);
	 
	 
	 // veri tabanı tablosunu unuta sanki product entitysi gibi yaz
	 @Query("From Product where productName = : productName and categoryId = : categoryId")
	 List<Product> getByNameAndCategory(String productName, int categoryId);
	 
	 


}
