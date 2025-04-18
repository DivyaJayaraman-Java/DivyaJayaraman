import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    // Constructor
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); 
    }

   
    public void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please use add, subtract, multiply, or divide.");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, multiple, divide): ");
        String operation = sc.next();

        //  Calculator object  and perform result
        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        sc.close();
    }
}

