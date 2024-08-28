 package MyPackage;

import java.util.Scanner;
import MyMathematics.MyIntegerMath;

public class MyDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial using the method from MyIntegerMath class
        long fact = MyIntegerMath.factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);

        // Check if the number is a strong number using the method from MyIntegerMath class
        if (MyIntegerMath.isStrongNumber(number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}
