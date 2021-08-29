package business.concretes;

import business.abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
    public void add(Game game) {
        System.out.println(game.getName() + " Eklendi");

    }

    @Override
    public void getAll() {
        System.out.println(" Listelendi");

    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " Güncellendi");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " Silindi");

    }

}
