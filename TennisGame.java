package TennisGame;

import java.util.ArrayList;
import java.util.List;

public class TennisGame {

	private List<Integer> firstPlayerScore;
	private List<Integer> secondPlayerScore;

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
