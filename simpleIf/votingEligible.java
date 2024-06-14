package simpleIf;

import java.util.Scanner;

public class votingEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("eligible to vote.");
    }
    scanner.close();
    }}