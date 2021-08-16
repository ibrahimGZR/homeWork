package etiyaGames;

public class Main {

	public static void main(String[] args) {

		GameService gameService = new GameService();
		Game game2 = new Game();
		game2.setGameName("Left 4 Death");
		game2.setGameType("Fps");
		game2.setGamePrice(50);

		gameService.add(game2);
		
		System.out.println("----------------OYUN LİSTESİ------------------");
		
		for (Game game : gameService.getAll()) {
			System.out.println(game.getGameName() + " - " + game.getGameType());
		}

		System.out.println("----------------------------------");
		
		UserService userService = new UserService();
		User user2 = new User();
		user2.setFirstName("Sadık");
		user2.setLastName("Sakin");
		user2.setAge(44);
		
		userService.add(user2);
		
		System.out.println("--------------KULLANICI LİSTESİ--------------------");
		
		for (User user : userService.getAll()) {
			System.out.println(user.getFirstName() + " - " + user.getLastName());
		}
	}

}
