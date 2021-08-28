package business;

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
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Gamer gamer) {
		if (userIdentityValidatorService.isValid(gamer)) {
			System.out.println("Oyuncu güncellendi : " + gamer.getFirstName());
		}

	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub

	}

}
