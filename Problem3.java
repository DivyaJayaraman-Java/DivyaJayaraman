import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter an integer value for a: ");
        int a = sc.nextInt();

        
        int numOfOddNumbers = 2 * a - 1;

        // Generate the series of odd numbers and print them
        for (int i = 1; i <= numOfOddNumbers; i++) {
            System.out.print((2 * i - 1)); 
            if (i < numOfOddNumbers) {
                System.out.print(", ");
            }
        }

    
        System.out.println(); // go to newline

        
        sc.close();
    }
}
