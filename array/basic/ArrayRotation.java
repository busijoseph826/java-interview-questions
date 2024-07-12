import java.util.*;
public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int temp[]=new int[arr.length];
        int d = 2;
        int k =0;
        for(int i=d;i<arr.length;i++){
            temp[k]=arr[i];
            k++;
        }
        for (int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        
        System.out.println(Arrays.toString(temp));
    }
}
