package strings.basic;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Joseph";
        isReverse(s);
    }
    public static void isReverse(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev +s.charAt(i);
        }
        System.out.println(rev);
    }
    
}
