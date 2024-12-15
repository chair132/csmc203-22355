/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Template for smoothie beverages 
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 

public class Smoothie extends Beverage {
	private int numOfFruits;
	private boolean addProtein;
	
	private final double FRUIT_PRICE = 0.50;
	private final double PROTEIN_PRICE = 1.50;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	public double calcPrice() {
		double price = super.addSizePrice();
		price += (numOfFruits * FRUIT_PRICE);
		
		if(addProtein) {
			price+=PROTEIN_PRICE;
		}
		return price;
	}
	
	public boolean equals(Object anotherBev) {
		if(!(anotherBev instanceof Smoothie)) {
			return false;
		}
		return super.equals(anotherBev) && this.numOfFruits == ((Smoothie)anotherBev).numOfFruits && this.addProtein == ((Smoothie)anotherBev).addProtein;
	}
	
	public boolean getAddProtein() {
		return addProtein;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public String toString() {
		return super.getBevName() + "," + super.getSize() + "," + this.addProtein + "," + this.numOfFruits + "," + String.format("%.2f",this.calcPrice());
	}
	
	
}
