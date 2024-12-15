/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Abstract template for beverages 
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 
public abstract class Beverage {
	
	private String bevName;
	private Type type;
	private Size size;
	
	private final double BASE_PRICE = 2;
	private final double SIZE_PRICE = 0.5;
	
	public Beverage (String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public double addSizePrice() {
		return BASE_PRICE + (SIZE_PRICE * size.ordinal());
	}
	
	public abstract double calcPrice();
	
	public boolean equals(Object anotherBev) {
		if(!(anotherBev instanceof Beverage)) {
			return false;
		}
		return (this.bevName.equals(((Beverage)anotherBev).bevName) && (this.type == ((Beverage)anotherBev).type) && (this.size == ((Beverage)anotherBev).size));
	}
	
	public double getBasePrice() {
		return BASE_PRICE;
	}
	
	public String getBevName() {
		return bevName;
	}
	
	public Size getSize() {
		return size;
	}
	
	public Type getType() {
		return type;
	}
	
	public String toString() {
		return bevName + "," + size;
	}
	
}
