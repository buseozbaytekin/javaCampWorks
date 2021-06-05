package assignment1;

public class Courses {
	
	public Courses(int id, String courseName,String description, double price) {
		this.id=id;
		this.courseName=courseName;
		this.description=description;
		this.price=price;
	}
	
	
	int id;
	String courseName;
	String description;
	double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
