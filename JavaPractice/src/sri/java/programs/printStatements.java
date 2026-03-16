package sri.java.programs;

public class printStatements {

	public static void main(String[] args) {
		//we have 3 print statements i.e., print, println, printf
		System.out.println("Hello, Good Morning");
		
		System.out.println("I'm 1");
		System.out.println("I'm 2");
		System.out.println("I'm 3");
		
		System.out.print("How are you?\n");
		
		/*formats for printing:
		 *  %b - boolean
		 * %c - character
		 * %d - integer
		 * %e - scientific notation
		 * %f - floating point
		 * %s - string
		 * %tc - complete date and time
		 * %n - a newline on this platform
		 * %% - the character %
		 * */
		System.out.printf("This is %s month and the year is %d\n", "January", 2026 );
		
		//we have output streams(out), input streams(in), and error streams(err) while printing the statements
		System.err.println("This is error statement");
		System.err.print("This is error statement\n");
		System.err.printf("This is %s statement", "error");
	}

}
