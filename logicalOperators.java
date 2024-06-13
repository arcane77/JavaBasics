public class logicalOperators {

    public void Operations(boolean a, boolean b) {
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + !a);
    }
    public static void main(String[] args) {
        logicalOperators l = new logicalOperators();
        l.Operations(true, true);
        
}}