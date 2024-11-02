/* 
 * Class: CMSC203  22355
 * Instructor: David Kuijt
 * Description: Define the class for the overall management company, composing of Property and Plot objects
 * Due: 11/03/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently.  
 * I have not copied the code from a student or any source.  
 * I have not given my code to any student. 
 * Print your Name here: ____John Vu______ 
*/ 
public class ManagementCompany {
	//fields
	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_WIDTH = 10;
	public static final int MGMT_DEPTH = 10;
	private String name;
	private String taxID;
	private double mgmFee;
	private Property[] properties;
	private Plot plot;
	private int numberOfProperties;
	
	//constructors
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0;
		properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		numberOfProperties = 0;
		
	}
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.properties = new Property[MAX_PROPERTY];		
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.numberOfProperties = 0;
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee,int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.properties = new Property[MAX_PROPERTY];		
		this.plot = new Plot(x,y,width, depth);
		this.numberOfProperties = 0;
	}
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.properties = new Property[MAX_PROPERTY];	
		for(int i = 0; i < otherCompany.numberOfProperties; i++) {
			this.properties[i] = new Property(otherCompany.properties[i]);
		}
		this.plot = new Plot(otherCompany.plot);
		this.numberOfProperties = otherCompany.numberOfProperties;
	}
	
	
	public int addProperty(String name, String city, double rent, String owner) {
		Property newProperty = new Property(name, city, rent, owner);
		if (this.isPropertiesFull()) {
			return -1;
		}else if(newProperty == null) {
			return -2;
		} else if(!(this.plot.encompasses(newProperty.getPlot()))) {
			return -3;
		}
		
		int index = 0;
		
		for (int i = 0; i < MAX_PROPERTY; i++) {
			if (this.properties[i] != null && this.properties[i].getPlot().overlaps(newProperty.getPlot())) {
				return -4;
				
				
			} else if (properties[i] == null){
				this.properties[i] = newProperty;
				numberOfProperties++;
				index = i;
				break;
			}
		}
		
		return index;
		
		
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property newProperty = new Property(name, city, rent, owner, x, y, width, depth);
		if (this.isPropertiesFull()) {
			return -1;
		}else if(newProperty == null) {
			return -2;
		} else if(!(this.plot.encompasses(newProperty.getPlot()))) {
			return -3;
		}
		
		int index = 0;
		
		for (int i = 0; i < MAX_PROPERTY; i++) {
			if (this.properties[i] != null && this.properties[i].getPlot().overlaps(newProperty.getPlot())) {
				return -4;
				
				
			} else if (properties[i] == null){
				this.properties[i] = newProperty;
				numberOfProperties++;
				index = i;
				break;
			}
		}
		
		return index;
		
	}
	
	public int addProperty(Property property) {

		if (this.isPropertiesFull()) {
			return -1;
		}else if(property == null) {
			return -2;
		} 
		
		Property newProperty = new Property(property);
		
		if(!(this.plot.encompasses(newProperty.getPlot()))) {
			return -3;
		}
		
		int index = 0;
		
		for (int i = 0; i < MAX_PROPERTY; i++) {
			if (this.properties[i] != null && this.properties[i].getPlot().overlaps(newProperty.getPlot())) {
				return -4;
				
				
			} else if (properties[i] == null){
				this.properties[i] = newProperty;
				numberOfProperties++;
				index = i;
				break;
			}
		}
		
		return index;
		
		
	}
	
	public void removeLastProperty() {
		for(int i = MAX_PROPERTY - 1; i >= 0; i--) {
			if (this.properties[i] != null) {
				numberOfProperties--;
				break;
			}
		}
	}
	
	public boolean isPropertiesFull() {
		if (numberOfProperties == MAX_PROPERTY) {
			return true;
		}
		return false;
	}
	
	public int getPropertiesCount() {
		return numberOfProperties;
	}
	
	public double getTotalRent() {
		double total = 0.0;
		for (int i = 0; i < numberOfProperties; i++) {
			total+=this.properties[i].getRentAmount();
		}
		return total;
	}
	
	public Property getHighestRentProperty() {
		int index = 0;	
		double max = this.properties[0].getRentAmount();
		for(int i = 1; i < numberOfProperties; i++) {
			if (this.properties[i].getRentAmount() > max) {
				index = i;
				max = this.properties[i].getRentAmount();
			}
		}
		return new Property(properties[index]);
	
	}
	
	public boolean isManagementFeeValid() {
		if (mgmFee >= 0 && mgmFee <=100) {
			return true;
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTaxID() {
		return taxID;
	}
	public Property[] getProperties() {
		Property[] newProperties = new Property[MAX_PROPERTY];
		for(int i = 0; i < numberOfProperties; i++) {
			newProperties[i] = new Property(properties[i]);
		}
		return newProperties;
	}
	
	public double getMgmFeePer() {
		return mgmFee;
	}
	
	public Plot getPlot() {
		return new Plot(plot);
	}
	
	@Override
	public String toString() {
		String mgmString = "List of the properties for "+name+", taxID: "+taxID +
			"\n______________________________________________________\n";
		
		for(int i = 0; i < numberOfProperties; i++) {
			mgmString += properties[i] + "\n";
		}
		
		mgmString+="______________________________________________________\n\n"+
			" total management Fee: " + (this.getTotalRent() * (mgmFee / 100));
		return mgmString;
			
		
		
		
	}
	
}
