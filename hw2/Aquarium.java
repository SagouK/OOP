package homework.hw2;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List <AquaticCreatures> listOfCreatures = new ArrayList<>();


    public Aquarium addCreature(AquaticCreatures creature) {
        listOfCreatures.add(creature);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (AquaticCreatures aquaticCreatures : listOfCreatures) {
            builder.append(aquaticCreatures).append("\n");
        }
        return builder.toString();
    }

    public List <SwimSpeed> swimmers(){
        List <SwimSpeed> swimmers = new ArrayList<>();
        for (AquaticCreatures aquaticCreatures : listOfCreatures) {
            if (aquaticCreatures instanceof SwimSpeed) {
                swimmers.add( (SwimSpeed) aquaticCreatures);
            }
        }
        return swimmers;
    }

    public SwimSpeed getSwimChampion() {
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champion = swimmers.get(0);
        for (SwimSpeed swimmer : swimmers) {
            if (champion.getSwimSpeed() < swimmer.getSwimSpeed()){
                champion = swimmer;
            }
        }
        return champion;
    }
}
