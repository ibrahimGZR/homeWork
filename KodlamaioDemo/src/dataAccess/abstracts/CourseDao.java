package dataAccess.abstracts;

import java.util.List;
import entities.concretes.Course;

public interface CourseDao extends EntityRepository<Course>{

	List <Course> getByCourseName(String text);
	List <Course> getByTeacherName(String text);
	
	List<Course> selectedFilterByCategory(int categoryId);
	List<Course> selectedFilterByTeacher(int teacherId);
}
