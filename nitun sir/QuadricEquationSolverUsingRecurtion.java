import java.util.Scanner;

public class QuadricEquationSolverUsingRecurtion{
    public static void main(String[] args) {
        // Coefficients of the quadratic equation ax^2 + bx + c = 0
        /*double a = 1;
        double b = -3;
        double c = 2;*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Call recursive method to solve the equation
        solveQuadratic(a, b, c, 0);
    }

    // Recursive method to calculate the discriminant
    public static double calculateDiscriminant(double b, double a, double c) {
        return b * b - 4 * a * c;
    }

    // Recursive method to calculate the square root
    public static double calculateSquareRoot(double number, double guess) {
        if (Math.abs(guess * guess - number) < 1e-6) { // Convergence condition
            return guess;
        }
        // Recursive formula for improving the guess
        return calculateSquareRoot(number, (guess + number / guess) / 2);
    }

    // Recursive method to solve the quadratic equation
    public static void solveQuadratic(double a, double b, double c, int step) {
        if (step == 0) { // Initial step, calculate discriminant
            double discriminant = calculateDiscriminant(b, a, c);
            solveQuadratic(a, b, discriminant, 1);
        } else if (step == 1) { // Second step, check discriminant and solve
            double discriminant = c;
            if (discriminant > 0) {
                // Calculate roots using recursion for square root
                double sqrtDiscriminant = calculateSquareRoot(discriminant, discriminant / 2);
                double root1 = (-b + sqrtDiscriminant) / (2 * a);
                double root2 = (-b - sqrtDiscriminant) / (2 * a);
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Root: " + root);
            } else {
                System.out.println("No real roots. Discriminant is negative.");
            }
        }
    }
}
