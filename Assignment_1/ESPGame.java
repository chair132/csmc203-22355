/*
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Implement a program that asks the user to guess random colors that the computer selected 
 * Due: 09/22/2024
 * Platform/compiler: Eclipse IDE/Mac Terminal
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: _______John Vu___
*/


import java.io.*;
import java.util.Scanner;


public class ESPGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int roundNumber = 0, randomColor, score = 0;
		String fileName, randomColorString="", userGuess, userName, userDescription, dueDate, color1, color2,color3,color4,color5,color6,color7,color8,color9,color10,color11,color12,color13,color14,color15,color16;
		
		
		//header and prompts the user to enter the file name with the colors
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		System.out.print("Enter the filename: ");
		fileName = input.nextLine();
		
		//opens the file and imports 16 colors from the file into the 16 variables
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
			color1 = fileReader.readLine();
			color2 = fileReader.readLine();
			color3 = fileReader.readLine();
			color4 = fileReader.readLine();
			color5 = fileReader.readLine();
			color6 = fileReader.readLine();
			color7 = fileReader.readLine();
			color8 = fileReader.readLine();
			color9 = fileReader.readLine();
			color10 = fileReader.readLine();
			color11 = fileReader.readLine();
			color12 = fileReader.readLine();
			color13 = fileReader.readLine();
			color14 = fileReader.readLine();
			color15 = fileReader.readLine();
			color16 = fileReader.readLine();
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		//prints out the colors from the file 
		System.out.println("There are sixteen colors from a file:");
		
		System.out.println("1. "+ color1);
		System.out.println("2. "+ color2);
		System.out.println("3. "+ color3);
		System.out.println("4. "+ color4);
		System.out.println("5. "+ color5);
		System.out.println("6. "+ color6);
		System.out.println("7. "+ color7);
		System.out.println("8. "+ color8);
		System.out.println("9. "+ color9);
		System.out.println("10. "+ color10);
		System.out.println("11. "+ color11);
		System.out.println("12. "+ color12);
		System.out.println("13. "+ color13);
		System.out.println("14. "+ color14);
		System.out.println("15. "+ color15);
		System.out.println("16. "+ color16);
		System.out.println();
		
		//iterate for 3 times
		for (int i = 0; i < 3; i++) {
			//round number
			roundNumber++;
			System.out.println("Round "+ roundNumber);
			System.out.println();
			
			//random color selector and capitalize the appropriate string
			randomColor = (int)((Math.random() * 16)+1);
			switch(randomColor) {
				case 1:
					randomColorString = color1.substring(0,1).toUpperCase()+color1.substring(1).toLowerCase();
					break;
				case 2:
					randomColorString = color2.substring(0,1).toUpperCase()+color2.substring(1).toLowerCase();
					break;
				case 3:
					randomColorString = color3.substring(0,1).toUpperCase()+color3.substring(1).toLowerCase();
					break;
				case 4:
					randomColorString = color4.substring(0,1).toUpperCase()+color4.substring(1).toLowerCase();
					break;
				case 5:
					randomColorString = color5.substring(0,1).toUpperCase()+color5.substring(1).toLowerCase();
					break;
				case 6:
					randomColorString = color6.substring(0,1).toUpperCase()+color6.substring(1).toLowerCase();
					break;
				case 7:
					randomColorString = color7.substring(0,1).toUpperCase()+color7.substring(1).toLowerCase();
					break;
				case 8:
					randomColorString = color8.substring(0,1).toUpperCase()+color8.substring(1).toLowerCase();
					break;
				case 9:
					randomColorString = color9.substring(0,1).toUpperCase()+color9.substring(1).toLowerCase();
					break;
				case 10:
					randomColorString = color10.substring(0,1).toUpperCase()+color10.substring(1).toLowerCase();
					break;
				case 11:
					randomColorString = color11.substring(0,1).toUpperCase()+color11.substring(1).toLowerCase();
					break;
				case 12:
					randomColorString = color12.substring(0,1).toUpperCase()+color12.substring(1).toLowerCase();
					break;
				case 13:
					randomColorString = color13.substring(0,1).toUpperCase()+color13.substring(1).toLowerCase();
					break;
				case 14:
					randomColorString = color14.substring(0,1).toUpperCase()+color14.substring(1).toLowerCase();
					break;
				case 15:
					randomColorString = color15.substring(0,1).toUpperCase()+color15.substring(1).toLowerCase();
					break;
				case 16:
					randomColorString = color16.substring(0,1).toUpperCase()+color16.substring(1).toLowerCase();
					break;
			}
			
			
			//prompts the user to enter a color
			System.out.println("I am thinking of a color.");
			System.out.println("Is it one of list of colors above?");
			System.out.println("Enter your guess:");
			userGuess = input.nextLine();
			
			userGuess = userGuess.substring(0,1).toUpperCase() + userGuess.substring(1).toLowerCase();
			
			if(userGuess.equals(randomColorString)) {
				score++;
			}
			
			System.out.println("\nI was thinking of "+ randomColorString);
			
			
		}
		
		//game over/footer
		System.out.println("Game Over\n");
		System.out.println("You guessed "+ score + " out of 3 colors correctly.");
		
		System.out.print("Enter your name: ");
		userName = input.nextLine();
		System.out.print("Describe yourself: ");
		userDescription = input.nextLine();
		System.out.print("Due Date: ");
		dueDate = input.nextLine();
		
		System.out.println("User Name: "+ userName);
		System.out.println("User Description: "+ userDescription);
		System.out.println("Date: "+ dueDate);
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
