package hw1;

public class Main {
	public static void main(String[] args) {
		Customer customer1 = new Customer("11111111111", "Gokalp", "Celik", 1997, 2018);
		Customer customer2 = new Customer("22222222222", "Engin", "Demirog", 1985, 2010);
		Customer customer3 = new Customer("33333333333", "Kerem", "Celik", 2012,2020);
		Customer customer4 = new Customer("44444444444", "Mutlu", "Celik", 1970,2018);
		
		Customer customers[] = {customer1, customer2, customer3, customer4};
	
		for(Customer customer : customers) {
			System.out.println(customer.name + " " + customer.surname + " " + customer.ssn);
			
		}
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.newCustomer(customer1);
		customerManager.newCustomer(customer2);
		customerManager.newCustomer(customer2);
		customerManager.newCustomer(customer4);
		
		customerManager.deleteCustomer(customer1);
		customerManager.deleteCustomer(customer2);
		customerManager.deleteCustomer(customer3);
		customerManager.deleteCustomer(customer4);
		
		
	}
}
