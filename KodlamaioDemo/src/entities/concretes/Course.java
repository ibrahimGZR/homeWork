package entities.concretes;

public class Course {

	private int id;
	private int stepNumber;
	private String courseName;
	private String description;
	private String imagePath;
	private Teacher teacher;
	private Category category;
	
	
	public Course() {
		
	}
	
	public Course(int id, Category category, String courseName, String description, String imagePath,
			Teacher teacher, int stepNumber) {
		this.id = id;
		this.category = category;
		this.courseName = courseName;
		this.description = description;
		this.imagePath = imagePath;
		this.teacher = teacher;
		this.stepNumber = stepNumber;
	}
	
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
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(int stepNumber) {
		this.stepNumber = stepNumber;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
