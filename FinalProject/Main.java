package homework.FinalProject;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new Log());
        View view = new View(calculableFactory);
        view.run();
    }
}
