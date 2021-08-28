package business;

import entities.Gamer;

public class ElderGamerCalculateManager implements BaseCalculateService{
	
	

	@Override
	public void calculateScore(Gamer gamer) {
		System.out.println("90 puan yaşlı");
	}
}
