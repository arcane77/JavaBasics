package functions;

class Car {
    void startEngine() {
        System.out.println("engine started");
    }
}

public class noReturnType_noArg {
    public static void main(String[] args) {
        Car car = new Car();
       car.startEngine();  }
}
