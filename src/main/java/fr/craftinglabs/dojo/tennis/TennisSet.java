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
		playerAScore = increment(playerAScore);
	}

	public void playerBScores() {
		playerBScore = increment(playerBScore);
	}
	
	private String increment(String score) {
		if (score.equals("15"))
			return "30";
		else
			return "15";
	}
}