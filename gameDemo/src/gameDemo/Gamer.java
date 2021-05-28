package gameDemo;

public class Gamer {
	
	
	int id;
	String firstName;
	String lastName;
	int birthYear;
	String nationalIdentity;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, int birthYear, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalIdentity = nationalIdentity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getnationalIdentity() {
		return nationalIdentity;
	}
	public void setnationalIdentity(String idNumber) {
		this.nationalIdentity = idNumber;
	}

}
