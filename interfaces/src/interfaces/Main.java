package interfaces;

public class Main {

	public static void main(String[] args) {
	Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer onur = new Customer(1,"Onur","Bulut");
		customerManager.add(onur);
		
	}

}
