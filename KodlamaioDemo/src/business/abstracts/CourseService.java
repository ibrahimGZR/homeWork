package business.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface CourseService {

	List <Course> getAll();
	
	void add(Course course);
	void update(Course course);
	void delete(Course course);
	
	List <Course> search(String text);
	List<Course> selectedFilterByCategory(int categoryId);
	List<Course> selectedFilterByTeacher(int teacherId);
	
}
