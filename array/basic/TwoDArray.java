import java.util.*;
public class TwoDArray {

    public static void main(String args[]){
        int m = 3;
        int n= 3;
        display(m, n);
    }
    
    public static void display(int m,int n){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(a[i][j]);
            }
        }
        sc.close();
    }
}