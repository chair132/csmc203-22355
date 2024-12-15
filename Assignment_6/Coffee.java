/* 
 * Class: CMSC203 22355
 * Instructor: David Kuijt
 * Description: Template for coffee beverages 
 * Due: 12/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming   
 * assignment independently. I have not copied the code  
 * from a student or any source. I have not given my code  
 * to any student. 
   Print your Name here: ______John Vu____ 
*/ 

public class Coffee extends Beverage {
	private boolean extraShot;
	private boolean extraSyrup;
	
	private final double EXTRA_SHOT_PRICE = 0.50;
	private final double EXTRA_SYRUP_PRICE = 0.50;
	
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public double calcPrice() {
		double price = super.addSizePrice();
		
		if(extraShot) {
			price += EXTRA_SHOT_PRICE;
		}
		
		if(extraSyrup) {
			price += EXTRA_SYRUP_PRICE;
		}
		
		return price;

	}
	
	public boolean equals(Object anotherBev) {
		if (!(anotherBev instanceof Coffee)) {
			return false;
		}
		return ((super.equals(anotherBev)) && (this.extraShot == ((Coffee)anotherBev).extraShot) && (this.extraSyrup == ((Coffee)anotherBev).extraSyrup));
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	public String toString() {
		return super.getBevName() + ","+super.getSize()+"," +extraShot+","+extraSyrup +","+ String.format("%.2f",this.calcPrice());
	}
}
