package operators;
public class minNumbers {
    public static void main(String[] args) {
        int[] array = {80, 40, 30, 50};

        int min = (array[0] < array[1]) ? (array[0] < array[2] ? (array[0] < array[3] ? array[0] : array[3]) : (array[2] < array[3] ? array[2] : array[3])) : (array[1] < array[2] ? (array[1] < array[3] ? array[1] : array[3]) : (array[2] < array[3] ? array[2] : array[3]));

        System.out.println("minimum number is: " + min);
    }
    

}