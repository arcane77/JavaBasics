import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("enter a number (type 0 to exit): ");
            num = scanner.nextInt();

            if (num > 0) {
                System.out.println("number is positive");
            } else if (num < 0) {
                System.out.println("number is negative");
            } else {
                System.out.println("exiting program");
            }

        } while (num != 0);
        scanner.close();
    }
}
