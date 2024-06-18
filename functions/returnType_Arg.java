package functions;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
}

public class returnType_Arg {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        int sum = operations.add(5, 3);
        System.out.println("Sum is: " + sum);
    }
}
