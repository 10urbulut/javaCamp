package hw2.Ders31and34;

public class Main {
	public static void main(String[] args) {
		Product ders32Product = new Product(1,"Laptop", "Asus Laptop", 3000,2,"Siyah" );
		
		Product ders31Product = new Product(1,"Laptop", "Asus Laptop", 3000,2,"Siyah" );
		ders31Product.setName("Laptop");
		ders31Product.setId(1);
		ders31Product.setDescription("Asus Laptop");
		ders31Product.setPrice(5000);
		ders31Product.setStockAmount(3);
		ders31Product.setRenk("siyah");
		
		ProductManager ders31ProductManager = new ProductManager();
		ders31ProductManager.Add(ders31Product);
		ders31ProductManager.Add(ders32Product);
	}
}
