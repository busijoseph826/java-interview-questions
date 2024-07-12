package array.basic;
import java.util.*;
public class ArrayCopy {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5};
        int n = arr.length;
        int copy [] = new int[n];
        for(int i=0;i<n;i++){
            copy[i]=arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
