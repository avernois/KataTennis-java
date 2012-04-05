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
		if (playerAScore.equals("15"))
			playerAScore = "30";
		else
			playerAScore = "15";
	}

	public void playerBScores() {
		if (playerBScore.equals("15"))
			playerBScore = "30";
		else
			playerBScore = "15";
	}
}