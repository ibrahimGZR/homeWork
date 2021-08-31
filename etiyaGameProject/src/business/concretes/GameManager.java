package business.concretes;

import java.util.List;

import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class GameManager implements GameService{

	GameDao gameDao;
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
    public void add(Game game) {
        System.out.println(game.getName() + " Eklendi");
        this.gameDao.add(game);
    }

    @Override
    public List<Game> getAll() {
        System.out.println(" Listelendi");
        return this.gameDao.getAll();
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " Güncellendi");
        this.gameDao.update(game);
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " Silindi");
        this.gameDao.delete(game);
    }

}
