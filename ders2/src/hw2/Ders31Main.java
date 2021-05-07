package hw2;

public class Ders31Main {
	public static void main(String[] args) {
		Ders31Product ders32Product = new Ders31Product(1,"Laptop", "Asus Laptop", 3000,2,"Siyah" );
		
		Ders31Product ders31Product = new Ders31Product(1,"Laptop", "Asus Laptop", 3000,2,"Siyah" );
		ders31Product.setName("Laptop");
		ders31Product.setId(1);
		ders31Product.setDescription("Asus Laptop");
		ders31Product.setPrice(5000);
		ders31Product.setStockAmount(3);
		ders31Product.setRenk("siyah");
		
		Ders31ProductManager ders31ProductManager = new Ders31ProductManager();
		ders31ProductManager.Add(ders31Product);
		ders31ProductManager.Add(ders32Product);
	}
}
