package dataAccess;

import entities.Game;

public class GameDao implements GameDaoRepository {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Eklendi");

	}

	@Override
	public void list() {
		System.out.println("Listelendi");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Güncellendi");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Silindi");

	}

}
