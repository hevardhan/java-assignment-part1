package extensions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class I1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int choice;
        do {
            System.out.println("\nFibonacci-Factorial Calculator:");
            System.out.println("Enter 1 to Calculate Factorial");
            System.out.println("Enter 2 to Generate Fibonacci Series");
            System.out.println("Enter 3 to Exit");
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter a positive integer: ");
                    int numFactorial = Integer.parseInt(reader.readLine());
                    long factorialResult = calculateFactorial(numFactorial);
                    System.out.println("Factorial of " + numFactorial + " = " + factorialResult);
                    break;
                case 2:
                    System.out.print("Enter the number of Fibonacci terms: ");
                    int numTerms = Integer.parseInt(reader.readLine());
                    generateFibonacci(numTerms);
                    break;
                case 3:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        } while (choice != 3);
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    private static void generateFibonacci(int numTerms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence (" + numTerms + " terms): ");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
}