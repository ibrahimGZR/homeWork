package entities.concretes;

import java.time.LocalDate;

public class CourseTaken extends Course {

	private int courseTakenId;
	private int stepCompleted;
	private LocalDate localDateStart;
	private LocalDate localDateFinish;

	public CourseTaken() {
		super();
	}

	public CourseTaken(int courseTakenId, int stepCompleted, LocalDate localDateStart, LocalDate localDateFinish,
			int id, Category category, String courseName, String description, String imagePath, Teacher teacher,
			int stepNumber) {
		super(id, category, courseName, description, imagePath, teacher, stepNumber);
		this.courseTakenId = courseTakenId;
		this.stepCompleted = stepCompleted;
		this.localDateStart = localDateStart;
		this.localDateFinish = localDateFinish;
	}

	public int getCourseTakenId() {
		return courseTakenId;
	}

	public void setCourseTakenId(int courseTakenId) {
		this.courseTakenId = courseTakenId;
	}

	public int getStepCompleted() {
		return stepCompleted;
	}

	public void setStepCompleted(int stepCompleted) {
		this.stepCompleted = stepCompleted;
	}

	public LocalDate getLocalDateStart() {
		return localDateStart;
	}

	public void setLocalDateStart(LocalDate localDateStart) {
		this.localDateStart = localDateStart;
	}

	public LocalDate getLocalDateFinish() {
		return localDateFinish;
	}

	public void setLocalDateFinish(LocalDate localDateFinish) {
		this.localDateFinish = localDateFinish;
	}

}
