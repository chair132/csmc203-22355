/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Template for alcohol beverages 
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 
public class Alcohol extends Beverage {
	private boolean isWeekend;
	
	private final double WEEKEND_PRICE = 0.60;
	
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	public double calcPrice() {
		double price = super.addSizePrice();
		
		if(isWeekend) {
			price += WEEKEND_PRICE;
		}
		
		return price;
	}
	
	public boolean equals(Object anotherBev) {
		if(!(anotherBev instanceof Alcohol)) {
			return false;
		}
		return (super.equals(anotherBev)) && this.isWeekend == ((Alcohol)anotherBev).isWeekend;
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	public String toString() {
		return super.getBevName() +","+super.getSize()+","+isWeekend +","+String.format("%.2f",this.calcPrice());
	}
}
