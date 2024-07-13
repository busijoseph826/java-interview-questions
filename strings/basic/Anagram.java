package strings.basic;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        char[] str1 = {'a','b','c','d'};
        char[] str2 = {'b','a','c','d'};
        isAnagram(str1, str2);
    }
    
    public static void isAnagram(char s1[], char s2[]) {
        int n1 = s1.length;
        int n2 = s2.length;
        
        if (n1 != n2) {
            System.out.println("Not an Anagram");
            return;
        }
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for (int i = 0; i < n1; i++) {
            if (s1[i] != s2[i]) {
                System.out.println("Not an Anagram");
                return;
            }
        }
        
        System.out.println("Anagram");
    }
}
