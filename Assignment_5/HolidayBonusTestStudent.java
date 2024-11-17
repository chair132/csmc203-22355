import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HolidayBonusTestStudent {
	private double[][] dataSet1 = { {1,2,3},
									{4,5},
									{6,7,8,9} };

	private double[][] dataSet2 = { {1,2,3},
									{4,5,6}};


	private double[][] dataSet3 = { {42.2, 10.0, 4.0},
									{2.0 , 20.0, 4.4, 5.0 } };
	


	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonus() {
		double[] holidayBonus1 = HolidayBonus.calculateHolidayBonus(dataSet1);
		double[] holidayBonus2 = HolidayBonus.calculateHolidayBonus(dataSet2);
		double[] holidayBonus3 = HolidayBonus.calculateHolidayBonus(dataSet3);
		
		double[] test1 = {	3000.0, 
							4000.0, 
							20000.0 };
		
		double[] test2 = {	3000.0, 
							15000.0 };
		
		double[] test3 = {	7000.0, 
							16000.0 };
		
		assertTrue(Arrays.equals(holidayBonus1, test1 ));
		assertTrue(Arrays.equals(holidayBonus2, test2 ));
		assertTrue(Arrays.equals(holidayBonus3, test3 ));
	}
	
	@Test
	public void testCalculateTotalHolidayBonus() {
		assertEquals(HolidayBonus.calculateTotalHolidayBonus(dataSet1), 27000.0);
		assertEquals(HolidayBonus.calculateTotalHolidayBonus(dataSet2), 18000.0);
		assertEquals(HolidayBonus.calculateTotalHolidayBonus(dataSet3), 23000.0);
	}

}
