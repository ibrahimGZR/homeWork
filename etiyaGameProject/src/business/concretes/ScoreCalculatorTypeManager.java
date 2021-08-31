package business.concretes;

import java.util.List;

import business.abstracts.ScoreCalculatorTypeService;
import dataAccess.abstracts.ScoreCalculatorTypeDao;
import entities.concretes.ScoreCalculatorType;

public class ScoreCalculatorTypeManager implements ScoreCalculatorTypeService {

	ScoreCalculatorTypeDao scoreCalculatorTypeDao;

	public ScoreCalculatorTypeManager(ScoreCalculatorTypeDao scoreCalculatorTypeDao) {
		super();
		this.scoreCalculatorTypeDao = scoreCalculatorTypeDao;
	}

	@Override
	public void add(ScoreCalculatorType entity) {
		System.out.println(entity.getName() + " Eklendi");
		this.scoreCalculatorTypeDao.add(entity);
	}

	@Override
	public List<ScoreCalculatorType> getAll() {
		System.out.println("Listelendi");
		return this.scoreCalculatorTypeDao.getAll();
	}

	@Override
	public void update(ScoreCalculatorType entity) {
		System.out.println(entity.getName() + " Güncellendi");
		this.scoreCalculatorTypeDao.update(entity);
	}

	@Override
	public void delete(ScoreCalculatorType entity) {
		System.out.println(entity.getName() + " Silindi");
		this.scoreCalculatorTypeDao.delete(entity);
	}

}
