package operators;
public class arithmetic {
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.Operations(10, 2);
        
    }  

    public void Operations(int a, int b) {
        System.out.println("arithmetic operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
      
}