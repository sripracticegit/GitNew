package sri.java.programs;

import java.util.Scanner;

public class SwitchStatements {

	/* Syntax:
	switch(key){
		case value1:
			//Statements
			break;
		case value2:
			//Statements
			break;
		default:
			//Statements
			break;
	}
	 */

	public static void main(String[] args) {

		/*Assignment 1: Verify any given number is Even or Odd
		 * Eg:
		 * Input: 5
		 * Output: Given number is Odd
		 * 
		 * Eg:
		 * Input: 4
		 * Output: Given number is Even*/

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your number: ");
		int i = sc.nextInt();
		switch(i%2){
		case 0:
			System.out.println("It's an even number");
			break;
		case 1:
			System.out.println("It's an odd number");
			break;
		default:
			System.out.println("It's an invalid number");
			break;

		}

		/*Assignment 2: Perform Arithmetic operations on two numbers
		 * Enter first number:
		 * 4
		 * Enter second number:
		 * 6
		 * Enter the target arithmetic operator:
		 * +
		 * The result is: 10*/
		double num1, num2, result;
		char operator;
		System.out.println("Enter the first number:");
		num1 = sc.nextDouble();
		System.out.println("Enter the second number:");
		num2 = sc.nextDouble();
		System.out.println("Enter the target arithmetic operator:+,-,*,/,%");

		/*The index 0 refers to the first character in the string.
		For the input string "+"or"-"or"*"or"/"or"%", .charAt(0) extracts the first and only character, 
		which is the + operator, as a char data type.*/
		operator = sc.next().charAt(0);
		switch (operator) {
		case '+':
			result = num1 + num2;		
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;
		case '-':
			result = num1 - num2;		
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
		case '*':
			result = num1 * num2;		
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
		case '/':
			result = num1 / num2;		
			System.out.println(num1 + "/" + num2 + "=" + result);
			break;
		case '%':
			result = num1 % num2;		
			System.out.println(num1 + "%" + num2 + "=" + result);
			break;
		default:
			System.out.println("Invalid input");
			break;

		}


		/* Assignment 3: Print the statement based on day name
		 * Monday to Friday -> Uff, It's a weekday
		 * Saturday & Sunday -> Yayy, It's a weekend
		 **/
		System.out.println("Enter a day number (1-7): ");
		int day = sc.nextInt();
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Uff, It's a weekday");
			break;
		case 6:
		case 7:
			System.out.println("Yayy, It's a weekend");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		sc.close();
	}

}
