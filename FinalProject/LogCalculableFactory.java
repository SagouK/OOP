package homework.FinalProject;

public class LogCalculableFactory implements ICalculableFactory{

    Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }


    @Override
    public Operations create(ComplexValue arg) {
        return new LogCalculator(arg, logger);
    }

    
}
