package fr.craftinglabs.dojo.tennis;

public class TennisGame {

	private int playerAScore = 0;
	private int playerBScore = 0;

	public String score() {
		
		if (hasAWinner())
			return playerWithHighestScore() + " wins !";
		
		if (playerAScore == playerBScore) 
			return equalityScore();

		if (hasAPlayerAdvantage()) 
			return "Advantage " + playerWithHighestScore();
		
		return  translate(playerAScore) + " - " + translate(playerBScore);
	}

	public void playerAScores() {
		playerAScore++;
	}

	public void playerBScores() {
		playerBScore++;
	}

	private String playerWithHighestScore() {
		if (playerAScore > playerBScore)
			return "Player A";
		else
			return "Player B";
	}

	private boolean hasAWinner() {
		return (playerAScore >= 4 || playerBScore >= 4) && (Math.abs(playerBScore - playerAScore) >= 2);
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