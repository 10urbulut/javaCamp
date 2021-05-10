package hw2.CoffeeShopWithMernis;

public class NeroCustomerManager extends BaseCustomerManager{

		ICustomerCheckService customerCheckService;

		public NeroCustomerManager(ICustomerCheckService customerCheckService) {
			
			this.customerCheckService = customerCheckService;
		}
		
		
		
		public  void save(Customer customer) {
			if(customerCheckService.checkIfRealPerson(customer)) {
				
				save(customer);
			}
			else {
			System.out.println("Not a valid person ");
			}
	}
}

