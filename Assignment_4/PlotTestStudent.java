/* 
 * Class: CMSC203  22355
 * Instructor: David Kuijt
 * Description: Define the tests for the plot, composing of primitives that define x, y, width, and depth
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

public class PlotTestStudent {
	Plot plot1, plot2, plot3;
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot();
		plot2 = new Plot(0, 0, 3, 4);
		plot3 = new Plot(plot1);
		plot3.setX(4);
		plot3.setY(3);
		plot3.setWidth(2);
		plot3.setDepth(4);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		plot1 = null;
		plot2 = null;
		plot3 = null;
	}
	
	@Test
	void testOverlaps() {
		assertTrue(plot1.overlaps(plot2));
		assertFalse(plot2.overlaps(plot3));
		assertFalse(plot1.overlaps(plot3));
	}
	@Test
	void testEncompasses() {
		assertTrue(plot2.encompasses(plot1));
		assertFalse(plot2.encompasses(plot3));
		assertFalse(plot1.encompasses(plot3));
	}
	@Test
	void testGetX() {
		assertEquals(plot1.getX(), 0);
		assertEquals(plot2.getX(), 0);
		assertEquals(plot3.getX(), 4);
	}
	@Test
	void testGetY() {
		assertEquals(plot1.getY(), 0);
		assertEquals(plot2.getY(), 0);
		assertEquals(plot3.getY(), 3);
	}
	@Test
	void testGetWidth() {
		assertEquals(plot1.getWidth(), 1);
		assertEquals(plot2.getWidth(), 3);
		assertEquals(plot3.getWidth(), 2);
	}
	
	@Test
	void testGetDepth() {
		assertEquals(plot1.getWidth(), 1);
		assertEquals(plot2.getDepth(), 4);
		assertEquals(plot3.getDepth(), 4);
	}
	
	@Test
	void testSetX() {
		plot1.setX(4);
		assertEquals(plot1.getX(), 4);
		plot2.setX(5);
		assertEquals(plot2.getX(), 5);
		plot3.setX(6);
		assertEquals(plot3.getX(), 6);
	}
	
	@Test
	void testSetY() {
		plot1.setY(2);
		assertEquals(plot1.getY(), 2);
		plot2.setY(1);
		assertEquals(plot2.getY(), 1);
		plot3.setY(3);
		assertEquals(plot3.getY(), 3);
	}
	
	@Test
	void testSetWidth() {
		plot1.setWidth(4);
		assertEquals(plot1.getWidth(), 4);
		plot2.setWidth(2);
		assertEquals(plot2.getWidth(), 2);
		plot3.setWidth(3);
		assertEquals(plot3.getWidth(), 3);
	}
	
	@Test
	void testSetDepth() {
		plot1.setDepth(5);
		assertEquals(plot1.getDepth(), 5);
		plot2.setDepth(3);
		assertEquals(plot2.getDepth(), 3);
		plot3.setDepth(4);
		assertEquals(plot3.getDepth(), 4);
	}
	
	@Test
	void testToString() {
		assertTrue(plot1.toString().equals("0,0,1,1"));
		assertTrue(plot2.toString().equals("0,0,3,4"));
		assertTrue(plot3.toString().equals("4,3,2,4"));
	}
	
}
