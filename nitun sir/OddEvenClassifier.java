public class OddEvenClassifier {

    // Method to check if a number is odd or even
    public static String classifyNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        // Test the classifyNumber method with some examples
        int[] numbers = {3, 8, 15, 42, 27};
        
        System.out.println("Odd/Even Classification:");
        for (int num : numbers) {
            System.out.println("Number " + num + " is " + classifyNumber(num));
        }
    }
}
