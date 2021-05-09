package hw1.Ders38;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("Musteri eklendi");
		this.logger.log("loglandi");		
	}

}
