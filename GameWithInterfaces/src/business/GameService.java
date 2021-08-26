package business;

import entities.Game;

public interface GameService {
	void add(Game game);
	void list();
	void update(Game game);
	void delete(Game game);
}
