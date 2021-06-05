package assignment1;

public class StudentManager {
	
	public void Add(Students students) {
		System.out.println("Student added! " + students.firstName + students.lastName);
	}
	public void Update(Students students) {
		System.out.println("Student updated! " + students.firstName + students.lastName);
	}
}
