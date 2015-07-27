package TennisGame;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {
	
	@Test
	public void testCalculateScore() {
		TennisGame game = new TennisGame("dffdfdfdf");
		List<Integer> firstScore = game.getFirstPlayerScore();
		List<Integer> secondScore = game.getSecondPlayerScore();
		assertEquals(2,firstScore.get(4).intValue());
		assertEquals(3,secondScore.get(5).intValue());
		assertEquals(10,firstScore.size());
		TennisGame game2 = new TennisGame("");
		assertEquals(0,firstScore.get(0).intValue());
		
	}

}
