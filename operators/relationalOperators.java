package operators;
public class relationalOperators {

    public void performOperations(int a, int b) {
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    public static void main(String [] args){
        relationalOperators r = new relationalOperators();
        r.performOperations(10, 5);
        
    }
    
    
    
}