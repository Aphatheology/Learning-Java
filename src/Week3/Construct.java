package Week3;

import java.util.Scanner;

public class Construct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat;

        do {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            repeat = scanner.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        scanner.close();
    }
}
