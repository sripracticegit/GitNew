package sri.java.programs;

public class Methods {
	static int currentBalance = 10000;
	
	// Static method uses 'Static' keyword 
	public static void greetMembers() {
		System.out.println("Welcome to the bank");
	}
	
	//Non-static methods; To access non-static methods we need an Object and 
	
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.printf("%d credited to your account \n", amount);
	}
	
	public void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.printf("%d debited from your account \n", amount);
		
	}
	public static int getcurrentBalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
		greetMembers();
		Methods a = new Methods();
		System.out.println("My current balance is :"+currentBalance);
		a.deposit(5000);
		System.out.println("My current balance is :"+currentBalance);
		a.withdrawal(5000);
		System.out.println("My current balance is :"+currentBalance);
	}

}
