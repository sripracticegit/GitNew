package sri.java.programs;

public class ConditionalStatements {

	public static void main(String[] args) {
		// Conditional statements are if, if-else, if-else-if, nested-if, and switch

		//if statements
		int j=20;
		if(j>0) {
			System.out.println("It's a two digit number");
		}

		//if-else statements
		int i = 10;

		if(i<=0) {
			System.out.println("It's a negative number");
		}
		else {
			System.out.println("It's a positive number");
		}

		//nested-if statements
		String examStatus = "Pass";

		if(examStatus == "Pass") {
			System.out.println("Wait for the first round results");
			String round1Status = "Fail";
			if (round1Status == "Pass") {
				System.out.println("Wait for the second round results");
			}else {
				System.out.println("go to home");
			}
		}else {
			System.out.println("Go to home");
		}
	}
}
