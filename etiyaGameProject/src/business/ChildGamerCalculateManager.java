package business;

import entities.Gamer;

public class ChildGamerCalculateManager implements BaseCalculateService{

	
		@Override
		public void calculateScore(Gamer gamer) {
			System.out.println("100 puan");
		}
}
