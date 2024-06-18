package functions;

class Factorial {
    int factorial(int n) {
        if(n == 0) {
            return 1; 
        }
        return n*factorial(n - 1);
    }
}

public class recursion {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int res = fact.factorial(6);
        System.out.println("factorial: " + res);
    }
}