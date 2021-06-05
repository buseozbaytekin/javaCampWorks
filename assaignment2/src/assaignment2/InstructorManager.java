package assaignment2;

public class InstructorManager extends UserManager {
	public void add (Instructor instructor) {
		System.out.println(instructor.firstName + " ders yüklendi.");
}

public void send (Instructor instructor) {
	System.out.println(instructor.firstName + " öğrenciye e-mail gönderildi.");
}
}
