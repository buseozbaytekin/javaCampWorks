package assaignment2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.course = "Java ve React kampı";
		
		Student student = new Student();
		student.id = 1;
		student.firstName = "Buse";
		student.lastName = "Özbaytekin";
		student.eMail = "buseozbaytekin@hotmail.com";
		student.performance = 70;
		

		User buse = new User();
		buse.userName = "buseozbaytekin";
		buse.password = "1234";
		
		User engin = new User();
		engin.userName = "engindemirog";
		engin.password = "12345";
		
		
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		

		
		studentManager.add(student);
		studentManager.join(student);
		
		
		instructorManager.add(instructor);
		instructorManager.send(instructor);
		
		
		userManager.signIn(buse);
		userManager.signUp(buse);
		


	}

}
