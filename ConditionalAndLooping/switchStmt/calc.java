package switchStmt;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("enter an operator: ");
        char operator = scanner.next().charAt(0);
        
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("result: " + result);
                break;

            case '%':
                result = num1 % num2;
                System.out.println("result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("division by zero is not allowed");
                }
                break;

            default:
                System.out.println("invalid operator.");
                break;
        }

        scanner.close();
    }
}
