package homework.FinalProject;

public class LogCalculator implements Operations{
    private final Calculator calculator;
    private final Logger logger;

    public LogCalculator(ComplexValue arg, Logger logger) {
        this.calculator = new Calculator(arg);
        this.logger = logger;
        logger.writeLog("Первый аргумент: " + arg);
    }

    @Override
    public void sum(ComplexValue complexValue) {
        logger.writeLog("sum with args: " + complexValue);
        calculator.sum(complexValue);
    }

    @Override
    public void multi(ComplexValue complexValue) {
        logger.writeLog("multi with args: " + complexValue);
        calculator.multi(complexValue);
    }

    @Override
    public void division(ComplexValue complexValue) {
        logger.writeLog("division with args: " + complexValue);
        calculator.division(complexValue);
    }

    @Override
    public ComplexValue getResult() {
        ComplexValue result = calculator.getResult();
        logger.writeLog("result: " + result);
        return result;
    }

    
}
