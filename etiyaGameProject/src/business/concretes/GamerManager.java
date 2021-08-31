package business.concretes;

import java.util.List;

import business.abstracts.GamerService;
import core.UserIdentityValidatorService;
import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {

	GamerDao gamerDao;
	UserIdentityValidatorService userIdentityValidatorService;

	public GamerManager(UserIdentityValidatorService userIdentityValidatorService, GamerDao gamerDao) {
		super();
		this.userIdentityValidatorService = userIdentityValidatorService;
		this.gamerDao = gamerDao;
	}

	@Override
	public void add(Gamer gamer) {
		if (userIdentityValidatorService.isValid(gamer)) {
			System.out.println("Oyuncu eklendi : " + gamer.getFirstName());
			this.gamerDao.add(gamer);
		}

	}

	@Override
	public List<Gamer> getAll() {
		System.out.println("Oyuncular listelendi : ");
		return this.gamerDao.getAll();
	}

	@Override
	public void update(Gamer gamer) {
		if (userIdentityValidatorService.isValid(gamer)) {
			System.out.println("Oyuncu güncellendi : " + gamer.getFirstName());
			this.gamerDao.update(gamer);
		}

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
		this.gamerDao.delete(gamer);
	}

}
