package TennisGame;

import java.util.ArrayList;
import java.util.List;

public class TennisGame {

	private List<Integer> firstPlayerScore;
	private List<Integer> secondPlayerScore;
	private static final int[] scoreList = { 0, 15, 30, 40 };
	private static String DEUCE = "Deuce";
	private static String ADVANTAGE = "Advantage";
	private static String SEPARATOR = ":";
	private String playerOneName;
	private String playerTwoName;

	public TennisGame(String playerOneName, String playerTwoName, String scoreString) {
		firstPlayerScore = new ArrayList<Integer>();
		secondPlayerScore = new ArrayList<Integer>();
		firstPlayerScore.add(new Integer(0));
		secondPlayerScore.add(new Integer(0));
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
		calculateScore(scoreString);
	}

	public String scoreAt(int index) {
		int playerOneScore = firstPlayerScore.get(index);
		int playerTwoScore = secondPlayerScore.get(index);
		String displayValue = "";
		boolean isWin = (playerOneScore > 3 || playerTwoScore > 3) && Math.abs(playerOneScore - playerTwoScore) >= 2;
		boolean isDeuce = (playerOneScore > 2 && playerTwoScore > 2) && playerOneScore == playerTwoScore;
		boolean isAdvantage = (playerOneScore > 2 && playerTwoScore > 2)
				&& Math.abs(playerOneScore - playerTwoScore) == 1;
		if (isWin) {
			displayValue = playerInLead(playerOneScore, playerTwoScore) + " Wins";
		} else if (isDeuce) {
			displayValue = DEUCE;
		} else if (isAdvantage) {
			displayValue = ADVANTAGE + SEPARATOR + playerInLead(playerOneScore, playerTwoScore);
		} else {
			displayValue = scoreList[playerOneScore] + SEPARATOR + scoreList[playerTwoScore];
		}
		return displayValue;
	}

	private String playerInLead(int player1score, int player2score) {
		return player1score > player2score ? this.playerOneName : this.playerTwoName;
	}

	private void calculateScore(String scoreString) {
		String score = scoreString.toLowerCase();
		int d_playerScore = 0;
		int f_playerScore = 0;
		for (int i = 0; i < score.length(); i++) {
			if (score.charAt(i) == '1') {
				d_playerScore++;
			}
			if (score.charAt(i) == '2') {
				f_playerScore++;
			}
			firstPlayerScore.add(new Integer(d_playerScore));
			secondPlayerScore.add(new Integer(f_playerScore));

		}
	}
}
