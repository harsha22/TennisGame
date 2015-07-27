package TennisGame;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {
	
	@Test
	public void testCalculateScore() {

		TennisGame game = new TennisGame("h","l","211212121");
		assertEquals("30:30", game.scoreAt(4));
		assertEquals("40:30", game.scoreAt(5));
		assertEquals("Deuce", game.scoreAt(6));

		TennisGame game2 = new TennisGame("h","l","22222121");
		assertEquals("l Wins", game2.scoreAt(4));

		TennisGame game3 = new TennisGame("h","l","2121212122");
		assertEquals("Advantage:l", game3.scoreAt(9));
	}
}
 
