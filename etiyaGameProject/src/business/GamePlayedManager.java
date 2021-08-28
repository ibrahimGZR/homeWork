package business;

import java.time.LocalDate;
import entities.GamePlayed;
import entities.Gamer;

public class GamePlayedManager implements GamePlayedService {

	BaseCalculateService baseCalculateService;

	public GamePlayedManager(BaseCalculateService baseCalculateService) {
		super();
		this.baseCalculateService = baseCalculateService;
	}

	@Override
	public void add(GamePlayed gamePlayed) {
		Gamer gamer = gamePlayed.getGamer();
		if (LocalDate.now().getYear() - gamePlayed.getGamer().getYearOfBirth() > 70) {
			System.out.println("Oynanan oyun : " + gamePlayed.getGame().getName() + " Oynayan oyuncu : "
					+ gamePlayed.getGamer().getFirstName() + " Hesaplanan puanı : ");
			baseCalculateService.calculateScore(gamer);
		}
		if (LocalDate.now().getYear() - gamePlayed.getGamer().getYearOfBirth() < 70
				&& LocalDate.now().getYear() - gamePlayed.getGamer().getYearOfBirth() > 18) {
			System.out.println("Oynanan oyun : " + gamePlayed.getGame().getName() + " Oynayan oyuncu : "
					+ gamePlayed.getGamer().getFirstName() + " Hesaplanan puanı : ");
			baseCalculateService.calculateScore(gamer);
		}
		if (LocalDate.now().getYear() - gamePlayed.getGamer().getYearOfBirth() < 18) {
			System.out.println("Oynanan oyun : " + gamePlayed.getGame().getName() + " Oynayan oyuncu : "
					+ gamePlayed.getGamer().getFirstName() + " Hesaplanan puanı : ");
			baseCalculateService.calculateScore(gamer);
		}
		

	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GamePlayed gamePlayed) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(GamePlayed gamePlayed) {
		// TODO Auto-generated method stub

	}

}
