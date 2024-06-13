public class unaryOperator {
    public void performOperations(int x) {
        System.out.println("x = " + x);

        System.out.println("--x = " + --x);  
        System.out.println("x-- = " + x--); 
        System.out.println("x = " + x);

       
        System.out.println("++x = " + ++x); 
        System.out.println("x++ = " + x++);  
        System.out.println("x = " + x);
    }
    public static void main(String[] args) {
        unaryOperator u = new unaryOperator();
        u.performOperations(10);
        
        
    } 
}