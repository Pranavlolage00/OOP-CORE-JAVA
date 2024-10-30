import java.util.Scanner;

class CheckPrime {
    public boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        if (num == 2) return true; // 2 is the only even prime number
        if (num % 2 == 0) return false; // Exclude even numbers greater than 2

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, it's prime
    }
}

public class Prime01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckPrime checkPrime = new CheckPrime();

        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        if (checkPrime.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
} 