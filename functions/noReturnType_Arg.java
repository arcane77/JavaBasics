package functions;

class Calculator {
    void multiply(int a, int b) {
        System.out.println("Multiplication result: " + (a * b));
    }

    void add(int a, int b) {
        System.out.println("Addition result: " + (a + b));
    }
}

public class noReturnType_Arg {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        
        myCalc.multiply(4, 3); 

        myCalc.add(4, 3);       
    }
}
