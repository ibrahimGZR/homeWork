package etiyaGames;

import java.util.ArrayList;

public class GameCategoryService {
	
	ArrayList<GameCategory> gameCategories = new ArrayList<GameCategory>();
	
	public void add(GameCategory gameCategory) {
		gameCategories.add(gameCategory);
	}
	
	public ArrayList<GameCategory> getAll() {
		
		Game game1 = new Game();
		game1.setGameName("Valorant");
		game1.setGamePrice(50);
		
		Game game2 = new Game();
		game2.setGameName("CS:GO");
		game2.setGamePrice(30);
		
		ArrayList<Game> games = new ArrayList<Game>();
		games.add(game1);
		games.add(game2);
		
		GameCategory gameCategory = new GameCategory();
		gameCategory.setId(1);
		gameCategory.setGameCategoryName("Fps");
		gameCategory.setGames(games);
		
		this.gameCategories.add(gameCategory);
		
		return this.gameCategories;
	}

}
