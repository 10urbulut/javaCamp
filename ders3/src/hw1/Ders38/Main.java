package hw1.Ders38;

public class Main {

	public static void main(String[] args) {
		/*
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("sample");
	}
	*/
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
