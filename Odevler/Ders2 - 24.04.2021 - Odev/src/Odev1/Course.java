package Odev1;

public class Course {
	public Course() {
		
	}
	
	public Course(int id, String name, String instructorName, boolean status) {
		this.id = id;
		this.name = name;
		this.instructorName = instructorName;
		this.status = status;
	}
	
	public int id;
	public String name;
	public String instructorName;
	public boolean status;
}
