package hw1.Lesson45.StaticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		
		Product product= new Product();
		product.name="Mouse";
		product.price=10;
		
		manager.add(product);

		
		DatabaseHelper.Crud.delete();
	}

}
