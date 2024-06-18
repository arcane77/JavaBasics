package functions;

class CookingProcess {
    void washIngredients() {
        System.out.println("wash ingredients");
    }

    void chopIngredients() {
        System.out.println("chop ingredients");
    }

    void cookIngredients() {
        System.out.println("cook ingredients");
    }

    void serveDish() {
        System.out.println("serve dish");
    }
}

public class sequence {
    public static void main(String[] args) {
        CookingProcess makeSalad = new CookingProcess();
        makeSalad.washIngredients();  
        makeSalad.chopIngredients();  
        makeSalad.cookIngredients();  
        makeSalad.serveDish();       
    }}

