package hw2;

public class Student extends User {
	private boolean introductoryEmail;

	public Student(int id, String firstName, String lastName, String email, String password,
			boolean introductoryEmail) {
		super(id, firstName, lastName, email, password);
		this.introductoryEmail = introductoryEmail;
	}

	public boolean isIntroductoryEmail() {
		return introductoryEmail;
	}

	public void setIntroductoryEmail(boolean introductoryEmail) {
		this.introductoryEmail = introductoryEmail;
	}

}
