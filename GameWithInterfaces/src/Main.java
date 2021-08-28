import java.util.ArrayList;

import business.CampaignManager;
import business.CustomerManager;
import business.GameManager;
import business.SalesManager;
import core.MernisCheckAdapter;
import dataAccess.CampaignDao;
import dataAccess.CampaignDaoRepository;
import dataAccess.CustomerDao;
import dataAccess.CustomerDaoRepository;
import dataAccess.GameDao;
import dataAccess.SalesDao;
import entities.Campaign;
import entities.Customer;
import entities.Game;
import entities.Sales;

public class Main {

	public static void main(String[] args) {

		Game game1 = new Game(1, "CS:GO", 100);
		Game game2 = new Game(2, "LOL", 50);

		ArrayList<Game> games = new ArrayList<Game>();
		games.add(game1);

		GameManager gameManager = new GameManager(new GameDao());
		gameManager.add(game2);
		gameManager.list();

		System.out.println("-------------------------------------------------");

		Customer customer1 = new Customer(1, "İbrahim", "Gezer", "1992", "11111111111");
		CustomerManager customerManager = new CustomerManager(new CustomerDao(), new MernisCheckAdapter());
		customerManager.add(customer1);

		System.out.println("-------------------------------------------------");

		Campaign campaign1 = new Campaign(1, "Yaz indirimi", 15);
		Campaign campaign2 = new Campaign(2, "Kış indirimi", 30);
		CampaignManager campaignManager = new CampaignManager(new CampaignDao());
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);

		System.out.println("-------------------------------------------------");

		Sales sales1 = new Sales(1, games, customer1, campaign2);
		SalesManager salesManager = new SalesManager(new SalesDao());
		salesManager.add(sales1);
	}
	
	
	
	
	

}
