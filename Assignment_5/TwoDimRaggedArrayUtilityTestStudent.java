import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoDimRaggedArrayUtilityTestStudent {
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
	public void testGetAverage() {
		assertEquals(TwoDimRaggedArrayUtility.getAverage(dataSet1), 5, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getAverage(dataSet2), 3.5, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getAverage(dataSet3), 12.51429, 0.001);
	}
	
	@Test
	public void testGetColumnTotal() {
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1), 14, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), 11, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 1),  7, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 2),  9, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 1), 30, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 3),  5, 0.001);
	}
	
	@Test
	public void testGetHighestInArray() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),    9, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(dataSet2),    6, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(dataSet3), 42.2, 0.001);
	}
	
	@Test
	public void testGetHighestInColumn() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 1),    7, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 2),    8, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 1),    5, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 2),    6, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(dataSet3, 0), 42.2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(dataSet3, 3),    5, 0.001);
	}
	
	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 1), 2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 2), 2, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 1), 1, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 2), 1, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet3, 0), 0, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet3, 3), 1, 0.001);
	}
	
	@Test
	public void testGetHighestInRow() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 0),  3, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2),  9, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 0),  3, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 1),  6, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet3, 0),  42.2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(dataSet3, 1), 20, 0.001);
	}
	
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 0),  2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2),  3, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 0),  2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 1),  2, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet3, 0),  0, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet3, 1),  1, 0.001);
	}
	
	
	
	@Test
	public void testGetLowestInArray() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),    1, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInArray(dataSet2),    1, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInArray(dataSet3),    2, 0.001);
	}
	
	@Test
	public void testGetLowestInColumn() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 1),    2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 2),    3, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 1),    2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 2),    3, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet3, 0),    2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(dataSet3, 3),    5, 0.001);
	}
	
	@Test
	public void testGetLowestInColumnIndex() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 1), 0, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 2), 0, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 1), 0, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 2), 0, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet3, 0), 1, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet3, 3), 1, 0.001);
	}
	
	@Test
	public void testGetLowestInRow() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0),  1, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 2),  6, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 0),  1, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 1),  4, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet3, 0),  4, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(dataSet3, 1),  2, 0.001);
	}
	
	@Test
	public void testGetLowestInRowIndex() {
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0),  0, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 2),  0, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 0),  0, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 1),  0, 0.001);
		
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3, 0),  2, 0.001);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3, 1),  0, 0.001);
	}

}
