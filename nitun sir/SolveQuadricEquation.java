import java.util.Scanner;

public class SolveQuadricEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for coefficients a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Check if 'a' is zero (not a quadratic equation)
        if (a == 0) {
            System.out.println( "The value of 'a' cannot be zero for a quadratic equation.");   
        } else {
            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;

            // Evaluate based on the discriminant value
            if (discriminant > 0) {
                // Two real and distinct roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots are real and distinct:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                // One real and repeated root
                double root = -b / (2 * a);
                System.out.println("The roots are real and equal:");
                System.out.println("Root: " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The roots are complex and distinct:");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }

        scanner.close();
    }
}

