package hw2;

public class StudentManager extends UserManager{
	public void doHomework(Student student) {
		System.out.println(student.getId() + " did homework");
		
	}
	
	public void attandance(Student student) {
		System.out.println(student.getId() + " attended the lesson ");
	}
	

}
