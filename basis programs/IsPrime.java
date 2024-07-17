import java.util.*;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter Number You Want to Check :");
        int num = sc.nextInt();
        for(int div=1;div<=num;div++){
            if(num%div==0){
                count++;
            }
        }
        if(count ==2){
            System.out.println(num+" is Prime Number");
        }else{
            System.out.println(num+" is Not Prime Number ");
        }
        sc.close();
    }
}
