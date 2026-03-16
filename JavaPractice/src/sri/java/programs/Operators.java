package sri.java.programs;

public class Operators {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		//Arithmetic operators: +, -, *, /, %
		System.out.println("Arithmetic operators:");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		//Unary operators: increment(++), decrement(--)
		System.out.println("Unary operators:");
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(b);

		//Relational operators: ==, !=, >, <, >=, <=
		System.out.println("Relational operators:");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);

		//Conditional operators: &&, ||
		System.out.println("Conditional operators:");
		System.out.println(a>b && a==b);
		System.out.println(a>b || a==b);

		/*&&
		 * true - true -> true
		 * true false -> false
		 * false true -> false
		 * false false -> false
		 */
		System.out.println(a>b && a!=b);
		System.out.println(a>b && a==b);
		System.out.println(a<b && a!=b);
		System.out.println(a<b && a==b);

		/* ||
		 * true - true -> true
		 * true - false -> true
		 * false - true -> true
		 * false - false ->false
		 * */
		System.out.println(a>b || a!=b);
		System.out.println(a>b || a==b);
		System.out.println(a<b || a!=b);
		System.out.println(a<b || a==b);

		//Assignment operators: =, +=, -=, *=, /=, %=
		System.out.println("Assignment operators:");
		int i = 5;
		System.out.println(i);
		i += 5;
		System.out.println(i);
		i -= 5;
		System.out.println(i);
		i *= 5;
		System.out.println(i);
		i /= 5;
		System.out.println(i);
		i %= 5;
		System.out.println(i);
		/* In Java, the expression k = i++ + ++i + i-- - --i; 
		 * with an initial i = 10 is evaluated from left to right. 
----------step-by-step breakdown of the evaluation-----------
i++ (first operand)
The current value of i (10) is used in the expression.
i is then incremented to 11.
The expression state is now: k = 10 + ++i + i-- - --i;
Current value of i in memory: 11

++i (second operand)
i is first incremented to 12.
The new value of i (12) is used in the expression.
The expression state is now: k = 10 + 12 + i-- - --i;
Current value of i in memory: 12

i-- (third operand)
The current value of i (12) is used in the expression.
i is then decremented to 11.
The expression state is now: k = 10 + 12 + 12 - --i;
Current value of i in memory: 11

--i (fourth operand)
i is first decremented to 10.
The new value of i (10) is used in the expression.
The expression state is now: k = 10 + 12 + 12 - 10;
Current value of i in memory: 10

Final Calculation
The arithmetic operations are performed from left to right:
10 + 12 = 22
22 + 12 = 34
34 - 10 = 24
The value 24 is assigned to k. 
The final values in Java will be k = 24 and i = 10. */

		i=10;

		int k=i++ + ++i  + i-- - --i;
		System.out.println(k);
		System.out.println(i);





	}

}
