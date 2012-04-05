package fr.craftinglabs.dojo.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TennisSetTest {

		@Test
		public void testLoveAll() {
			TennisSet game = new TennisSet();
			
			assertEquals("0 A", game.score());
		}
		
		@Test
		public void testFifteenZero() {
			TennisSet game = new TennisSet();
			
			game.playerAScores();
			
			assertEquals("15 - 0", game.score());
		}
}
