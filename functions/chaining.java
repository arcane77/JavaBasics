package functions;

class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    Counter increment() {
        this.count++;
        return this;
    }
    Counter decrement() {
        this.count--;
        return this;
    }
    void printCount() {
        System.out.println("Current count: " + this.count);
    }
}

public class chaining {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        myCounter.increment().increment().increment().decrement().printCount();  
    }
}
