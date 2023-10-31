package homework.hw2;

/**
 * Fishes
 */
public abstract class Fishes extends AquaticCreatures{

    private String type;

    public Fishes(String name, String type, String food) {
        super(name, food);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Fish | %s, type: %s", super.toString(), type);
    }
}