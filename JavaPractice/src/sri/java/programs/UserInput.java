package sri.java.programs;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*The Scanner class have different methods i.e.,
		next(): Reads the next token as a String.
		nextLine(): Reads the rest of the current line, including spaces.
		nextInt(): Reads the next token as an int.
		nextDouble(): Reads the next token as a double.
		nextBoolean(): Reads the next token as a boolean.
		nextByte(), nextShort(), nextLong(), nextFloat(): Read the input as the corresponding primitive types.
		nextBigInteger(), nextBigDecimal(): Scan the next token as a BigInteger or BigDecimal.
		close(): Closes the scanner, releasing resources. */
		
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("Hello "+name);
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.printf("Ok, you are %d years old. Thank you for the information ", age);
		sc.close();
		
		System.out.println("It's my first commit");
		System.out.println("It's my second commit");

	}

}
