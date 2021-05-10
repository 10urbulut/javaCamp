package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
				this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi  "+customer.fistName);
		
		Utils.runLoggers(loggers, customer.fistName);
		
				
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi  "+customer.fistName);
		Utils.runLoggers(loggers, customer.lastName);
	}

}
