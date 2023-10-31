package homework.hw2;

public abstract class Amphibians extends AquaticCreatures{

    public Amphibians(String name, String food) {
        super(name, food);
    }
    
    @Override
    public String toString() {
        return String.format("Amphibians | %s", super.toString());
    }
}
