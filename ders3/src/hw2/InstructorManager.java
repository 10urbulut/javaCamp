package hw2;

public class InstructorManager extends UserManager{
	public void createHomework() {
		System.out.println("Homework Created");
	}
	
	public void blockStudent(Student student) {
		System.out.println("Blocked " + student.getFirstName() );
	}
	
	public void sendMail(Student student) {
		if(student.isIntroductoryEmail()) {
			System.out.println(student.getEmail() + " mail sent");
		}
		else {
			System.out.println(student.getFirstName() + " does not want mail" );
		}
	}
	
	

}
