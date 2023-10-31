package homework.hw2;

public class Cichlid extends Fishes implements SwimSpeed{

    public Cichlid(String name, String type, String food) {
        super(name, type, food);
    }

    @Override
    public String toString() {
        return String.format("Cichlid -> %s, Swim Speed: %d", super.toString(), getSwimSpeed());
    }
    
    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
