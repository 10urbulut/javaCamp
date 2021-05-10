package hw1.Lessons42Interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
	
		customerManager.add();

	}

}
