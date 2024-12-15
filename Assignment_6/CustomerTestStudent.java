/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Tests the template for customers 
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

class CustomerTestStudent {
	Customer customer1,customer2,customer3;
	@BeforeEach
	void setUp() throws Exception {
		customer1 = new Customer("John", 22);
		customer2 = new Customer("Anthony", 16);
		customer3 = new Customer(customer2);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		customer1 = customer2 = customer3 = null;
		
	}

	@Test
	void testGetAge() {
		assertEquals(customer1.getAge(), 22);
		assertEquals(customer2.getAge(), 16);
		assertEquals(customer3.getAge(), 16);
	}
	
	@Test
	void testGetName() {
		assertTrue((customer1.getName()).equals("John"));
		assertTrue((customer2.getName()).equals("Anthony"));
		assertTrue((customer3.getName()).equals("Anthony"));
	}
	
	@Test
	void testSetAge() {
		customer1.setAge(33);
		assertEquals(customer1.getAge(),33);
		customer2.setAge(40);
		assertEquals(customer2.getAge(),40);
		customer3.setAge(11);
		assertEquals(customer3.getAge(),11);
	}
	
	@Test
	void testSetName() {
		customer1.setName("Alex");
		assertTrue((customer1.getName()).equals("Alex"));
		customer2.setName("Logan");
		assertTrue((customer2.getName()).equals("Logan"));
		customer3.setName("June");
		assertTrue((customer3.getName()).equals("June"));
	}
	
	@Test
	void testToString() {
		assertTrue((customer1.toString()).equals("John,22"));
		assertTrue((customer2.toString()).equals("Anthony,16"));
		assertTrue((customer3.toString()).equals("Anthony,16"));
	}

}
