package hw2;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Gokalp", "Celik", "gokalp@gokalpcelik.com", "123");
		Student student = new Student(2, "Mutlu", "Celik", "mutlu@gokalpcelik.com", "123", false);
		Instructor instructor = new Instructor(3, "Yusuf", "Celik", "yusuf@gokalpcelik.com", "123", "5319219421", "Ankara");
		
		UserManager userManager = new UserManager();

		userManager.deleteUser(user);
		userManager.deleteUser(student);
		userManager.deleteUser(instructor);
		
		userManager.updateUser(user);
		userManager.updateUser(student);
		userManager.updateUser(instructor);
		
		userManager.logIn(user);
		userManager.logIn(student);
		userManager.logIn(instructor);
		
		userManager.logOut(user);
		userManager.logOut(student);
		userManager.logOut(instructor);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.deleteUser(student);
		studentManager.updateUser(student);
		studentManager.logIn(student);
		studentManager.logOut(student);
		
		studentManager.doHomework(student);
		studentManager.attandance(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.deleteUser(instructor);
		instructorManager.updateUser(student);
		instructorManager.logIn(instructor);
		instructorManager.logOut(instructor);
		
		instructorManager.createHomework();
		instructorManager.blockStudent(student);
		instructorManager.sendMail(student);
		
		

	}

}
