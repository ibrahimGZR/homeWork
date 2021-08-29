package business.abstracts;

import entities.Game;

public interface GameService {
	void add(Game game);
	void getAll();
	void update(Game game);
	void delete(Game game);
}
