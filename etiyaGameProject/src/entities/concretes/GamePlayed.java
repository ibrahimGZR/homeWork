package entities.concretes;

import entities.abstracts.Entity;

public class GamePlayed implements Entity{
	private int id;
	private Gamer gamer;
	private Game game;
	private ScoreCalculatorType scoreCalculatorType;
	public GamePlayed(int id, Gamer gamer, Game game, ScoreCalculatorType scoreCalculatorType) {
		super();
		this.id = id;
		this.gamer = gamer;
		this.game = game;
		this.scoreCalculatorType = scoreCalculatorType;
	}
	public GamePlayed() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public ScoreCalculatorType getScoreCalculatorType() {
		return scoreCalculatorType;
	}
	public void setSoreCalculatorType(ScoreCalculatorType scoreCalculatorType) {
		this.scoreCalculatorType = scoreCalculatorType;
	}
}
