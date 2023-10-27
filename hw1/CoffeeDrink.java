package homework.hw1;

/**
 * CoffeeDrink
 */
public class CoffeeDrink {

    private String drinkName;
    private int drinkVolume;
    private double drinkTemperature;
    private double drinkPrice;


    public CoffeeDrink(String drinkName, int drinkVolume, double drinkTemperature, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkVolume = drinkVolume;
        this.drinkTemperature = drinkTemperature;
        this.drinkPrice = drinkPrice;
    }


    public String getDrinkName() {
        return drinkName;
    }


    public int getDrinkVolume() {
        return drinkVolume;
    }


    public double getDrinkTemperature() {
        return drinkTemperature;
    }


    public double getDrinkPrice() {
        return drinkPrice;
    }


    @Override
    public String toString() {
        return String.format("Name: %s | Volume: %d | Temperature: %f | Price: %f", drinkName, drinkVolume, drinkTemperature, drinkPrice);
    }

}