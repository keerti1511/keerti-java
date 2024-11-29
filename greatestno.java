import java.util.Scanner;

public class greatestno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the greatest number using nested if-else statements
        int greatest;
        if (num1 > num2) {
            greatest = num1;
            if (num1 > num3) {
                greatest = num1;
            } else {
                greatest = num3;
            }
        } else {
            greatest = num2;
            if (num2 > num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}