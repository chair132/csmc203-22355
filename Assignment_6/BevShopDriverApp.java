/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Example situations where a beverage shop takes orders 
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 

import java.util.Scanner;

public class BevShopDriverApp {

	public static void main(String[] args)
	{

		
		BevShop LABevShop = new BevShop();
		Scanner input = new Scanner(System.in);
		String customerName;
		int customerAge;
		
		
		//ORDER #1
		System.out.println("The current order in process can have at most " + LABevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
		System.out.println("The minimum age to order alcohol drink is " + LABevShop.getMinAgeForAlcohol()); 		
		System.out.println("Start a new order: ");
		
		System.out.print("Would you please enter your name ");
		customerName = input.nextLine();
		System.out.print("Would you please enter your age ");
		customerAge = input.nextInt();
		
		LABevShop.startNewOrder(11, Day.WEDNESDAY, customerName, customerAge);
		
		System.out.println("Your Total Order for now is: " + LABevShop.getCurrentOrder().calcOrderTotal());
		
		
		if(LABevShop.isValidAge(LABevShop.getCurrentOrder().getCustomer().getAge()))
		{
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
		
		
			System.out.println("Would you please add an alcohol drink");
			
			LABevShop.processAlcoholOrder("Miami Vice", Size.SMALL);
			
			System.out.println("The current order of drinks is " + LABevShop.getCurrentOrder().getTotalItems());
			
			System.out.println("The Total price on the Order is " + + LABevShop.getCurrentOrder().calcOrderTotal());
			
			System.out.println("Your current alcohol drink order is less than " + (LABevShop.getMaxOrderForAlcohol()));
			
			System.out.println("Would you please add a second alcohol drink");
			
			LABevShop.processAlcoholOrder("Blue Lagoon", Size.LARGE);
			
			System.out.println("The current order of drinks is " + LABevShop.getCurrentOrder().getTotalItems());
			System.out.println("The Total price on the Order is " +  LABevShop.getCurrentOrder().calcOrderTotal());
			System.out.println("Your current alcohol drink order is less than " + (LABevShop.getMaxOrderForAlcohol()));
			
			System.out.println("Would you please add a third alcohol drink");
			
			LABevShop.processAlcoholOrder("Beer", Size.MEDIUM);
			
			System.out.println("The current order of drinks is " + LABevShop.getCurrentOrder().getTotalItems());
			System.out.println("The Total price on the Order is " + + LABevShop.getCurrentOrder().calcOrderTotal());
			
			if(!LABevShop.isEligibleForMore()) {
				System.out.println("You have a maximum alcohol drinks for this order");
			}
		}else {
			System.out.println("Your Age is not appropriate for alcohol drink!!");
		}
		
		System.out.println("Would you please add a COFFEE to your order: ");

		LABevShop.processCoffeeOrder("Latte", Size.SMALL, true, true);
		System.out.println("Total items on your order is " + LABevShop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price on the Order is " +  LABevShop.getCurrentOrder().calcOrderTotal());
		
		
		
		System.out.println("#------------------------------------#");
		
		//ORDER #2
		System.out.println("Would you please start a new order");
		System.out.print("Would you please enter your name: ");
		input.nextLine();
		customerName = input.nextLine();
		System.out.print("Would you please enter your age: ");
		customerAge = input.nextInt();
		
		LABevShop.startNewOrder(12, Day.WEDNESDAY, customerName, customerAge);
		
		System.out.println("Your Total Order for now is: " + LABevShop.getCurrentOrder().calcOrderTotal());
		System.out.println("Would you please add a SMOOTHIE to order");
		
		LABevShop.processSmoothieOrder("Blueberry Smoothie", Size.LARGE, 3, true);
		
		System.out.println("Your Total Order for now is: " + LABevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Would you please add a SMOOTHIE to order");
		LABevShop.processSmoothieOrder("Mango Smoothie", Size.SMALL, 0, false);
		
		System.out.println("Your Total Order for now is: " + LABevShop.getCurrentOrder().calcOrderTotal());
		
		
		System.out.println("Would you please add a Coffee to order");
		LABevShop.processCoffeeOrder("Americano", Size.SMALL, false, false);
		
		System.out.println("Your Total Order for now is: " + LABevShop.getCurrentOrder().calcOrderTotal());
		
		
		if(LABevShop.isValidAge(LABevShop.getCurrentOrder().getCustomer().getAge())) {
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
			System.out.println("Would you please add an alcoholic drink to order");
			LABevShop.processAlcoholOrder("Miami Vice", Size.SMALL);
			System.out.println("Your Total Order for now is: " + LABevShop.getCurrentOrder().calcOrderTotal());
			
		} else {
			System.out.println("Your Age is not appropriate for alcohol drink!!");
		}
		
		System.out.println("The current order of drinks is "+ LABevShop.getCurrentOrder().getTotalItems());
		System.out.println("Your Total Order for now is: " + LABevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("The total number of fruits is 5");
		System.out.println("You reached a Maximum number of fruits");
		
		LABevShop.processSmoothieOrder("Raspberry", Size.MEDIUM, 5, false);
		
		System.out.println();
		System.out.println("Total price on the second Order: " + LABevShop.getCurrentOrder().calcOrderTotal());
		System.out.println("Total amount for all Orders: "+ LABevShop.totalMonthlySale());
		
		
		
		
		
	}
}