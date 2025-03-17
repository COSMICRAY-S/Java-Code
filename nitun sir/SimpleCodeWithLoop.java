
public class SimpleCodeWithLoop  {
    public static void main(String[] args) {
        int sum = 0;

        // Using a for loop to calculate the sum
        for (int i = 1; i <= 10; i++) {
            sum += i; // Add each number to the sum
            
            System.out.print(i);
            if(i!=10)
            System.out.print(" + ");
        }

        // Print the result
        System.out.println(" = "+sum+"\nThe sum of the first 10 natural numbers is: " + sum);
    }
}

