package nestedIf;

import java.util.Scanner;

public class gradeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your score: ");
        int score = scanner.nextInt();

        if (score >= 50) {  
            System.out.println("you passed the exam");
            
            if (score>=90) {
                System.out.println("excellent work");
            } else if (score>=70 && score <=90) {
                System.out.println("good job");
            } else {
                System.out.println(" try to improve");
            }
        } 
        else {
            System.out.println("you did not pass");
        }

        scanner.close();
    }
}
