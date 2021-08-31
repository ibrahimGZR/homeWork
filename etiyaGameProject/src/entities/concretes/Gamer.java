package entities.concretes;

import entities.abstracts.Entity;

public class Gamer extends User implements Entity{
	private String gender;
	private double gameScore;

	public Gamer() {
		super();
	}

	public Gamer(int id, String firstName, String lastName, String identityNumber, int yearOfBirth, String gender,double gameScore) {
		super(id, firstName, lastName, identityNumber, yearOfBirth);
		this.gender = gender;
		this.gameScore = gameScore;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getGameScore() {
		return gameScore;
	}

	public void setGameScore(double gameScore) {
		this.gameScore = gameScore;
	}
}
