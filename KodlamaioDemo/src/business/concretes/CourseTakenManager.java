package business.concretes;

import java.util.List;

import business.abstracts.CourseTakenService;
import dataAccess.abstracts.CourseTakenDao;
import entities.concretes.CourseTaken;

public class CourseTakenManager implements CourseTakenService {

	CourseTakenDao courseTakenDao;
	
	public CourseTakenManager(CourseTakenDao courseTakenDao) {
		this.courseTakenDao = courseTakenDao; 
	}
	
	@Override
	public List<CourseTaken> getAll() {
		return courseTakenDao.getAll();
	}

	@Override
	public void add(CourseTaken courseTaken) {
		this.courseTakenDao.add(courseTaken);
		
	}

	@Override
	public void update(CourseTaken courseTaken) {
		this.courseTakenDao.update(courseTaken);
	}

	@Override
	public void delete(CourseTaken courseTaken) {
		this.courseTakenDao.delete(courseTaken);
	}

}
