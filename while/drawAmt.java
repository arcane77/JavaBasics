public class drawAmt {
    public static void main(String[] args) {
        int amount = 10000; 

        while (amount >= 0) {
            System.out.println("current amount: " + amount);
            amount -= 2000;
        }

        System.out.println("balance after withdrawals: " + amount);
    }
}
