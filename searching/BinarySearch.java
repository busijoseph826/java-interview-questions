package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int Arr[] = new int[]{23,45,53,65,98};
        int target = 53;
        int result = recursive(Arr, target, 0, Arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
        //iterative(Arr, target);
    }
    public static void iterative(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return; // Element found, exit the method
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
    public static int recursive(int arr[], int target, int low, int high) {
        if (low > high) {
            return -1; // Base case: element not found
        }
    
        int mid = low + (high - low) / 2;   
    
        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] < target) {
            return recursive(arr, target, mid + 1, high);
        } else {
            return recursive(arr, target, low, mid - 1);
        }
    }
    
}
    


