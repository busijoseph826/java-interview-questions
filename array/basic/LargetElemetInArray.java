package array.basic;
public class LargetElemetInArray{
    public static void main(String[] args) {
        int arr[] = new int[]{23,45,12,98,53};
        iterative(arr);
    }
    public static void iterative(int Arr[]){
        int n = Arr.length;
        int max = Arr[0];
        for(int i=0;i<n;i++){
            if(Arr[i]>max)
                max = Arr[i];
        }
        System.out.println(max);
    }
    
}