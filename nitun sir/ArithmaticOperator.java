public class ArithmaticOperator {
    public static void main(String[] args) {
        // Declare two numbers
         double num1 = 20.5;
         double num2 = 10;
    
        // Perform arithmetic operations
        double sum = num1 + num2;         // Addition
        double difference = num1 - num2; // Subtraction
        double product = num1 * num2;    // Multiplication
        double quotient = num1 / num2;   // Division
        double remainder = num1 % num2;  // Modulus (remainder)
    
        // Print the results
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + (num1+num2));
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    
}
