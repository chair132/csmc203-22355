
public class Procedure {
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double procedureCharges;

	public Procedure() {
		this.procedureName ="Blood Test";
		this.procedureDate ="10/23/2024";
		this.practitionerName = "Dr. Smith";
		this.procedureCharges = 1250;
	}

	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = "Dr. Ivy";
		this.procedureCharges = 1000;
	}

	 

	public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
		this.procedureName =procedureName;
		this.procedureDate =procedureDate;
		this.practitionerName = practitionerName;
		this.procedureCharges = procedureCharges;
	}

	

	public String getProcedureName() {
		return procedureName;
	}

	

	public String getProcedureDate() {
		return procedureDate;
	}

	

	public String getPractitionerName() {
		return practitionerName;
	}

	

	public double getProcedureCharges() {
		return procedureCharges;
	}

	

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	

	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}

	

	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}

	

	public void setProcedureCharges(double procedureCharges) {
		this.procedureCharges = procedureCharges;
	}

	

	public String toString() {
		return "\tProcedure: "+procedureName + "\n\tProcedureDate=" + procedureDate + "\n\tPractitioner=" + practitionerName + "\n\tCharge=" +procedureCharges;
	}

	


}
