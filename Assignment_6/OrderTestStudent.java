/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Tests the template for one singular beverage order
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

class OrderTestStudent {
	Order order1, order2, order3;
	@BeforeEach
	void setUp() throws Exception {
		order1 = new Order(22, Day.SUNDAY, new Customer("John", 22));
		order2 = new Order(22, Day.SUNDAY, new Customer("John", 22));
		order3 = new Order(10, Day.THURSDAY, new Customer("Anthony", 16));
	}

	@AfterEach
	void tearDown() throws Exception {
		order1 = order2 = order3 = null;
	}

	//randomness with the order number is too complex to test
	
	@Test
	void testGetOrderTime() {
		assertEquals(order1.getOrderTime(), 22);
		assertEquals(order2.getOrderTime(), 22);
		assertEquals(order3.getOrderTime(), 10);
	}
	
	@Test
	void testGetOrderDay() {
		assertEquals(order1.getOrderDay(), Day.SUNDAY);
		assertEquals(order2.getOrderDay(), Day.SUNDAY);
		assertEquals(order3.getOrderDay(), Day.THURSDAY);
	}
	
	//did not implement an equals method for customer so getCustomer is complex to test
	
	@Test
	void testIsWeekend() {
		assertTrue(order1.isWeekend());
		assertTrue(order2.isWeekend());
		assertFalse(order3.isWeekend());
	}
	
	//testing addNewBeverage and getBeverage methods
	@Test
	void testAddNewBeverage() {
		//coffee
		order1.addNewBeverage("Latte", Size.SMALL, true, true);
		assertTrue(order1.getBeverage(0).equals(new Coffee("Latte", Size.SMALL, true, true)));
		//smoothie
		order2.addNewBeverage("Fruit blend", Size.MEDIUM, 4, true);
		assertTrue(order2.getBeverage(0).equals(new Smoothie("Fruit blend", Size.MEDIUM, 4, true)));
		//alcohol
		order3.addNewBeverage("Pina Colada", Size.LARGE);
		assertTrue(order3.getBeverage(0).equals(new Alcohol("Pina Colada", Size.LARGE, false)));
	}
	
	@Test
	void testGetTotalItems() {
		order1.addNewBeverage("Latte", Size.SMALL, true, true);
		order2.addNewBeverage("Fruit blend", Size.MEDIUM, 4, true);
		order3.addNewBeverage("Pina Colada", Size.LARGE);
		order3.addNewBeverage("Pina Colada", Size.LARGE);
		
		assertEquals(order1.getTotalItems(), 1);
		assertEquals(order2.getTotalItems(), 1);
		assertEquals(order3.getTotalItems(), 2);
	}
	
	@Test
	void testCalcOrderTotal() {
		order1.addNewBeverage("Latte", Size.SMALL, true, true);
		order2.addNewBeverage("Fruit blend", Size.MEDIUM, 4, true);
		order3.addNewBeverage("Pina Colada", Size.LARGE);
		order3.addNewBeverage("Pina Colada", Size.LARGE);
		
		assertEquals(order1.calcOrderTotal(), 3.00, 0.0001);
		assertEquals(order2.calcOrderTotal(), 6.00, 0.0001);
		assertEquals(order3.calcOrderTotal(), 6.00, 0.0001);
	}
	
	@Test
	void testFindNumOfBeveType() {
		order1.addNewBeverage("Latte", Size.SMALL, true, true);
		order1.addNewBeverage("Fruit blend", Size.MEDIUM, 4, true);
		order1.addNewBeverage("Pina Colada", Size.LARGE);
		order1.addNewBeverage("Blue Lagoon", Size.MEDIUM);
		
		assertEquals(order1.findNumOfBeveType(Type.ALCOHOL), 2);
	}
	
	@Test
	void testToString() {
		order1.addNewBeverage("Latte", Size.SMALL, true, true);
		order1.addNewBeverage("Fruit blend", Size.MEDIUM, 4, true);
		order1.addNewBeverage("Pina Colada", Size.LARGE);
		order1.addNewBeverage("Blue Lagoon", Size.MEDIUM);
		
		
		assertTrue(((order1.toString()).substring(5)).equals(",22,SUNDAY,John,22,[Latte,SMALL,true,true,3.00, Fruit blend,MEDIUM,true,4,6.00, Pina Colada,LARGE,true,3.60, Blue Lagoon,MEDIUM,true,3.10]"));
	}
	
	@Test
	void testCompareTo() {
		order2 = order1;
		assertEquals(order1.compareTo(order2),0);
	}

}
