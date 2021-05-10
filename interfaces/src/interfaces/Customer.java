package interfaces;

public class Customer {
	int id;
	String fistName;
	String lastName;
public Customer() {
	
}
public Customer(int id, String fistName, String lastName) {
	
	this.id = id;
	this.fistName = fistName;
	this.lastName = lastName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFistName() {
	return fistName;
}
public void setFistName(String fistName) {
	this.fistName = fistName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
