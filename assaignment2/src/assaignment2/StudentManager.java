package assaignment2;

public class StudentManager extends UserManager{
	public void add (Student student) {
		System.out.println(student.firstName + " ödevin yüklendi!");
	}
	
	public void join (Student student) {
		System.out.println(student.firstName + " derse katıldın.");
	}

}
