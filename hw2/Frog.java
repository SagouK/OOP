package homework.hw2;

public class Frog extends Amphibians implements SwimSpeed{

    public Frog(String name, String food) {
        super(name, food);
    }
    
    @Override
    public String toString() {
        return String.format("Frog -> %s, Swim Speed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 8;
    }
}
