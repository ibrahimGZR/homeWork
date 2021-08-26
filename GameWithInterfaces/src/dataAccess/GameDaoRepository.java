package dataAccess;

import entities.Game;

public interface GameDaoRepository {
	void add(Game game);
	void list();
	void update(Game game);
	void delete(Game game);
}
