package strings.basic;

/**
 * Palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "Agni";
        s=s.toLowerCase();
        //boolean res = isPalindrome(s);
        boolean res = twoPointerMethod(s);
        System.out.println(res);
    }
    public static boolean isPalindrome(String s){
        String rev = "";
        boolean ans = false;
        for(int i=s.length()-1;i>=0;i--){
            rev = rev +s.charAt(i);
        }
        if(s.equals(rev)){
            ans = true;
        }
        return ans;
    }
    public static boolean twoPointerMethod(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}