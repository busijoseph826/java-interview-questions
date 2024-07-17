import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number You Want to Check :");
        // Read the integer input from the user
        int num = sc.nextInt();
        // Call the prime method to check if the number is prime
        prime(num);
    }

    // Method to check if a number is prime
    public static void prime(int num){
        int count = 0;
        // Loop through all numbers from 1 to num
        for(int div = 1; div <= num; div++){
            // If div is a divisor of num, increment count
            if(num % div == 0){
                count++;
            }
        }
        // A prime number has exactly 2 divisors: 1 and itself
        if(count == 2){
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not Prime Number ");
        }
    }
}
