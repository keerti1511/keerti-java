public class pyramid {
        public static void main(String[] args) {
            int n = 4; // Number of levels in the pyramid
    
            for (int i = 1; i <= n; i++) {
                // Print leading spaces
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
    
                // Print stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    }
    
