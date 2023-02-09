import java.util.Scanner;
/**
* Print statements with proper style check.
*
* @author  Mr. Riscalas
* @version 1.0
* @since   2023-02-08
*/

public final class MathOperators {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     *
     */
    public static void main(final String[] args) {
        // Created a scanner object
        final Scanner myObj = new Scanner(System.in);
        // Ask the user what they want to calculate.
        System.out.print("What would you like to calculate? ");
        System.out.print("(1: Addition, 2: Subtraction, 3: Multiplication, ");
        System.out.println("4: Division, 5: Exponential, 6: Square root)");
        final int operation = myObj.nextInt();
        // If statement to organize what operation.
        if (operation == 1) {
            System.out.println("You chose to add!");
            System.out.println("What is the first number you'd like to add?");
            final int num1 = myObj.nextInt();
            System.out.println("What would you like to add to that?");
            final int num2 = myObj.nextInt();
            final int ans = num1 + num2;
            System.out.println("The answer to this addition problem is " + ans);
        } else if (operation == 2) {
            System.out.println("You chose to subtract!");
            System.out.println("What number would you like to subtract from?");
            final int num1 = myObj.nextInt();
            System.out.println("What is the value of that subtraction?");
            final int num2 = myObj.nextInt();
            final int ans = num1 - num2;
            System.out.print("The answer to this subtraction ");
            System.out.println("problem is " + ans);
        } else if (operation == 3) {
            System.out.println("You chose to multiply!");
            System.out.print("What is the first number you'd like to");
            System.out.println(" multiply?");
            final int num1 = myObj.nextInt();
            System.out.println("What would you like to multiply it by?");
            final int num2 = myObj.nextInt();
            final int ans = num1 * num2;
            System.out.print("The answer to ");
            System.out.println("this multiplication problem is " + ans);
        } else if (operation == 4) {
            System.out.println("You chose to Divide!");
            System.out.println("What is the quotient?");
            final double num1 = myObj.nextInt();
            System.out.println("What is the divisor?");
            final double num2 = myObj.nextInt();
            final double ans = num1 / num2;
            System.out.println("The answer to this dividing problem is " + ans);
        } else if (operation == 5) {
            System.out.println("You chose to do Exponential operations!");
            System.out.println("What is the base number?");
            final int num1 = myObj.nextInt();
            System.out.println("What would you like the power to be?");
            final int num2 = myObj.nextInt();
            final double ans = Math.pow(num1, num2);
            System.out.print("The answer to this");
            System.out.println(" exponential problem is " + ans);
        } else if (operation == 6) {
            System.out.println("What number would you like to square root?");
            final int num1 = myObj.nextInt();
            final double ans = Math.sqrt(num1);
            System.out.println("Your number square rooted is " + ans);
        }
    }
}
