package sri.java.programs;

import java.util.Scanner;

public class PrintDayName {
	/* Assignment 3: Print the statement based on day name
	 * Monday to Friday -> Uff, It's a weekday
	 * Saturday & Sunday -> Yayy, It's a weekend
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is today?");
		String i = sc.next().trim().toLowerCase();
		if(i.equals("monday") || i.equals("tuesday") || i.equals("wednusday") || i.equals("thursday") || i.equals("friday")) {
		System.out.println("Uff, It's a weekday");
		}else if(i.equals("saturday") || i.equals("sunday")) {
			System.out.println("Yayy, It's a weekend");
		}
		sc.close();

	}


}
