/* 
 * Class: CMSC203  22355
 * Instructor: David Kuijt
 * Description: Define the class for the Property object, composing of a Plot object and other fields
 * Due: 11/03/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently.  
 * I have not copied the code from a student or any source.  
 * I have not given my code to any student. 
 * Print your Name here: ____John Vu______ 
*/ 

public class Property {
	//fields
	private String propertyName;
	private String city;
	private double rentAmount;
	private Plot plot;
	private String owner;
	
	//constructors
	public Property() {
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0.0;
		this.plot = new Plot();
		this.owner = "";
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
		this.owner = owner;
	}
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x,y,width,depth);
		this.owner = owner;
	}
	
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.plot = new Plot(otherProperty.plot);
		this.owner = otherProperty.owner;
	}
	
	//getters
	public Plot getPlot() {
		return new Plot(this.plot);
	}
	
	public String getPropertyName() {
		return this.propertyName;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public double getRentAmount() {
		return this.rentAmount;
	}
	
	public String getOwner() {
		return this.owner;
	}
	@Override
	public String toString() {
		return propertyName+","+city+","+owner+","+rentAmount;
	}
	
}
