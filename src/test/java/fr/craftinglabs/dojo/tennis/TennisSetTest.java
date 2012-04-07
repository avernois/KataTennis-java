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
		playGame(1, 0);

		assertEquals("15 - 0", game.score());
	}
	
	@Test
	public void testZeroFifteen() {
		playGame(0, 1);

		assertEquals("0 - 15", game.score());
	}
	
	@Test
	public void testFifteenA() {
		playGame(1, 1);
		
		assertEquals("15 A", game.score());
	}
	
	@Test 
	public void testThirteenZero() {
		playGame(2, 0);
		
		assertEquals("30 - 0", game.score());
	}
	
	@Test 
	public void testZeroThirteen() {
		playGame(0, 2);
		
		assertEquals("0 - 30", game.score());
	}
	
	@Test 
	public void testFourteenA() {
		playGame(3, 3);
		
		assertEquals("40 A", game.score());
	}
	
	@Test
	public void testAdvantagePlayerA() {
		playGame(4, 3);
		
		assertEquals("Advantage Player A", game.score());
	}
	
	@Test
	public void testAdvantagePlayerV() {
		playGame(3, 4);
		
		assertEquals("Advantage Player B", game.score());
	}
	
	private void playGame(int playerAScore, int playerBScore) {
		for(int i = 0; i < playerAScore; i++)
			game.playerAScores();
		
		for(int i = 0; i < playerBScore; i++)
			game.playerBScores();
		
	}
}
