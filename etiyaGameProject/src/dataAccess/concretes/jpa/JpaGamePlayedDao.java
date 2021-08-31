package dataAccess.concretes.jpa;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.GamePlayedDao;
import entities.concretes.GamePlayed;

public class JpaGamePlayedDao implements GamePlayedDao {
	List<GamePlayed> gamePlayeds;

	public JpaGamePlayedDao() {
		super();
		this.gamePlayeds = new ArrayList<GamePlayed>();
	}

	@Override
	public void add(GamePlayed entity) {
		this.gamePlayeds.add(entity);

	}

	@Override
	public List<GamePlayed> getAll() {

		return this.gamePlayeds;
	}

	@Override
	public void update(GamePlayed entity) {
		int index = this.gamePlayeds.indexOf(entity);

		GamePlayed gamePlayed = this.gamePlayeds.get(index);

		gamePlayed.setId(entity.getId());
		gamePlayed.setGame(entity.getGame());
		gamePlayed.setGamer(entity.getGamer());
		gamePlayed.setSoreCalculatorType(entity.getScoreCalculatorType());

	}

	@Override
	public void delete(GamePlayed entity) {
		this.gamePlayeds.remove(entity);

	}
}
