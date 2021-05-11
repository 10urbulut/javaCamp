package Bussiness;

import Adapter.IdentityCheckManager;
import DataAccess.ICustomerDal;
import Entity.Customer;

public class CustomerManager extends IdentityCheckManager implements ICustomerServicee{
	ICustomerDal customerDal;
	

	public CustomerManager(ICustomerDal customerDal) {
		
		this.customerDal = customerDal;
	}

	@Override
	public void add(Customer customer) {
		
		checkForIdentity(customer);
		customerDal.add(customer);
	
		
	}

	@Override
	public void delete(Customer customer) {
		customerDal.delete(customer);
		
	}

	@Override
	public void update(Customer customer) {
		customerDal.update(customer);
		
				
	}

	

}
