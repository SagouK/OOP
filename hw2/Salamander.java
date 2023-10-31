package homework.hw2;

public class Salamander extends Amphibians implements SwimSpeed{

    public Salamander(String name, String food) {
        super(name, food);
       
    }
    
    @Override
    public String toString() {
        return String.format("Salamander -> %s, Swim Speed: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed(){
        return 15;
    }
}
