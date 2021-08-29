package business.concretes;

import business.abstracts.GamerService;
import core.UserIdentityValidatorService;
import entities.Gamer;

public class GamerManager implements GamerService {

	UserIdentityValidatorService userIdentityValidatorService;

	public GamerManager(UserIdentityValidatorService userIdentityValidatorService) {
		super();
		this.userIdentityValidatorService = userIdentityValidatorService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userIdentityValidatorService.isValid(gamer)) {
			System.out.println("Oyuncu eklendi : " + gamer.getFirstName());
		}

	}

	@Override
	public void getAll() {
		System.out.println("Oyuncular listelendi : ");

	}

	@Override
	public void update(Gamer gamer) {
		if (userIdentityValidatorService.isValid(gamer)) {
			System.out.println("Oyuncu güncellendi : " + gamer.getFirstName());
		}

	}

	@Override
	public void delete(Gamer gamer) {
			System.out.println("Oyuncu silindi : " + gamer.getFirstName());
		

	}

}
