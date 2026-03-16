package sri.java.programs;

public class dataVariables {
	
	//Global variables
	
	int id = 146;
	static String name = "Vidya";
	float height = 5.45f;
	double weight = 81.52;
	
	public static void main(String[] args) {
		
		//Local Variable		
		 long phone = 9885685752L;   		 
		
		//To print Global static variable output value			
		System.out.println("My name is : "+name);
		
		//To print Global variable output value	without creating an object
		System.out.println("My ID is : "+new dataVariables().id);
		
		//Object data is created to access the global variables		 
		dataVariables data = new dataVariables(); 
		
		//To print Global variable output value			
		System.out.println("My height(in Inches) is : "+data.height);
		System.out.println("My weight(in Kilograms) is : "+data.weight);  
		
		//To print Local variable output value		
		System.out.println("My phone number is :"+phone);   
	}

}
