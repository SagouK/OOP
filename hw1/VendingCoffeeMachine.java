package homework.hw1;

import java.util.ArrayList;
import java.util.List;

public class VendingCoffeeMachine {
    private List<CoffeeDrink> listOfDrinks = new ArrayList<>();
    private double cash = 0;

    public List<CoffeeDrink> getListOfDrinks() {
        return listOfDrinks;
    }

    public VendingCoffeeMachine addDrink(CoffeeDrink drink){
        listOfDrinks.add(drink);
        return this;
    }

    public CoffeeDrink findDrinksByName(String name) {
        for (CoffeeDrink coffeeDrink : listOfDrinks) {
            if (name.equals(coffeeDrink.getDrinkName())){
                return coffeeDrink;
            }
        }
        return null;
    }

    public CoffeeDrink sellDrinks(String drink){
        CoffeeDrink founded = findDrinksByName(drink);
        if (founded != null){
            cash = cash + founded.getDrinkPrice();
            listOfDrinks.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder outputOperaions = new StringBuilder();
        outputOperaions.append("---Drinks---")
                        .append("\n");
        for (CoffeeDrink coffeeDrink : listOfDrinks) {
            outputOperaions.append(coffeeDrink)
                            .append("\n");
        }
        
        outputOperaions.append("------------------------------------------")
                        .append("\n")
                        .append("Cash left")
                        .append("\n")
                        .append(cash);
        return outputOperaions.toString();
    }
}
