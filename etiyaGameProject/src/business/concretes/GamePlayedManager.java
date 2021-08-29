package business.concretes;

import business.abstracts.GamePlayedService;
import entities.GamePlayed;

public class GamePlayedManager implements GamePlayedService {

	@Override
	public void add(GamePlayed gamePlayed) {
		this.printGameScore(gamePlayed);
	}

	@Override
	public void getAll() {
		System.out.println("Oynanış listelendi : ");

	}

	@Override
	public void update(GamePlayed gamePlayed) {
		System.out.println("Oynanış güncellendi : " + gamePlayed.getId());

	}

	@Override
	public void delete(GamePlayed gamePlayed) {
		System.out.println("Oynanış silindi : " + gamePlayed.getId());

	}

	public double calculateGameScore(GamePlayed gamePlayed) {
		double gameScore = gamePlayed.getGamer().getGameScore() * gamePlayed.getScoreCalculatorType().getRate() / 100;
		return gameScore;
	}

	public void printGameScore(GamePlayed gamePlayed) {
		System.out.println(
				"Oyun ismi : " + gamePlayed.getGame().getName() + 
				" Oyuncu ismi : " + gamePlayed.getGamer().getFirstName() + 
				" Oyuncu puanı : " + gamePlayed.getGamer().getGameScore()+ 
				" Hesaplanan puanı : " + this.calculateGameScore(gamePlayed));
	}

}
