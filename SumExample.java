public class SumExample {
    public static void main(String[] args) {
        // Initialize an array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  // Add each number to sum
        }

        // Print the result
        System.out.println("The sum of the numbers is: " + sum);
    }
}
