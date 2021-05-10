package hw2.CoffeeShopWithMernis;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.birthYear=1993;
		customer.citizenNumber="30286011218";//bu tc no hatalý 
		customer.firstName="Onur";
		customer.lastName="Bulut";
		customer.id=1;
		
			
		
		
		customerManager.save(customer);
		
	
	
	}

}
