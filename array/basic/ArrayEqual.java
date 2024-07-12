public class ArrayEqual {
    public static void main(String[] args) {
        int a[]=new int[] {1,2,3,4};
        int b[]=new int[] {1,2,4,5};
        boolean result = true;
        if(a.length == b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    result = false;
                }
            }
        }
        else{
            result = false;
        }

        if(result == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
