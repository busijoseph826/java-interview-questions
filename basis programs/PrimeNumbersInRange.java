import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersInRange {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // Method to get a list of prime numbers in a given range
    public static List<Integer> primeNumbersInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        List<Integer> primes = primeNumbersInRange(start, end);
        System.out.println(primes);
    }
}
