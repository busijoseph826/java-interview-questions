package searching;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int target = 4;
        search(arr,target);
    }
    public static void search(int arr[],int target){
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at " + (i + 1) + " position");
                found = true;
                break; // Exit the loop once the element is found
            }
        }
        if(!found){
            System.out.println("Element not found in Array");
        }
    }
}
