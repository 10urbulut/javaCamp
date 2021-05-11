package Adapter;

import Entity.Customer;

public class IdentityCheckManager implements IIdentityCheckService{

	@Override
	public boolean checkForIdentity(Customer customer) {
		
		var result = true;//I pretend it is true
		if(result == true) {
			System.out.println("Identity verified   : "+ customer.getFirstName()+" "+customer.getLastName().toUpperCase());
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
	}

}
