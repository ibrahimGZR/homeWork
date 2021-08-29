package business.abstracts;

import entities.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void getAll();
	void update(Gamer gamer);
	void delete(Gamer gamer);
	
}
