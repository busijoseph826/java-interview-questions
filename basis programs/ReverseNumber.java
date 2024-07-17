public class ReverseNumber {
    public static void main(String[] args) {
        int num =123;
        while(num>0){
            int dig= num%10;
            num = num/10;
            System.out.println(dig);
        }
    }
}
