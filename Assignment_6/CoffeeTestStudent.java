/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Tests the template for coffee beverages 
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

class CoffeeTestStudent {
	Coffee coffee1, coffee2, coffee3;
	@BeforeEach
	void setUp() throws Exception {
		coffee1 = new Coffee("Latte", Size.SMALL, true, true);
		coffee2 = new Coffee("Latte", Size.SMALL, true, true);
		coffee3 = new Coffee("Mocha", Size.LARGE, false, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		coffee1 = coffee2 = coffee3 = null; 
	}

	@Test
	void testCalcPrice() {
		assertEquals(coffee1.calcPrice(), 3.00, 0.0001);
		assertEquals(coffee2.calcPrice(), 3.00, 0.0001);
		assertEquals(coffee3.calcPrice(), 3.00, 0.0001);
	}
	
	@Test
	void testEquals() {
		assertTrue(coffee1.equals(coffee2));
		assertFalse(coffee1.equals(coffee3));
	}
	
	@Test
	void testGetExtraShot() {
		assertTrue(coffee1.getExtraShot());
		assertTrue(coffee2.getExtraShot());
		assertFalse(coffee3.getExtraShot());
	}
	
	@Test
	void testGetExtraSyrup() {
		assertTrue(coffee1.getExtraSyrup());
		assertTrue(coffee2.getExtraSyrup());
		assertFalse(coffee3.getExtraSyrup());
	}
	
	@Test
	void testToString() {
		assertTrue((coffee1.toString()).equals("Latte,SMALL,true,true,3.00"));
		assertTrue((coffee2.toString()).equals("Latte,SMALL,true,true,3.00"));
		assertTrue((coffee3.toString()).equals("Mocha,LARGE,false,false,3.00"));
	}

}
