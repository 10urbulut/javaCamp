package hw1.Lessons41AbstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomrManager customrManager = new CustomrManager();
		customrManager.dataBaseManager = new MySqlDatabaseManager();
		customrManager.getCustomers();

	}

}
