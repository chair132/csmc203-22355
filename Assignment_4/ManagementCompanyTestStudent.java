/* 
 * Class: CMSC203  22355
 * Instructor: David Kuijt
 * Description: Define the tests for the overall management company
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


public class ManagementCompanyTestStudent {
	Property sampleProperty;
	ManagementCompany managementCo1, managementCo2, managementCo3, managementCo4; 
	
	@BeforeEach
	public void setUp() throws Exception {
		managementCo1 = new ManagementCompany();
		managementCo2 = new ManagementCompany("Railey", "555555555",6);
		managementCo3 = new ManagementCompany("Vu", "777777777",-5, 1, 2, 3, 4);
		managementCo4 = new ManagementCompany(managementCo1);
	}

	@AfterEach
	public void tearDown() throws Exception {
		managementCo1=null;
		managementCo2=null;
		managementCo3=null;
		managementCo4=null;
	}

	@Test
	public void testAddProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(managementCo1.addProperty(sampleProperty),0,0);	//property has been successfully added to index 0   0
		
		
		
		managementCo2.addProperty(sampleProperty);
		assertEquals(managementCo2.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 2, 5, 3, 3)),-4); //where two plots overlaps -4
		
		sampleProperty = null;
		assertEquals(managementCo2.addProperty(sampleProperty),-2); //where null Property is inputted -2
		
		assertEquals(managementCo3.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 3, 3, 3, 3)), -3); //where the plot goes off -3
		
		managementCo4.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1));
		managementCo4.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 2, 2, 1, 1));
		managementCo4.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 3, 3, 1, 1));
		managementCo4.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 4, 4, 1, 1));
		managementCo4.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 5, 5, 1, 1));
		
		assertEquals(managementCo4.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 6, 6, 1, 1)), -1); // where management company is full -1
		
	}
	
	
	@Test
	public void testGetHighestRentProperty() {
		assertEquals(managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1)), 0,  0);
		assertEquals(managementCo1.addProperty(new Property("Best", "Anthony", 3000, "Anthony Vu", 2, 2, 1, 1)), 1,  0);
		assertEquals(managementCo1.getHighestRentProperty().getRentAmount(), 3000.0, 0.001); //gets the rent of the property with the highest rent
		
	}
	
	
	
	@Test
	public void testGetMgmFeePer() {
		assertEquals(managementCo1.getMgmFeePer(), 0.0, 0.0);
		assertEquals(managementCo2.getMgmFeePer(), 6, 0.0);
		assertEquals(managementCo3.getMgmFeePer(), -5, 0.0);
		assertEquals(managementCo4.getMgmFeePer(), 0.0, 0.0);
		
	}
	
	
	@Test
	public void testGetName() {
		assertEquals(managementCo1.getName(), "");
		assertEquals(managementCo2.getName(), "Railey");
		assertEquals(managementCo3.getName(), "Vu");
		assertEquals(managementCo4.getName(), "");
	}
	
	
	@Test
	public void testGetPlot() {
		assertEquals(0, managementCo1.getPlot().getX());
		assertEquals(0, managementCo1.getPlot().getY());
		assertEquals(10, managementCo1.getPlot().getWidth());
		assertEquals(10, managementCo1.getPlot().getDepth());
		
		assertEquals(0, managementCo2.getPlot().getX());
		assertEquals(0, managementCo2.getPlot().getY());
		assertEquals(10, managementCo2.getPlot().getWidth());
		assertEquals(10, managementCo2.getPlot().getDepth());
		
		assertEquals(1, managementCo3.getPlot().getX());
		assertEquals(2, managementCo3.getPlot().getY());
		assertEquals(3, managementCo3.getPlot().getWidth());
		assertEquals(4, managementCo3.getPlot().getDepth());
		
		assertEquals(0, managementCo4.getPlot().getX());
		assertEquals(0, managementCo4.getPlot().getY());
		assertEquals(10, managementCo4.getPlot().getWidth());
		assertEquals(10, managementCo4.getPlot().getDepth());
	}
	
	@Test
	public void testGetProperties() {
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 2, 2, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 3, 3, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 4, 4, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 5, 5, 1, 1));
		
		assertEquals(managementCo1.getProperties()[2].getPlot().getX(), 3); //X value on the plot at 3rd index
	}
	
	
	
	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(managementCo1.addProperty(sampleProperty),0,0);	
		assertEquals(managementCo1.getPropertiesCount(), 1);
		
		assertEquals(managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1)), 1,  0); //index 1
		assertEquals(managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 2, 2, 1, 1)), 2,  0); //index 2
		assertEquals(managementCo1.getPropertiesCount(), 3); //added two more properties so it is 3 together
	}
	
	
	@Test
	public void testGetTaxID() {
		assertEquals(managementCo1.getTaxID(), "");
		assertEquals(managementCo2.getTaxID(), "555555555");
		assertEquals(managementCo3.getTaxID(), "777777777");
		assertEquals(managementCo4.getTaxID(), "");
	}
	
	@Test
	public void testGetTotalRent() {
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 3000, "Anthony Vu", 2, 2, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 4000, "Anthony Vu", 3, 3, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 5000, "Anthony Vu", 4, 4, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 5, 5, 1, 1));
		assertEquals(managementCo1.getTotalRent(), 16000);
	}
	
	@Test
	public void testIsManagementFeeValid() {
		assertTrue(managementCo1.isManagementFeeValid());
		assertTrue(managementCo2.isManagementFeeValid());
		assertFalse(managementCo3.isManagementFeeValid());
		assertTrue(managementCo4.isManagementFeeValid());
	}
	
	@Test
	public void testIsPropertiesFull() {
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 3000, "Anthony Vu", 2, 2, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 4000, "Anthony Vu", 3, 3, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 5000, "Anthony Vu", 4, 4, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 5, 5, 1, 1));
		
		assertTrue(managementCo1.isPropertiesFull());
		assertFalse(managementCo2.isPropertiesFull());
	}
	
	@Test
	public void testRemoveLastProperty() {
		managementCo1.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 3000, "Anthony Vu", 2, 2, 1, 1));
		managementCo1.addProperty(new Property("Best", "Anthony", 4000, "Anthony Vu", 3, 3, 1, 1));
		
		managementCo1.removeLastProperty();
		
		assertEquals(managementCo1.getProperties()[2], null); //checks the third index to see if its null (after its removed)
	}
	
	@Test
	public void testToString() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613.0, "BillyBob Wilson",2,5,2,2);
		assertEquals(managementCo2.addProperty(sampleProperty), 0);	//property has been successfully added to index 0
		assertEquals(managementCo2.addProperty(new Property("Best", "Anthony", 2000, "Anthony Vu", 1, 1, 1, 1)), 1);
		String expectedString = "List of the properties for Railey, taxID: 555555555\n"
				+ "______________________________________________________\n"
				+ "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
				+ "Best,Anthony,Anthony Vu,2000.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 276.78";
		System.out.println(expectedString);
		System.out.println(managementCo2.toString());
		assertTrue(managementCo2.toString().equals(expectedString));
				
	}

}
