package etiyaGames;

import java.util.ArrayList;

public class GameService {

	ArrayList<Game> games = new ArrayList<Game>();

	public void add(Game game) {
		System.out.println(game.getGameName() + " adlı oyun sisteme kaydedildi");
		this.games.add(game);

	}

	public ArrayList<Game> getAll() {

		Game game1 = new Game();
		game1.setGameName("CS:GO");
		game1.setGameType("Fps");
		game1.setGamePrice(35);

		this.games.add(game1);

		return this.games;
	}
}
