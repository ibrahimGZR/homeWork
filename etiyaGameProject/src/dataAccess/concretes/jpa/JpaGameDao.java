package dataAccess.concretes.jpa;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class JpaGameDao implements GameDao {

	List<Game> games;

	public JpaGameDao() {
		super();
		this.games = new ArrayList<Game>();
	}

	@Override
	public void add(Game entity) {
		this.games.add(entity);

	}

	@Override
	public List<Game> getAll() {

		return this.games;
	}

	@Override
	public void update(Game entity) {
		int index = this.games.indexOf(entity);

		Game game = this.games.get(index);

		game.setId(entity.getId());
		game.setName(entity.getName());
		game.setUnitPrice(entity.getUnitPrice());

	}

	@Override
	public void delete(Game entity) {
		this.games.remove(entity);

	}

}
