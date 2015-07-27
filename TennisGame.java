package TennisGame;

import java.util.ArrayList;
import java.util.List;

public class TennisGame {

	private List<Integer> firstPlayerScore;
	private List<Integer> secondPlayerScore;
	private static final int[] scoreList = {0, 15, 30, 40};
	private static String DEUCE = "Deuce";
	private static String ADVANTAGE = "Advantage";
	private static String SEPARATOR  = ":";
	
	public TennisGame(String scoreString) {
		firstPlayerScore = new ArrayList<Integer>();
		secondPlayerScore = new ArrayList<Integer>();
		calculateScore(scoreString);
	}

	public String scoreAt(int index) {
		return null;
	}

	private void calculateScore(String scoreString) {
		
	}
}
