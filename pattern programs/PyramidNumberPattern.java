public class PyramidNumberPattern {
    public static void main(String[] args) {
        int r = 4;  // Number of rows in the pyramid
        
        // Outer loop for rows
        for (int i = 1; i <= r; i++) {
            
            // Inner loop 1: for spaces before numbers
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");  // Two spaces for better formatting
            }
            
            // Inner loop 2: for ascending numbers
            int num = i;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(num + " ");
                if (k < i) {
                    num++;
                } else {
                    num--;
                }
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
