package hw2.CoffeeShopWithMernis;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	public  void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
		}
		else {
		System.out.println("Not a valid person ");
		}


		
	}

		

	

}
