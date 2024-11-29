public class starpattern {
    public static void main(String[] args) {
        int lines = 5;  // Number of lines in the pattern

        // Outer loop for each line
        for (int i = 1; i <= lines; i++) {
            // Inner loop for printing stars in each line
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}
