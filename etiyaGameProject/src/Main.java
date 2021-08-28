
import business.ElderGamerCalculateManager;
import business.GamePlayedManager;
import business.GamePlayedService;
import business.ManGamerCalculateManager;
import entities.Game;
import entities.GamePlayed;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1, "CS:GO", 100);
		
		Gamer gamer1 = new Gamer(1, "ibrahim", "geezer", "1111111111", 1960, "erkek", 1);
		
		GamePlayed gamePlayed = new GamePlayed(1, gamer1, game1);
		
		GamePlayedService gamePlayedService = new GamePlayedManager(new ElderGamerCalculateManager());
		
		
		gamePlayedService.add(gamePlayed);

	}

}
