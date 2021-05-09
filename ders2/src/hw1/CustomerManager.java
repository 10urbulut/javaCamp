package hw1;

public class CustomerManager {
	public void newCustomer(Customer customer) {
		System.out.println(customer.ssn + " customer has been created.");
	}
	
	public void deleteCustomer(Customer customer) {
		System.out.println(customer.ssn + " customer has been deleted.");
	}
}
