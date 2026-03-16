package sri.java.programs;

import java.util.Scanner;

public class StudentResults {
	/* Assignment 2: Print the Student result based on the grading system
	 * <35 - fail
	 * == 35 - pass
	 * 35 to 70 - third class
	 * 70 to 85 - second class
	 * >85 first class
	 * 
	 * Eg:
	 * input: 75
	 * Output: Student secured second class
	 * 
	 * Eg:
	 * input: 25
	 * Output: Student is failed*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int i = sc.nextInt();
		if (i>=85) {
			System.out.println("Student secured first class");
		}else {
			if(i>=70 && i<85 ) {
				System.out.println("Student secured second class");
			}else {
				if(i>35 && i<70) {
					System.out.println("Student secured third class");
				}else {
					if(i==35) {
						System.out.println("Student passed");
					}else {
						System.out.println("Student failed");
					}

				}
			}
		}
		sc.close();
	}
}













