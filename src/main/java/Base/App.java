/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package Base;

import java.util.Scanner;

/*
Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String firstInput = readNum();
        String secondInput = readNum();
        int firstNum = numConversion(firstInput);
        int secondNum = numConversion(secondInput);
        generateOutput(firstInput, secondInput, firstNum, secondNum);
    }

    private static void generateOutput(String firstInput, String secondInput, int first, int sec) {
        int add = first + sec;
        int sub = first - sec;
        int mult = first * sec;
        int div = first/sec;
        System.out.print(String.format("What is the first number? %s\nWhat is the second number? %s\n%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", firstInput, secondInput, first, sec, add, first, sec, sub, first, sec, mult, first, sec, div));
    }

    private static int numConversion(String input) {
        return Integer.parseInt(input);
    }

    private static String readNum() {
        return in.next();
    }
}
