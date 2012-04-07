package fr.craftinglabs.dojo.tennis;

public class TennisSet {

	private int playerAScore = 0;
	private int playerBScore = 0;

	public String score() {
		String score;
		
		if (playerAScore == playerBScore) {
			score = translate(playerAScore) + " A";
		} else {
			if (hasPlayerAAdvantage()) {
				score = "Advantage Player A";
			} else if (hasPlayerBAdvantage()) {
				score = "Advantage Player B";
			}
			else {
				score = translate(playerAScore) + " - " + translate(playerBScore);
			}
		}
	
		return score;
	}

	private boolean hasPlayerAAdvantage() {
		return playerAScore >= 4 && playerAScore > playerBScore;
	}
	
	private boolean hasPlayerBAdvantage() {
		return playerBScore >= 4 && playerBScore > playerAScore;
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
		case 3:
			return "40";
		default:
			throw new IllegalArgumentException();
		}
	}
}