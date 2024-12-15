/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Template for beverage shops 
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 

import java.util.ArrayList;

public class BevShop implements BevShopInterface{
	private ArrayList<Order> orders;
	private int currOrderIndex; 
	
	public BevShop() {
		orders = new ArrayList<Order>();
	}
	
	public boolean isValidTime(int time) {
		return (time >= BevShopInterface.MIN_TIME && time <= BevShopInterface.MAX_TIME);
	}
	
	public int getMaxNumOfFruits() {
		return BevShopInterface.MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol() {
		return BevShopInterface.MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits) {
		return numOfFruits > BevShopInterface.MAX_FRUIT;
	}
	
	public int getMaxOrderForAlcohol() {
		return BevShopInterface.MAX_ORDER_FOR_ALCOHOL;
	}
	
	public boolean isEligibleForMore() {
		if(this.getNumOfAlcoholDrink() < this.getMaxOrderForAlcohol()) {
			return true;
		}
		return false;
	}
	
	public int getNumOfAlcoholDrink() {
		return (this.getCurrentOrder()).findNumOfBeveType(Type.ALCOHOL);
	}
	
	public boolean isValidAge(int age) {
		if (age >= this.getMinAgeForAlcohol()) {
			return true;
		}
		return false;
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Order order = new Order(time, day, new Customer(customerName, customerAge));
		
		orders.add(order);
		
		currOrderIndex = orders.indexOf(order);
		
		
		}
	
	//coffee
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		(this.getCurrentOrder()).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	//alcohol
	public void processAlcoholOrder(String bevName, Size size) {
		
		(this.getCurrentOrder()).addNewBeverage(bevName, size);
	}
	
	//smoothie
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		(this.getCurrentOrder()).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	public int findOrder(int orderNo) {
		for(int i = 0; i <orders.size(); i++) {
			if (orderNo == getOrderAtIndex(i).getOrderNo()) {
				return i;
			}
		}
		return -1;
	}
	
	public double totalOrderPrice(int orderNo) {
		return (getOrderAtIndex(this.findOrder(orderNo))).calcOrderTotal();
	}
	
	public double totalMonthlySale() {
		double total = 0.0;
		for (int i = 0; i <orders.size(); i++) {
			total += getOrderAtIndex(i).calcOrderTotal();
		}
		return total;
	}
	
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	
	public Order getCurrentOrder() {
		return orders.get(currOrderIndex);
	}
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public void sortOrders() {
		for(int i = 0; i < orders.size() - 1; i++) {
			int minIndex = i;
			for(int j = i; j < orders.size(); j++) {
				if(getOrderAtIndex(i).compareTo(getOrderAtIndex(minIndex)) == -1) {
					minIndex = i;
				}
			}
			Order tempOrder = getOrderAtIndex(i);
			orders.set(i, getOrderAtIndex(minIndex));
			orders.set(minIndex, tempOrder);
			
		}
	}
	
	
	public String toString() {
		String result = "";
		for(int i = 0; i < totalNumOfMonthlyOrders(); i++) {
			result+= getOrderAtIndex(i).toString() + "\n";
		}
		result+=totalMonthlySale();
		return result;
	}
}
