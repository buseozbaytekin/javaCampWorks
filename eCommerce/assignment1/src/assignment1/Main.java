package assignment1;

public class Main {

	public static void main(String[] args) {
		
		Courses course = new Courses(1,"Java-React Kampı","Sıfırdan Java ve React",0);
		Courses course2 = new Courses(2,"C#-Angular Kampı","Sıfırdan C# ve Angular",0);
		
		Courses[] courses = {
				course,
				course2
		} ;
		
		
		
		Students student = new Students(1,"Buse ","Özbaytekin",45.4);
		Students student2 = new Students(2,"Mustafa ","Bilce",57.3);
		
		Students [] students = {
				student,
				student2
		};
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student);
		studentManager.Add(student2);
		studentManager.Update(student2);
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course);
		courseManager.Remove(course2);
	}
	
	}


