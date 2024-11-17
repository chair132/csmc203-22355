
public class HolidayBonus {
	final static double HIGHEST_BONUS = 5000;
	final static double LOWEST_BONUS  = 1000;
	final static double OTHER_BONUS   = 2000;
	
	public static double[] calculateHolidayBonus(double[][] data) {
		double[] bonuses = new double[data.length];
		for(int colIndex = 0; colIndex < TwoDimRaggedArrayUtility.MAX_COLUMN; colIndex++) {
			int highestSaleStoreIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, colIndex);
			int lowestSaleStoreIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, colIndex);
			
			for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
				if(data[rowIndex].length <= colIndex || data[rowIndex][colIndex] <= 0) {
					continue;
				}
				
				if(rowIndex == highestSaleStoreIndex) {
					bonuses[rowIndex] += HIGHEST_BONUS; 
				} else if(rowIndex == lowestSaleStoreIndex) {
					bonuses[rowIndex] += LOWEST_BONUS;
				}else {
					bonuses[rowIndex] += OTHER_BONUS;
				}
				
			}
		}
		return bonuses;
		
	}
	
	public static double calculateTotalHolidayBonus(double[][] data) {
		double[] bonuses = calculateHolidayBonus(data);
		double total = 0;
		
		for(int index = 0; index < bonuses.length; index++) {
			total+= bonuses[index];
		}
		return total;
		
	}
}
