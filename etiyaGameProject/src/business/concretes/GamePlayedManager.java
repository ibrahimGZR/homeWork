package business.concretes;

import java.util.List;

import business.abstracts.GamePlayedService;
import dataAccess.abstracts.GamePlayedDao;
import entities.concretes.GamePlayed;

public class GamePlayedManager implements GamePlayedService {

	GamePlayedDao gamePlayedDao;
	public GamePlayedManager(GamePlayedDao gamePlayedDao) {
		super();
		this.gamePlayedDao = gamePlayedDao;
	}

	@Override
	public void add(GamePlayed gamePlayed) {
		this.printGameScore(gamePlayed);
		this.gamePlayedDao.add(gamePlayed);
	}

	@Override
	public List<GamePlayed> getAll() {
		System.out.println("Oynanış listelendi : ");
		return this.gamePlayedDao.getAll();
	}

	@Override
	public void update(GamePlayed gamePlayed) {
		System.out.println("Oynanış güncellendi : " + gamePlayed.getId());
		this.gamePlayedDao.update(gamePlayed);
	}

	@Override
	public void delete(GamePlayed gamePlayed) {
		System.out.println("Oynanış silindi : " + gamePlayed.getId());
		this.gamePlayedDao.delete(gamePlayed);
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
