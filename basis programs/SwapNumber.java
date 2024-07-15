
import java.util.*;
public class SwapNumber {
    public static void main(String[] args) {
        int num1 ;
        int num2;
        int temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Numbers ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Numbers before swapping "+num1+" "+num2);
        temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("Numbers After Swapping "+num1+" "+num2);
        sc.close();
        
    }
}
