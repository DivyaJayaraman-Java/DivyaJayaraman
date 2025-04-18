import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // scanner for get input
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter an integer value for a: ");
        int a = sc.nextInt();

        // Generate and print the series
        for (int i = 1; i <= a; i++) {

            // Print odd numbers from 1 to the i-th odd number
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1)); // gives odd number
                if (j < i) {
                    System.out.print(", "); 
                }
            }
            System.out.println(); 
        }


        sc.close();
    }
}
