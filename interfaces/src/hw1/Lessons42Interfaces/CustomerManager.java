package hw1.Lessons42Interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		customerDal.add();
	}

}
