package homework.FinalProject;

public class CalculableFactory implements ICalculableFactory{
    public Operations create(ComplexValue arg){
        return new Calculator(arg);
    }
}
