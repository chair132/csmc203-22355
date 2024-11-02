/* 
 * Class: CMSC203  22355
 * Instructor: David Kuijt
 * Description: Define the tests for the Property object
 * Due: 11/03/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently.  
 * I have not copied the code from a student or any source.  
 * I have not given my code to any student. 
 * Print your Name here: ____John Vu______ 
*/ 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	Property property1, property2, property3, property4;

	@BeforeEach
	void setUp() throws Exception {
		property1 = new Property();
		property2 = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
		property3 = new Property("Property DEF", "Germantown", 1500.00, "Capital One", 1, 2, 3, 4);
		property4 = new Property(property1);
	}

	@AfterEach
	void tearDown() throws Exception {
		property1 = null;
		property2 = null;
		property3 = null;
		property4 = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("", property1.getPropertyName());
		assertEquals("Property ABC", property2.getPropertyName());
		assertEquals("Property DEF", property3.getPropertyName());
		assertEquals("", property4.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(0.00, property1.getRentAmount());
		assertEquals(2450.00, property2.getRentAmount());
		assertEquals(1500.00, property3.getRentAmount());
		assertEquals(0.00, property4.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, property1.getPlot().getX());
		assertEquals(0, property1.getPlot().getY());
		assertEquals(1, property1.getPlot().getWidth());
		assertEquals(1, property1.getPlot().getDepth());
		
		assertEquals(0, property2.getPlot().getX());
		assertEquals(0, property2.getPlot().getY());
		assertEquals(1, property2.getPlot().getWidth());
		assertEquals(1, property2.getPlot().getDepth());

		assertEquals(1, property3.getPlot().getX());
		assertEquals(2, property3.getPlot().getY());
		assertEquals(3, property3.getPlot().getWidth());
		assertEquals(4, property3.getPlot().getDepth());
		
		assertEquals(0, property4.getPlot().getX());
		assertEquals(0, property4.getPlot().getY());
		assertEquals(1, property4.getPlot().getWidth());
		assertEquals(1, property4.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals(",,,0.0",property1.toString());	
		assertEquals("Property ABC,Rockville,Wells Fargo Bank,2450.0",property2.toString());
		assertEquals("Property DEF,Germantown,Capital One,1500.0",property3.toString());
		assertEquals(",,,0.0",property4.toString());
	}
}
