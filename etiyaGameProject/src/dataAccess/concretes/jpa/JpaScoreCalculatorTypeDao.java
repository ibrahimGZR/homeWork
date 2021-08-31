package dataAccess.concretes.jpa;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ScoreCalculatorTypeDao;
import entities.concretes.ScoreCalculatorType;

public class JpaScoreCalculatorTypeDao implements ScoreCalculatorTypeDao {
	List<ScoreCalculatorType> scoreCalculatorTypes;

	public JpaScoreCalculatorTypeDao() {
		super();
		this.scoreCalculatorTypes = new ArrayList<ScoreCalculatorType>();
	}

	@Override
	public void add(ScoreCalculatorType entity) {
		this.scoreCalculatorTypes.add(entity);

	}

	@Override
	public List<ScoreCalculatorType> getAll() {

		return this.scoreCalculatorTypes;
	}

	@Override
	public void update(ScoreCalculatorType entity) {
		int index = this.scoreCalculatorTypes.indexOf(entity);

		ScoreCalculatorType scoreCalculatorType = this.scoreCalculatorTypes.get(index);

		scoreCalculatorType.setId(entity.getId());
		scoreCalculatorType.setName(entity.getName());
		scoreCalculatorType.setRate(entity.getRate());
	}

	@Override
	public void delete(ScoreCalculatorType entity) {
		this.scoreCalculatorTypes.remove(entity);

	}
}
