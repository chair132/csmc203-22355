import java.util.Scanner;


public class PatientDriverApp {
	
	final static String STUDENTNAME = "John Vu";
	final static String MCID = "M21164679";
	final static String DUEDATE = "10/06/2024";
	
	public static void displayPatient(Patient p1) {
		System.out.println(p1);
	}


	public static void displayProcedure(Procedure pr1) {
		System.out.println(pr1);
	}


	public static double calculateTotalCharges(Procedure pr1, Procedure pr2, Procedure pr3) {
		return ((int)((pr1.getProcedureCharges() + pr2.getProcedureCharges() + pr3.getProcedureCharges())*100))/100.0;
	}


	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Patient p1;
		
		//patient
		String firstName, middleName, lastName, address, city, state, phoneNumber, emergencyName, emergencyPhoneNumber;
		int zipCode;
		
		System.out.println("Enter in the patient's first name: ");
        firstName = input.nextLine();

        if (firstName == "") {
        	p1 = new Patient();
        } else {
        	System.out.println("Enter the patient's middle name: ");
            middleName = input.nextLine();

            System.out.println("Enter in the patient's last name: ");
            lastName = input.nextLine();

            System.out.println("Enter in the patient's street address: ");
            address = input.nextLine();

            if (address == "") {
            	p1 = new Patient(firstName, middleName, lastName);
            } else {
            	System.out.println("Enter in the city of the patient's address: ");
	            city = input.nextLine();
	
	            System.out.println("Enter in the state: ");
	            state = input.nextLine();
	
	            System.out.println("Enter in the zip code: ");
	            zipCode = input.nextInt();
	            input.nextLine();
	
	            System.out.println("Enter patient's phone number: ");
	            phoneNumber = input.nextLine();
	
	            System.out.println("Enter in the patient's emergency contact name: ");
	            emergencyName = input.nextLine();
	
	            System.out.println("Enter in the emergency contact phone number: ");
	            emergencyPhoneNumber = input.nextLine();
	            p1 = new Patient(firstName, middleName, lastName, address, city, state, zipCode, phoneNumber, emergencyName, emergencyPhoneNumber);
            }
            	
            
        }
        
		
		
		
		
		
		//procedures
		
		
		Procedure pr1 = new Procedure("Physical Exam", "09/11/2022", "Dr. Johnson", 2400.25 );
	
		Procedure pr2 = new Procedure("X-ray", "08/23/2023");
		
		Procedure pr3 = new Procedure();
		
		
		
		
		
		
		System.out.println("Patient info:");
		displayPatient(p1);
		System.out.println();
		displayProcedure(pr1);
		System.out.println();
		displayProcedure(pr2);
		System.out.println();
		displayProcedure(pr3);
		System.out.println();
		System.out.println("Total Charges: $" +calculateTotalCharges(pr1,pr2,pr3));
		System.out.println();
		System.out.println("Student Name: " + STUDENTNAME);
		System.out.println("MC#: " + MCID);
		System.out.println("Due Date: " + DUEDATE);
		input.close();

	}
	


}
