package hw1.Lesson45.StaticDemo;

public class ProductManager {
		
	
	public void add(Product product) {
		
		
		
		
		if(ProductValidator.isValid(product)) {
			
			System.out.println("Eklendi");
			
			
		}
		System.out.println("Ürün bilgileri geçersizdir");
				
		
	}

}
