package homework.hw2;

public class GoldFish extends Fishes implements SwimSpeed{

    public GoldFish(String name, String type, String food) {
        super(name, type, food);
     
    }

    @Override
    public String toString() {
        return String.format("Gold Fish -> %s, Swimp Speed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 6;
    }
}
