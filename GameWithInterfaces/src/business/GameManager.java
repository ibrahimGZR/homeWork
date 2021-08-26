package business;

import dataAccess.GameDaoRepository;
import entities.Game;

public class GameManager implements GameService{

	GameDaoRepository gameDaoRepository;
	
	public GameManager(GameDaoRepository gameDaoRepository) {
		super();
		this.gameDaoRepository = gameDaoRepository;
	}

	@Override
	public void add(Game game) {
		gameDaoRepository.add(game);
		
	}

	@Override
	public void list() {
		gameDaoRepository.list();
		
	}

	@Override
	public void update(Game game) {
		gameDaoRepository.update(game);
		
	}

	@Override
	public void delete(Game game) {
		gameDaoRepository.delete(game);
		
	}

}
