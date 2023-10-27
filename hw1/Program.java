package homework.hw1;

public class Program {
    public static void main(String[] args) {
        VendingCoffeeMachine coffeeMachine = new VendingCoffeeMachine();
        coffeeMachine.addDrink(new CoffeeDrink("Espresso", 350, 80, 100))
                        .addDrink(new CoffeeDrink("Americano" , 250, 75, 120))
                        .addDrink(new CoffeeDrink("Capuccino", 400, 70, 150))
                        .addDrink(new CoffeeDrink("Latte", 250, 65, 150));

        System.out.println(coffeeMachine);
        System.out.println("------------------------------------------");
        System.out.println(coffeeMachine.sellDrinks("Espresso"));
        System.out.println(coffeeMachine);
        System.out.println(coffeeMachine.sellDrinks("Latte"));
        System.out.println(coffeeMachine);
    }
}
