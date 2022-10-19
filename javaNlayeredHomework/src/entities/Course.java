package entities;

public class Course {
	private String courseName;
	private String instructor;
	private double price;
	private double progress;
	
	public Course() {
		
	}

	public Course(String courseName, String instructor, double progress,double price) {
		
		this.courseName = courseName;
		this.instructor = instructor;
		this.progress = progress;
		this.price=price;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	


	
	
}
