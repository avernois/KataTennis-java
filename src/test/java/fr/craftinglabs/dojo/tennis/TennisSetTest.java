package fr.craftinglabs.dojo.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TennisSetTest {

	private TennisSet game;

	@Before
	public void setup() {
		game = new TennisSet();
	}
	
	@Test
	public void testLoveAll() {
		assertEquals("0 A", game.score());
	}

	@Test
	public void testFifteenZero() {
		game.playerAScores();

		assertEquals("15 - 0", game.score());
	}
	
	@Test
	public void testZeroFifteen() {
		game.playerBScores();

		assertEquals("0 - 15", game.score());
	}
	
	@Test
	public void testFifteenA() {
		game.playerAScores();
		game.playerBScores();
		
		assertEquals("15 A", game.score());
	}
	
	@Test 
	public void testThirteenZero() {
		game.playerAScores();
		game.playerAScores();
		
		assertEquals("30 - 0", game.score());
	}
}
