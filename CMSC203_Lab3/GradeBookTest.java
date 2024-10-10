import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook a;
	private GradeBook b;
	@BeforeEach
	void setUp() throws Exception {
		a = new GradeBook(5);
		b = new GradeBook(5);
		
		a.addScore(80);
		a.addScore(70);
		a.addScore(75);
		
		b.addScore(80);
		b.addScore(90);
		

	}

	@AfterEach
	void tearDown() throws Exception {
		
		a = null;
		b = null;
	}

	@Test
	void testAddScore() {
		
		assertTrue(a.toString().equals("80.0 70.0 75.0 "));
		assertEquals(a.getScoreSize(), 3);
		
		assertTrue(b.toString().equals("80.0 90.0 "));
		assertEquals(b.getScoreSize(), 2);
		
	}

	@Test
	void testSum() {
		assertEquals(a.sum(), 225, 0.001);
		assertEquals(b.sum(), 170, 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(a.minimum(), 70, 0.001);
		assertEquals(b.minimum(), 80, 0.001);
		
	}

	@Test
	void testFinalScore() {
		assertEquals(a.finalScore(), 155, 0.001);
		assertEquals(b.finalScore(),  90, 0.001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(a.getScoreSize(), 3);
		assertEquals(b.getScoreSize(), 2);
	}

	@Test
	void testToString() {
		assertTrue(a.toString().equals("80.0 70.0 75.0 "));
		assertTrue(b.toString().equals("80.0 90.0 "));
		
	}

}
