package dataAccess.concretes.sql;

import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.StudentDao;
import entities.concretes.Student;

public class SqlStudentDao implements StudentDao {

	List <Student> students;
	
	public SqlStudentDao() {
		this.students = new ArrayList<Student>();
	}
	
	@Override
	public List<Student> getAll() {
		return this.students;
	}

	@Override
	public void add(Student entity) {
		students.add(entity);
	}

	@Override
	public void update(Student entity) {
		
		int index = this.students.indexOf(entity);
		Student student = this.students.get(index);
		
		student.setCourseTaken(entity.getCourseTaken());
		student.seteMail(entity.geteMail());		
		student.setFirstName(entity.getFirstName());		
		student.setLastName(entity.getLastName());		
		student.setImagePath(entity.getImagePath());
		student.setPassword(entity.getPassword());
		student.setStudentId(entity.getStudentId());
		student.setId(entity.getId());
		
	}

	@Override
	public void delete(Student entity) {
		students.remove(entity);
	}

}
