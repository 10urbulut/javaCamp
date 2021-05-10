package hw2;

public class Instructor extends User {
	private String phoneNumber;
	private String adress;

	public Instructor(int id, String firstName, String lastName, String email, String password, String phoneNumber,
			String adress) {
		super(id, firstName, lastName, email, password);
		this.phoneNumber = phoneNumber;
		this.adress = adress;
	}
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
