package business.abstracts;

import entities.GamePlayed;

public interface GamePlayedService {
	void add(GamePlayed gamePlayed);
	void getAll();
	void update(GamePlayed gamePlayed);
	void delete(GamePlayed gamePlayed);
}
