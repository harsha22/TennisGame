package TennisGame;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {
	
	@Test
	public void testCalculateScore() {
		TennisGame game = new TennisGame("h","l","122121212");
		assertEquals("30:30", game.scoreAt(4));
		assertEquals("30:40", game.scoreAt(5));
		assertEquals("Deuce", game.scoreAt(6));
	}
}
