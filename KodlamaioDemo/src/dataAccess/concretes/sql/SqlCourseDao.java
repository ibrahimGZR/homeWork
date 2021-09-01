package dataAccess.concretes.sql;

import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;


public class SqlCourseDao implements CourseDao {

	List <Course> courses;
	List <Course> matchedCourses;
	
	public SqlCourseDao() {
		this.courses = new ArrayList<Course>();
		this.matchedCourses = new ArrayList<Course>();
	}
	
	@Override
	public List<Course> getAll() {
		return this.courses;
	}

	@Override
	public void add(Course entity) {
		courses.add(entity);
	}

	@Override
	public void update(Course entity) {
		
		int index = this.courses.indexOf(entity);
		Course course = this.courses.get(index);
		
		course.setId(entity.getId());
		course.setCategory(entity.getCategory());
		course.setDescription(entity.getDescription());
		course.setCourseName(entity.getCourseName());
		course.setImagePath(entity.getImagePath());
		course.setStepNumber(entity.getStepNumber());
		course.setTeacher(entity.getTeacher());
	}

	@Override
	public void delete(Course entity) {
		courses.remove(entity);
	}

	@Override
	public List <Course> getByCourseName(String courseName) {
		this.matchedCourses.clear();
		for(Course course : this.courses) {
			if(course.getCourseName().contains(courseName)) {
				this.matchedCourses.add(course);
			}
		}
		return this.matchedCourses;
	}

	@Override
	public List <Course> getByTeacherName(String teacherName) {
		this.matchedCourses.clear();
		for(Course course : this.courses) {
			if(course.getTeacher().getFirstName() == teacherName) {
				this.matchedCourses.add(course);
			}
		}
		return this.matchedCourses;
	}

	@Override
	public List<Course> selectedFilterByCategory(int categoryId) {
		this.matchedCourses.clear();
		for (Course course : this.courses) {
			if (course.getCategory().getId()==categoryId) {
				this.matchedCourses.add(course);
			}
		}
		return matchedCourses;
	}

	@Override
	public List<Course> selectedFilterByTeacher(int teacherId) {
		this.matchedCourses.clear();
		for (Course course : this.courses) {
			if (course.getTeacher().getTeacherId()==teacherId) {
				this.matchedCourses.add(course);
			}
		}
		return this.matchedCourses;
	}
	
	

}
