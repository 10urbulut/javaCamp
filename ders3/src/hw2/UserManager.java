package hw2;

public class UserManager {

	public void deleteUser(User user) {
		System.out.println(user.getId() + " " + user.getFirstName() + " " + user.getLastName() + " is deleted");
	}

	public void updateUser(User user) {
		System.out.println(user.getId() + " " + user.getFirstName() + " " + user.getLastName() + " is updated");
	}

	public void logIn(User user) {
		System.out.println(user.getId() + " " + user.getFirstName() + " " + user.getLastName() + " is log-in");
	}

	public void logOut(User user) {
		System.out.println(user.getId() + " " + user.getFirstName() + " " + user.getLastName() + " is log-out");
	}

}
