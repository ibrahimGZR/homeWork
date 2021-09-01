package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{

	private int studentId;
	private List<CourseTaken> courseTaken;
	

	public Student() {
		super();
		this.courseTaken = new ArrayList<CourseTaken>();
	}
	
	public Student(int studentId, List<CourseTaken> courseTaken, int id, String firstName, String lastName, String password, String eMail, String imagePath) {
		super(id, firstName, lastName, password, eMail, imagePath);
		this.studentId = studentId;
		this.courseTaken = courseTaken;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public List<CourseTaken> getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(List<CourseTaken> courseTaken) {
		this.courseTaken = courseTaken;
	}

}
