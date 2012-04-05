package fr.craftinglabs.dojo.tennis;

public class TennisSet {

	private int playerAScore = 0;
	private int playerBScore = 0;

	public String score() {
		String score;
		
		if (playerAScore == playerBScore) {
			score = translate(playerAScore) + " A";
		} else {
			score = translate(playerAScore) + " - " + translate(playerBScore);
		}
	
		return score;
	}

	public void playerAScores() {
		playerAScore++;
	}

	public void playerBScores() {
		playerBScore++;
	}
	
	private String translate(int score) {
		switch(score) {
		case 0:
			return "0";
		case 1:
			return "15";
		case 2:
			return "30";
		default:
			throw new IllegalArgumentException();
		}
	}
}