package ifElseIf;
import java.util.Scanner;

public class compareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else if (num1 == num2) {
            System.out.println("num1 is equal to num2");
        } else {
            System.out.println("num1 is less than num2");
        }

        scanner.close();
    }
}
