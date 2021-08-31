package dataAccess.concretes.jpa;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class JpaGamerDao implements GamerDao {
	List<Gamer> gamers;

	public JpaGamerDao() {
		super();
		this.gamers = new ArrayList<Gamer>();
	}

	@Override
	public void add(Gamer entity) {
		this.gamers.add(entity);

	}

	@Override
	public List<Gamer> getAll() {

		return this.gamers;
	}

	@Override
	public void update(Gamer entity) {
		int index = this.gamers.indexOf(entity);

		Gamer gamer = this.gamers.get(index);

		gamer.setId(entity.getId());
		gamer.setFirstName(entity.getFirstName());
		gamer.setLastName(entity.getLastName());
		gamer.setIdentityNumber(entity.getIdentityNumber());
		gamer.setYearOfBirth(entity.getYearOfBirth());
		gamer.setGender(entity.getGender());
		gamer.setGameScore(entity.getGameScore());
	}

	@Override
	public void delete(Gamer entity) {
		this.gamers.remove(entity);

	}
}
