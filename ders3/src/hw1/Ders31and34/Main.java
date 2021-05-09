package hw1.Ders31and34;

public class Main {

	public static void main(String[] args) {
		Product product2 = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "siyah");
		
		Product product = new Product(); product.setName("Laptop"); product.setId(1);
		product.setDescription("Asus Laptop"); product.setPrice(50000);
		product.setStockAmount(3);
		 

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getCode());

		// System.out.println(product.name);

	}

}
