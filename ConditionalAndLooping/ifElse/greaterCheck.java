package ifElse;

import java.util.Scanner;

public class greaterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = scanner.nextInt();

        if (num >= 10) {
            System.out.println(num +" "+"is greater than or equal to 10");
        } else {
            System.out.println(num +" "+"is smaller than 10");
        }

        scanner.close();
    }
}

