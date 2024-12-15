/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Tests the template for smoothie beverages 
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

class SmoothieTestStudent {
	Smoothie smoothie1, smoothie2, smoothie3;
	@BeforeEach
	void setUp() throws Exception {
		smoothie1 = new Smoothie("Fruit blend", Size.MEDIUM, 4, true);
		smoothie2 = new Smoothie("Fruit blend", Size.MEDIUM, 4, true);
		smoothie3 = new Smoothie("Blueberry", Size.LARGE, 1, false);
	}

	@AfterEach
	void tearDown() throws Exception {
		smoothie1 = smoothie2 = smoothie3 = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(smoothie1.calcPrice(), 6.00, 0.0001);
		assertEquals(smoothie2.calcPrice(), 6.00, 0.0001);
		assertEquals(smoothie3.calcPrice(), 3.50, 0.0001);
	}
	
	@Test
	void testEquals() {
		assertTrue(smoothie1.equals(smoothie2));
		assertFalse(smoothie1.equals(smoothie3));
	}
	
	@Test
	void testGetAddProtein() {
		assertTrue(smoothie1.getAddProtein());
		assertTrue(smoothie2.getAddProtein());
		assertFalse(smoothie3.getAddProtein());
	}
	
	@Test
	void testGetNumOfFruits() {
		assertEquals(smoothie1.getNumOfFruits(), 4);
		assertEquals(smoothie2.getNumOfFruits(), 4);
		assertEquals(smoothie3.getNumOfFruits(), 1);
	}
	
	@Test
	void testToString() {
		assertTrue((smoothie1.toString()).equals("Fruit blend,MEDIUM,true,4,6.00"));
		assertTrue((smoothie2.toString()).equals("Fruit blend,MEDIUM,true,4,6.00"));
		assertTrue((smoothie3.toString()).equals("Blueberry,LARGE,false,1,3.50"));
	}

}
