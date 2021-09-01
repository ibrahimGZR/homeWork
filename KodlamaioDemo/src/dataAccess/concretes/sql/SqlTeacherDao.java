package dataAccess.concretes.sql;

import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.TeacherDao;
import entities.concretes.Teacher;

public class SqlTeacherDao implements TeacherDao{

	List <Teacher> teachers;
	
	public SqlTeacherDao() {
		this.teachers = new ArrayList<Teacher>();
	}
	
	@Override
	public List<Teacher> getAll() {
		return this.teachers;
	}

	@Override
	public void add(Teacher entity) {
		this.teachers.add(entity);
	}

	@Override
	public void update(Teacher entity) {
		
		int index = this.teachers.indexOf(entity);
		Teacher teacher = this.teachers.get(index);
		
		teacher.setTeacherId(entity.getTeacherId());
		teacher.setBranch(entity.getBranch());
		teacher.setDescription(entity.getDescription());
		teacher.seteMail(entity.geteMail());
		teacher.setFirstName(entity.getFirstName());
		teacher.setLastName(entity.getLastName());
		teacher.setImagePath(entity.getImagePath());
		teacher.setPassword(entity.getPassword());
		teacher.setId(entity.getId());

	}

	@Override
	public void delete(Teacher entity) {
		teachers.remove(entity);
	}

}
