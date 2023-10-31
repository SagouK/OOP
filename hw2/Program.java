package homework.hw2;

public class Program {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addCreature(new GoldFish("Джон","Звездочет", "Листья"))
                .addCreature(new Cichlid("Амалия", "Рыба-ангел", "Водоросли"))
                .addCreature(new Salamander("Сал", "Насекомые"))
                .addCreature(new Frog("Кермит", "Насекомые"));

        System.out.println(aquarium);
        for (SwimSpeed swimmer : aquarium.swimmers()) {
            System.out.println(swimmer);
        }

        System.out.println("CHAMPION --> " + aquarium.getSwimChampion());
    }

    
}
