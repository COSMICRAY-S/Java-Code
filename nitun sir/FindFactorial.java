import java.util.Scanner;

public class FindFactorial {
    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorialRecursive(n - 1); // Recursive call
    }

    // Non-recursive (iterative) method to calculate factorial
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number for which factorial is to be calculated
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial using recursive method
        long resultRecursive = factorialRecursive(number);
        System.out.println("Factorial (Recursive): " + resultRecursive);

        // Calculate factorial using iterative method
        long resultIterative = factorialIterative(number);
        System.out.println("Factorial (Non-Recursive): " + resultIterative);

        scanner.close();
    }
}

