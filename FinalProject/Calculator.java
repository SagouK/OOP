package homework.FinalProject;

public class Calculator implements Operations{

    private final ComplexValue complexValue;

    public Calculator(ComplexValue complexValue) {
        this.complexValue = complexValue;
    }

    public void sum(ComplexValue value) {
        int sumReal = complexValue.getUserValueReal() + value.getUserValueReal();
        int sumImaginary = complexValue.getUserValueImaginary() + value.getUserValueImaginary();
        complexValue.setUserValueReal(sumReal);
        complexValue.setUserValueImaginary(sumImaginary);
    }

   
    public void multi(ComplexValue value) {
        int multiReal = (complexValue.getUserValueReal() * value.getUserValueReal()) - (complexValue.getUserValueImaginary() * value.getUserValueImaginary());
        int multiImaginary = (complexValue.getUserValueReal() * value.getUserValueImaginary()) + (value.getUserValueReal() * complexValue.getUserValueImaginary());
        complexValue.setUserValueReal(multiReal);
        complexValue.setUserValueImaginary(multiImaginary);
    }

    public void division(ComplexValue value) {
        int divisionReal = (((complexValue.getUserValueReal() * value.getUserValueReal()) + (complexValue.getUserValueImaginary() * value.getUserValueImaginary())) / 
                            ((value.getUserValueReal() * value.getUserValueReal()) + (value.getUserValueImaginary() * value.getUserValueImaginary())));
        int divisionImaginary = ((value.getUserValueReal() * complexValue.getUserValueImaginary()) - (complexValue.getUserValueReal() * value.getUserValueImaginary())) / 
                            (((value.getUserValueReal() * value.getUserValueReal()) + (value.getUserValueImaginary() * value.getUserValueImaginary())));
        complexValue.setUserValueReal(divisionReal);
        complexValue.setUserValueImaginary(divisionImaginary);                    
    }

    public ComplexValue getResult() {
        return complexValue;
    }
}
