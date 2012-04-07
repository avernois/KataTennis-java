package fr.craftinglabs.dojo.tennis;

public class TennisSet {

	private int playerAScore = 0;
	private int playerBScore = 0;

	public String score() {
		String score;
		
		if (playerAScore == playerBScore) {
			score = equalityScore();
		} else {
			if (hasAPlayerAdvantage()) {
				score = "Advantage " + advantagedPlayer();
			} else {
				score = translate(playerAScore) + " - " + translate(playerBScore);
			}
		}
	
		return score;
	}

	private String equalityScore() {
		String score;
		if (playerAScore > 3) {
			score = "Deuce";
		} else {
			score = translate(playerAScore) + " A";
		}
		
		return score;
	}

	private boolean hasAPlayerAdvantage() {
		return playerAScore >= 4 || playerBScore >= 4;
	}
	
	private String advantagedPlayer() {
		if (playerAScore > playerBScore)
			return "Player A";
		else
			return "Player B";
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