package dataAccess.concretes.sql;

import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.CourseTakenDao;
import entities.concretes.CourseTaken;

public class SqlCourseTakenDao implements CourseTakenDao {

	List <CourseTaken> coursesTaken;
	
	public SqlCourseTakenDao() {
		this.coursesTaken = new ArrayList<CourseTaken>();
	}

	@Override
	public List<CourseTaken> getAll() {
		return this.coursesTaken;
	}

	@Override
	public void add(CourseTaken entity) {
		coursesTaken.add(entity);
	}

	@Override
	public void update(CourseTaken entity) {
		
		int index = this.coursesTaken.indexOf(entity);
		CourseTaken courseTaken = this.coursesTaken.get(index);
		
		courseTaken.setCategory(entity.getCategory());
		courseTaken.setId(entity.getId());
		courseTaken.setCourseName(entity.getCourseName());
		courseTaken.setDescription(entity.getDescription());
		courseTaken.setId(entity.getId());
		courseTaken.setImagePath(entity.getImagePath());
		courseTaken.setLocalDateStart(entity.getLocalDateStart());
		courseTaken.setLocalDateFinish(entity.getLocalDateFinish());
		courseTaken.setStepCompleted(entity.getStepCompleted());
		courseTaken.setStepNumber(entity.getStepNumber());
		courseTaken.setTeacher(entity.getTeacher());

	}

	@Override
	public void delete(CourseTaken entity) {
		coursesTaken.remove(entity);
	}


	
	

}
