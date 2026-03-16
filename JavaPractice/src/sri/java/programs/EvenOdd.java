package sri.java.programs;

import java.util.Scanner;

public class EvenOdd {
	/*Assignment 1: Verify any given number is Even or Odd
	 * Eg:
	 * Input: 5
	 * Output: Given number is Odd
	 * 
	 * Eg:
	 * Input: 4
	 * Output: Given number is Even*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		if(a%2 == 0) {
			System.out.println("The given number is Even");
		}else {
			System.out.println("The given number is Odd");
		}

		sc.close();
	}

}
