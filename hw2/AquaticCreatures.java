package homework.hw2;

public abstract class AquaticCreatures{
    private String name;
    private String food;

    public AquaticCreatures(String name, String food) {
        this.name = name;
        this.food = food;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, food: %s", name, food);
    }

}
