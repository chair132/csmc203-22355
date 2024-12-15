/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Template for one singular beverage order
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 
import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Order> {
	private int orderNumber;
	private int orderTime;
	private Day orderDay;
	private Customer orderCustomer;
	private ArrayList<Beverage> listOfBeverages;
	
	
	public Order(int orderTime, Day orderDay, Customer cust) {
		this.orderNumber = this.generateOrder();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.orderCustomer = cust;
		this.listOfBeverages = new ArrayList<Beverage>();
	}
	
	public int generateOrder() {
		return (int)(Math.random()*80001)+10000;
	}
	
	public int getOrderNo() {
		return orderNumber;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public Day getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {
		return new Customer(orderCustomer);
	}
	
	public boolean isWeekend() {
		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
			return true;
		}
		return false;
	}
	
	public Beverage getBeverage(int itemNo) {
		return this.listOfBeverages.get(itemNo);
	}
	
	public int getTotalItems() {
		return this.listOfBeverages.size();
	}
	
	//coffee
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		this.listOfBeverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	
	//alcohol
	public void addNewBeverage(String bevName, Size size) {
		this.listOfBeverages.add(new Alcohol(bevName, size, this.isWeekend()));
	}
	
	//smoothie
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		this.listOfBeverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	
	public double calcOrderTotal() {
		double total = 0.0;
		for(int i = 0; i < this.listOfBeverages.size(); i++) {
			total += (this.listOfBeverages.get(i)).calcPrice();
		}
		return total;
		
	}
	
	public int findNumOfBeveType(Type type) {
		int count = 0;
		for(int i = 0; i < this.listOfBeverages.size(); i++) {
			if (this.listOfBeverages.get(i).getType() == type) {
				count++;
			}
		}
		return count;	
	}
	
	public String toString() {
		return orderNumber + ","+orderTime+","+orderDay+","+orderCustomer.getName()+","+orderCustomer.getAge() + ","+listOfBeverages;
	}
	
	
	public int compareTo(Order anotherOrder) {
		if (this.orderNumber == anotherOrder.orderNumber) {
			return 0;
		} else if(this.orderNumber > anotherOrder.orderNumber) {
			return 1;
		} else {
			return -1;
		}
	}
}
