
import business.abstracts.CampaignService;
import business.abstracts.GamePlayedService;
import business.abstracts.GameService;
import business.abstracts.GamerService;
import business.abstracts.SalesService;
import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.GamePlayedManager;
import business.concretes.GamerManager;
import business.concretes.SalesManager;
import core.mernisServiceAdapter;
import entities.Campaign;
import entities.Game;
import entities.GamePlayed;
import entities.Gamer;
import entities.Sales;
import entities.ScoreCalculatorType;

public class Main {

	public static void main(String[] args) {
Campaign campaign1 = new Campaign(1,"Yaz Indirimi",40);
        
        
        Game game1 = new Game(1, "CS:GO", 100);
        Game game2 = new Game(1, "Lol", 150);
        
        Gamer gamer1 = new Gamer(1, "Gizem", "Özgün", "1111111111", 1998, "Kız", 95);
        Gamer gamer2 = new Gamer(2, "İbrahim", "Gezer", "10000000", 1992, "Erkek", 90);
        Gamer gamer3 = new Gamer(2, "Çocuk", "çck", "10000000", 2017, "Kız", 80);
        Gamer gamer4 = new Gamer(2, "Yaşlı", "yşl", "10000000", 1960, "Erkek", 100);
        
        
        Sales sales1 = new Sales(1, game1, gamer1, campaign1);
        
        ScoreCalculatorType scoreCalculatorType1 = new ScoreCalculatorType(1, "woman", 70);
        ScoreCalculatorType scoreCalculatorType2 = new ScoreCalculatorType(2, "man", 70);
        ScoreCalculatorType scoreCalculatorType3 = new ScoreCalculatorType(3, "child", 100);
        ScoreCalculatorType scoreCalculatorType4 = new ScoreCalculatorType(4, "elder", 90);
        
        
        
        GamePlayed gamePlayed1 = new GamePlayed(1, gamer1, game1,scoreCalculatorType1);
        GamePlayed gamePlayed2 = new GamePlayed(2,gamer2, game2, scoreCalculatorType2);
        GamePlayed gamePlayed3 = new GamePlayed(3,gamer3, game2, scoreCalculatorType3);
        GamePlayed gamePlayed4 = new GamePlayed(4,gamer4, game1, scoreCalculatorType4);
        
        
        GamePlayedService gamePlayedService = new GamePlayedManager();
        gamePlayedService.add(gamePlayed1);
        
        GamePlayedService gamePlayedService2 = new GamePlayedManager();
        
        gamePlayedService2.add(gamePlayed2);
        
        GamePlayedService gamePlayedService3 = new GamePlayedManager();
        gamePlayedService3.add(gamePlayed3);
        
        GamePlayedService gamePlayedService4 = new GamePlayedManager();
        gamePlayedService4.add(gamePlayed4);
        
        System.out.println("-------------------------------------------------");
        
        GamerService gamerService = new GamerManager(new mernisServiceAdapter());
        gamerService.add(gamer1);
        System.out.println("-------------------------------------------------");
        
        GameService gameService = new GameManager();
        gameService.add(game1);
        gameService.add(game2);
        System.out.println("-------------------------------------------------");
        
        
        SalesService salesService = new SalesManager();
        salesService.add(sales1);
        System.out.println("-------------------------------------------------");
        
        CampaignService campaignService = new CampaignManager();
        campaignService.add(campaign1);

    

	}

}
