/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Tests the template for beverage shops 
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

class BevShopTestStudent {
	BevShop bevShop1, bevShop2;
	@BeforeEach
	void setUp() throws Exception {
		bevShop1 = new BevShop();
		
		bevShop1.startNewOrder(14, Day.SATURDAY, "Cecilia", 31);
		bevShop1.processSmoothieOrder("Blueberry Smoothie", Size.SMALL, 2, false);
		
		bevShop1.startNewOrder(15, Day.SUNDAY, "John", 30);
		bevShop1.processAlcoholOrder("Pina Colada", Size.LARGE);
		bevShop1.processAlcoholOrder("Miami Vice", Size.LARGE);
		bevShop1.processAlcoholOrder("Blue Lagoon", Size.MEDIUM);
		
		
		bevShop2 = new BevShop();
		bevShop2.startNewOrder(10, Day.TUESDAY, "Anthony", 21);
		bevShop2.processCoffeeOrder("Americano", Size.MEDIUM, true, true);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		bevShop1 = bevShop2 = null;
	}

	@Test
	void testIsValidTime() {
		assertTrue(bevShop1.isValidTime(14));
		assertFalse(bevShop2.isValidTime(7));
	}
	
	@Test
	void testGetMaxNumOfFruits() {
		assertEquals(bevShop1.getMaxNumOfFruits(), 5);
		assertEquals(bevShop2.getMaxNumOfFruits(), 5);
	}

	@Test
	void testGetMinAgeForAlcohol() {
		assertEquals(bevShop1.getMinAgeForAlcohol(), 21);
		assertEquals(bevShop2.getMinAgeForAlcohol(), 21);
	}

	@Test
	void testIsMaxFruit() {
		assertFalse(bevShop1.isMaxFruit(4));
		assertTrue(bevShop2.isMaxFruit(7));
	}

	@Test
	void testGetMaxOrderForAlcohol() {
		assertEquals(bevShop1.getMaxOrderForAlcohol(), 3);
		assertEquals(bevShop2.getMaxOrderForAlcohol(), 3);
	}
	//to be continued
	
	@Test
	void testIsEligibleForMore() {
		assertFalse(bevShop1.isEligibleForMore());
		assertTrue(bevShop2.isEligibleForMore());
	}
	
	@Test
	void testGetNumOfAlcoholDrink() {
		assertEquals(bevShop1.getNumOfAlcoholDrink(), 3);
		assertEquals(bevShop2.getNumOfAlcoholDrink(), 0);
	}
	
	@Test
	void testIsValidAge() {
		assertTrue(bevShop1.isValidAge(22));
		assertFalse(bevShop1.isValidAge(18));
		
		assertTrue(bevShop2.isValidAge(30));
		assertFalse(bevShop2.isValidAge(2));
		
		
	}
	
	@Test
	void testFindOrder() {
		assertEquals(bevShop1.findOrder(bevShop1.getCurrentOrder().getOrderNo()), 1);
		assertEquals(bevShop2.findOrder(bevShop2.getCurrentOrder().getOrderNo()), 0);
		
	}
	
	@Test
	void testTotalOrderPrice() {
		assertEquals(bevShop1.totalOrderPrice(bevShop1.getCurrentOrder().getOrderNo()), 10.30, 0.0001);
		assertEquals(bevShop2.totalOrderPrice(bevShop2.getCurrentOrder().getOrderNo()), 3.50, 0.0001);
	}
	
	@Test
	void testTotalMonthlySale() {
		assertEquals(bevShop1.totalMonthlySale(), 13.30, 0.0001);
		assertEquals(bevShop2.totalMonthlySale(), 3.50, 0.0001);
	}
	
	
	@Test
	void testTotalNumOfMonthlyOrders() {
		assertEquals(bevShop1.totalNumOfMonthlyOrders(), 2);
		assertEquals(bevShop2.totalNumOfMonthlyOrders(), 1);
	}
	
	@Test
	void testToString() {
		
		
		
		assertTrue(bevShop1.toString().substring(5,69).equals(",14,SATURDAY,Cecilia,31,[Blueberry Smoothie,SMALL,false,2,3.00]\n"));
		assertTrue(bevShop1.toString().substring(74).equals(",15,SUNDAY,John,30,[Pina Colada,LARGE,true,3.60, Miami Vice,LARGE,true,3.60, Blue Lagoon,MEDIUM,true,3.10]\n"
				+ "13.3"));
		
		
		assertTrue((bevShop2.toString().substring(5)).equals(",10,TUESDAY,Anthony,21,[Americano,MEDIUM,true,true,3.50]\n"
				+ "3.5"));
	}

}
