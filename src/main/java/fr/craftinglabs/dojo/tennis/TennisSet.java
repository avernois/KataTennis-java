package fr.craftinglabs.dojo.tennis;

public class TennisSet {

	private String playerAScore = "0";
	private String playerBScore = "0";

	public String score() {
		if (playerAScore.equals(playerBScore))
			return playerAScore + " A";
		return playerAScore + " - " + playerBScore;
	}

	public void playerAScores() {
		playerAScore = "15";
	}

	public void playerBScores() {
		playerBScore = "15";
	}
}