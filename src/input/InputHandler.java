package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    private static Scanner scanner = new Scanner(System.in);

    public static double getNonNegativeDouble(String prompt) {
        double value = 0;
        boolean isValid = false;

        do {
            try {
                System.out.println(prompt);
                value = scanner.nextDouble();
                isValid = true;

                if (value < 0) {
                    System.out.println("Please enter a valid non-negative value.");
                    isValid = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid numeric value.");
                scanner.next(); // consume the invalid input
            }
        } while (!isValid);

        return value;
    }
    
    public static int getNonNegativeInt(String prompt) {
        int value = 0;
        boolean isValid = false;

        do {
            try {
                System.out.println(prompt);
                value = scanner.nextInt();
                isValid = true;

                if (value < 0) {
                    System.out.println("Please enter a valid non-negative value.");
                    isValid = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid numeric value.");
                scanner.next(); // consume the invalid input
            }
        } while (!isValid);

        return value;
    }
}