package sorting;
import java.util.*;
/**
 * SelectionSort
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] =new int[]{53,44,87,8,7};
        System.out.println("unsorted array");
        printArray(arr);
        sort(arr);
        System.out.println("sorted array");
        printArray(arr);

    }
    public static void sort(int arr[]){
        int n = arr.length;
        boolean swapped ;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}