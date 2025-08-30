public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this value to compute factorial of a different number
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
