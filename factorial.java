public class factorial {
    public static void main(String[] args) {
        int number = 1;
        
        while (number <= 10) {
            long factorial = 1; 
            
            int temp = number; 
            
            
            while (temp > 0) {
                factorial *= temp;
                temp--;
            }
            
            System.out.println("Factorial of " + number + " is " + factorial);
            
            number++; 
        }
    }
}
