package hw2.CoffeeShopWithMernis;

public class Customer implements IEntity{
	int id;
	String citizenNumber;
	String firstName;
	String lastName;
	int birthYear;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCitizenNumber() {
		return citizenNumber;
	}
	public void setCitizenNumber(String citizenNumber) {
		this.citizenNumber = citizenNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	

}
