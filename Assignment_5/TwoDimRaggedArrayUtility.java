import java.io.*;
import java.util.Scanner;


public class TwoDimRaggedArrayUtility {
	final static int MAX_ROW = 10;
	final static int MAX_COLUMN = 10;
	
	
	public static double getAverage(double[][] data) {
		double total = 0;
		int numOfElements = 0;
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			for(int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
				total+=data[rowIndex][colIndex];
				numOfElements++;
			}
		}
		return total/numOfElements;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if (!(data[rowIndex].length <= col)) {
				total += data[rowIndex][col];
			}
		}
		return total;
	}
	
	public static double getHighestInArray(double[][] data) {
		//initial value 
		double max = data[0][0];
		
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			for(int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
				if(data[rowIndex][colIndex] > max) {
					max = data[rowIndex][colIndex];
				}
				
			}
		}
		return max;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		//initial value 
		double max = 0;
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if (!(data[rowIndex].length <= col)) {
				max = data[rowIndex][col];
				break;
			}
		}
		
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if(!(data[rowIndex].length <= col) && data[rowIndex][col] > max) {
				max = data[rowIndex][col];
			}
		}
		return max;
	}
	
	//
	public static int getHighestInColumnIndex(double[][] data, int col) {
		//initial values
		double max=0;
		int index=0;
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if (!(data[rowIndex].length <= col)) {
				max = data[rowIndex][col];
				index = rowIndex;
				break;
			}
		}
		
		
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if (!(data[rowIndex].length <= col) && data[rowIndex][col] > max) {
				max = data[rowIndex][col];
				index = rowIndex;
			}
		}
		return index;
		
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		//initial value
		double max = data[row][0];
		
		for(int colIndex = 0; colIndex < data[row].length; colIndex++) {
			if(data[row][colIndex] > max) {
				max = data[row][colIndex];
			}
		}
		return max;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		//initial values
		double max = data[row][0];
		int index = 0;
		
		for(int colIndex = 0; colIndex < data[row].length; colIndex++) {
			if(data[row][colIndex] > max) {
				max = data[row][colIndex];
				index = colIndex;
			}
		}
		return index;
	}
	
	public static double getLowestInArray(double[][]data) {
		//initial value
		double min = data[0][0];
		
		//loops through and compares to current min
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			for(int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
				if (data[rowIndex][colIndex] < min) {
					min = data[rowIndex][colIndex];
				}
			}
		}
		return min;
	}
	
	public static double getLowestInColumn(double[][] data, int col) {
		//finding an initial value 
		double min=0;
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if (!(data[rowIndex].length <= col)) {
				min = data[rowIndex][col];
				break;
			}
		}
		
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if(!(data[rowIndex].length <= col) && data[rowIndex][col] < min) {
				min = data[rowIndex][col];
			}
		}
		return min;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		//finding the initial values 
		double min=0;
		int index=0;
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if (!(data[rowIndex].length <= col)) {
				min = data[rowIndex][col];
				index = rowIndex;
				break;
			}
		}
		
		
		
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			if (!(data[rowIndex].length <= col) && data[rowIndex][col] < min) {
				min = data[rowIndex][col];
				index = rowIndex;
			}
		}
		return index;
		
	}

	public static double getLowestInRow(double[][] data, int row) {
		double min = data[row][0];
		
		for(int colIndex = 0; colIndex < data[row].length; colIndex++) {
			if (data[row][colIndex] < min) {
				min = data[row][colIndex];
			}
		}
		return min;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		double min = data[row][0];
		int index = 0;
		
		for(int colIndex = 0; colIndex < data[row].length; colIndex++) {
			if (data[row][colIndex] < min) {
				min = data[row][colIndex];
				index = colIndex;
			}
		}
		return index;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		for(int colIndex = 0; colIndex < data[row].length; colIndex++) {
			total+= data[row][colIndex];
		}
		return total;
	}
	
	public static double getTotal(double[][] data) {
		double total = 0;
		
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			for(int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
				total+=data[rowIndex][colIndex];
			}
		}
		return total;
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException{
		Scanner fileInput = new Scanner(file);
		String[][] tempArray = new String[MAX_ROW][MAX_COLUMN];
		int rowIndex = 0;
		
		//while the file has not ended, split the current line and put every token into a temporary array
		while(fileInput.hasNextLine()) {
			String lineString = fileInput.nextLine();
			String[] values = lineString.split("\\s");
			for(int colIndex = 0; colIndex < values.length; colIndex++) {
				
				tempArray[rowIndex][colIndex] = values[colIndex];
				

			}
			rowIndex++;
		}
		
		//create a new array with the length and set the column size to the # of columns in those rows in the temporary array
		double[][] finalArray = new double[rowIndex][];
		for(int row = 0; row < rowIndex; row++) {
			int colCount = 0;
			for(int col = 0; col < tempArray[row].length; col++) {
				if (tempArray[row][col] != null) {
					colCount++;
				}
			}
			
			finalArray[row] = new double[colCount];
		}
		
		
		for(int outerLoopIndex = 0; outerLoopIndex < rowIndex; outerLoopIndex++) {
			for(int innerLoopIndex = 0; innerLoopIndex < finalArray[outerLoopIndex].length; innerLoopIndex++) {
				finalArray[outerLoopIndex][innerLoopIndex] = Double.parseDouble(tempArray[outerLoopIndex][innerLoopIndex]);
			}
		}
		
		fileInput.close();
		return finalArray;
	
		
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{
		PrintWriter output = new PrintWriter(outputFile);
		for(int rowIndex = 0; rowIndex < data.length; rowIndex++) {
			for(int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
				output.print(data[rowIndex][colIndex] + " ");
			}
			output.println();
		}
		output.close();
		
	}
	
	
	
}
