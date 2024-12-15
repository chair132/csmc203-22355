/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Tests the template for alcohol beverages 
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	Alcohol alcohol1, alcohol2, alcohol3;
	@BeforeEach
	void setUp() throws Exception {
		alcohol1 = new Alcohol("Blue Lagoon", Size.MEDIUM, true);
		alcohol2 = new Alcohol("Blue Lagoon", Size.MEDIUM, true);
		alcohol3 = new Alcohol("Pina Colada", Size.LARGE, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		alcohol1 = alcohol2 = alcohol3 = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(alcohol1.calcPrice(), 3.10, 0.0001);
		assertEquals(alcohol2.calcPrice(), 3.10, 0.0001);
		assertEquals(alcohol3.calcPrice(), 3.00, 0.0001);
	}
	
	@Test
	void testEquals() {
		assertTrue(alcohol1.equals(alcohol2));
		assertFalse(alcohol1.equals(alcohol3));
	}
	
	@Test
	void testIsWeekend() {
		assertTrue(alcohol1.isWeekend());
		assertTrue(alcohol2.isWeekend());
		assertFalse(alcohol3.isWeekend());
	}
	
	@Test
	void testToString() {
		assertTrue((alcohol1.toString()).equals("Blue Lagoon,MEDIUM,true,3.10"));
		assertTrue((alcohol2.toString()).equals("Blue Lagoon,MEDIUM,true,3.10"));
		assertTrue((alcohol3.toString()).equals("Pina Colada,LARGE,false,3.00"));
	}

}
